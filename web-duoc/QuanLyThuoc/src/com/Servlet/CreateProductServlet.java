package com.Servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.lang3.math.NumberUtils;

import com.Controller.LoaiSPController;
import com.Controller.SanPhamController;
import com.Model.LoaiSp;
import com.Model.SanPham;
import com.Util.MyUtil;

@WebServlet(urlPatterns = { "/createProduct" })
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024 * 10,
        maxFileSize = 1024 * 1024 * 50,
        maxRequestSize = 1024 * 1024 * 100
)
public class CreateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// location to store file uploaded
	private static final String UPLOAD_DIR = "images";

	public CreateProductServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtil.getStoredConnection(request);
		LoaiSPController lspc = new LoaiSPController();
		List<LoaiSp> lstLoaiSP = new ArrayList<LoaiSp>();
		try {
			lstLoaiSP = lspc.getListAllLoaiSP(conn);
			request.setAttribute("lstLoaiSp", lstLoaiSP);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			request.setAttribute("errorMsg", "thuc  hien cau sql that bai");
		}
		RequestDispatcher dispatcher = this.getServletContext()
				.getRequestDispatcher("/WEB-INF/admin/createProduct.jsp");

		dispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// updateImages(request, response);
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		Connection conn = MyUtil.getStoredConnection(request);

		SanPham sp = new SanPham();
		sp.setTenSp(request.getParameter("tensp"));
		sp.setUrl(uploadFile(request));
		sp.setMaLoai(request.getParameter("loaisp"));
		sp.setChude(request.getParameter("title"));
		sp.setSoluong(NumberUtils.toInt(request.getParameter("soluong")));
		sp.setGia(NumberUtils.toInt(request.getParameter("gia")));
		sp.setXuatXu(request.getParameter("xuatxu"));
		sp.setMoTa(request.getParameter("mota"));
		if (checkValidate(request, response)) {
			LoaiSPController lspc = new LoaiSPController();
			List<LoaiSp> lstLoaiSP = new ArrayList<LoaiSp>();
			try {
				lstLoaiSP = lspc.getListAllLoaiSP(conn);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("lstLoaiSp", lstLoaiSP);
			request.setAttribute("product", sp);
			RequestDispatcher dispatcher = request.getServletContext()
					.getRequestDispatcher("/WEB-INF/admin/createProduct.jsp");
			dispatcher.forward(request, response);
		} else {
			SanPhamController spc = new SanPhamController();
			try {
				boolean index = spc.insertSP(conn, sp);
				if (index == true) {
					// updateImages(request, response);
					response.sendRedirect(request.getContextPath() + "/managerProduct");
				} else {
					RequestDispatcher dispatcher = request.getServletContext()
							.getRequestDispatcher("/WEB-INF/admin/createProduct.jsp");
					dispatcher.forward(request, response);
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				request.setAttribute("errorMsg", "thuc  hien cau sql that bai");
			}
		}
	}

	private String uploadFile(HttpServletRequest request) throws IOException, ServletException {
        String fileName = "";
        try {
            Part filePart = request.getPart("photo");

            //fileName: picture-001.jpg
            fileName = (String) getFileName(filePart);

            //applicationPath: C:\Users\Lonely\Documents\NetBeansProjects\Shop_Bonfire\build\web
            String applicationPath = request.getServletContext().getRealPath("");

            //File.separator: \ 
            String basePath = applicationPath + File.separator + UPLOAD_DIR + File.separator;

            InputStream inputStream = null;
            OutputStream outputStream = null;
            try {
                File outputFilePath = new File(basePath + fileName);
                inputStream = filePart.getInputStream();
                outputStream = new FileOutputStream(outputFilePath);
                int read = 0;
                final byte[] bytes = new byte[1024];
                while ((read = inputStream.read(bytes)) != -1) {
                    outputStream.write(bytes, 0, read);
                }
            } catch (Exception e) {
                e.printStackTrace();
                fileName = "";
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            }
        } catch (Exception e) {
            fileName = "";
        }
        return fileName;
    }

    private String getFileName(Part part) {
        final String partHeader = part.getHeader("content-disposition");
        System.out.println("*****partHeader :" + partHeader);
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
    }
	
	private boolean checkValidate(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		boolean check = false;
		if (request.getParameter("tensp").isEmpty()) {
			check = true;
			request.setAttribute("error", "Tên sản phẩm không được để null");
		}

		if (!check && request.getParameter("title").isEmpty()) {
			check = true;
			request.setAttribute("error", "Chủ đề không được để null");
		}

		if (!check && request.getParameter("gia").isEmpty()) {
			check = true;
			request.setAttribute("error", "Giá không được để null");
		}

		if (check) {
			return true;
		}
		return false;
	}

//	@SuppressWarnings("unused")
//	private void updateImages(HttpServletRequest request, HttpServletResponse response)
//			throws IOException, ServletException {
//		if (!ServletFileUpload.isMultipartContent(request)) {
//			// if not, we stop here
//			return;
//		}
//		// configures upload settings
//		DiskFileItemFactory factory = new DiskFileItemFactory();
//		// sets memory threshold - beyond which files are stored in disk
//		factory.setSizeThreshold(MEMORY_THRESHOLD);
//		// sets temporary location to store files
//		factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
//
//		ServletFileUpload upload = new ServletFileUpload(factory);
//
//		// sets maximum size of upload file
//		upload.setFileSizeMax(MAX_FILE_SIZE);
//
//		// sets maximum size of request (include file + form data)
//		upload.setSizeMax(MAX_REQUEST_SIZE);
//
//		// constructs the directory path to store upload file
//		// this path is relative to application's directory
//		String uploadPath = getServletContext().getRealPath("") + File.separator + UPLOAD_DIRECTORY;
//
//		// creates the directory if it does not exist
//		File uploadDir = new File(uploadPath);
//		if (!uploadDir.exists()) {
//			uploadDir.mkdir();
//		}
//
//		try {
//			// parses the request's content to extract file data
//			List<FileItem> formItems = upload.parseRequest(request);
//
//			if (formItems != null && formItems.size() > 0) {
//				// iterates over form's fields
//				for (FileItem item : formItems) {
//					// processes only fields that are not form fields
//					if (!item.isFormField()) {
//						String fileName = new File(item.getName()).getName();
//						String filePath = uploadPath + File.separator + fileName;
//						File storeFile = new File(filePath);
//						// saves the file on disk
//						item.write(storeFile);
//					}
//				}
//			}
//		} catch (Exception ex) {
//			request.setAttribute("message", "There was an error: " + ex.getMessage());
//		}
//	}
}
