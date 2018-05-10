package com.Servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Controller.LoaiSPController;
import com.Model.LoaiSp;
import com.Util.MyUtil;

/**
 * Servlet implementation class ListCategory
 */
@WebServlet(urlPatterns = { "/ManagerCategory" })
public class ManagerCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ManagerCategory() {
		super();
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
		List<LoaiSp> lsp = new ArrayList<LoaiSp>();

		String command = "load";
		String maLoai = null;
		command = request.getParameter("command") != null ? request.getParameter("command") : command;
		RequestDispatcher dispatcher = null;
		switch (command) {
		case "load":
			try {
				lsp = lspc.getListAllLoaiSP(conn);
				request.setAttribute("lstLoaiSP", lsp);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				request.setAttribute("errorMsg", "thuc  hien cau sql that bai");
			}
			dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/admin/Category/managerCategory.jsp");
			dispatcher.forward(request, response);
			break;
		case "insert":
			dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/admin/Category/createCategory.jsp");
			dispatcher.forward(request, response);
			break;
		case "delete":
			maLoai = request.getParameter("maloai");
			try {
				boolean index = lspc.deletCategory(conn, maLoai);
				lsp = lspc.getListAllLoaiSP(conn);
				request.setAttribute("lstLoaiSP", lsp);
				if (index) {
					request.setAttribute("error", "Xoa thanh cong");
				} else {
					request.setAttribute("error", "Xoa that bai");
				}
				dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/admin/Category/managerCategory.jsp");
				dispatcher.forward(request, response);

			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				request.setAttribute("error", "Xoa that bai");
			}
			break;
		case "edit":
			maLoai = request.getParameter("maloai");
			try {
				LoaiSp loaiSP = lspc.getLoaiSPbyMaLoai(conn, maLoai);
				request.setAttribute("category", loaiSP);
				dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/admin/Category/editCategory.jsp");
				dispatcher.forward(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:
			dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/admin/Category/managerCategory.jsp");
			dispatcher.forward(request, response);
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtil.getStoredConnection(request);
		LoaiSPController lspc = new LoaiSPController();
		LoaiSp lsp = new LoaiSp();

		String command = "load";
		boolean index = true;
		command = request.getParameter("command") != null ? request.getParameter("command") : command;
		switch (command) {
		case "insert":
			if (checkValidate(request, response)) {
				lsp.setTenLoai(request.getParameter("tenlsp"));
				request.setAttribute("category", lsp);
				RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/admin/Category/createCategory.jsp");
				dispatcher.forward(request, response);
			} else {

				lsp.setTenLoai(request.getParameter("tenlsp"));
				index = lspc.insertCategory(conn, lsp);

				if (index) {
					response.sendRedirect(request.getContextPath() + "/ManagerCategory");
				} else {
					response.sendRedirect(request.getContextPath() + "/ManagerCategory?command=insert");
					request.setAttribute("category", lsp);
				}
			}
			break;
		case "edit":
			lsp.setTenLoai(request.getParameter("tenlsp"));
			lsp.setMaLoai(request.getParameter("maloai"));
			index = lspc.updateLoaiSP(conn, lsp);
			if (index) {
				response.sendRedirect(request.getContextPath() + "/ManagerCategory");
			} else {
				request.setAttribute("error", "update thất bại");
				response.sendRedirect(request.getContextPath() + "/ManagerCategory?command=insert");
				request.setAttribute("category", lsp);
			}
			break;
		default:
			break;
		}
	}

	private boolean checkValidate(HttpServletRequest request, HttpServletResponse response) {
		boolean index = true;
		// check parameter is null
		if (request.getParameter("tenlsp").isEmpty()) {
			index = false;
			request.setAttribute("error", "Vui Lòng Nhập Tên Loại Sản Phẩm");
		}
		// check max length parameter
		if (index && (request.getParameter("tenlsp").length() <= 5 || request.getParameter("tenlsp").length() > 100)) {
			index = false;
			request.setAttribute("error", "Ký tự nhập vào phải từ 5 đến 100 ký tự");
		}
		if (!index) {
			return true;
		}
		return false;
	}
}
