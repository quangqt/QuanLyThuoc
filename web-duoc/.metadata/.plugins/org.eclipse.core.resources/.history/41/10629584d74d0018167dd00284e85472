package com.Servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Controller.SanPhamController;
import com.Model.SanPham;

/**
 * Servlet implementation class SanPhamServlet
 */
@WebServlet(urlPatterns = { "/home"})
public class SanPhamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public SanPhamServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/view/homeView.jsp");

		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// SanPhamController spc = new SanPhamController();
		// SanPham sp = new SanPham();
		// sp.setTenSp(request.getParameter("TenSP"));
		// sp.setXuatXu(request.getParameter("xuatxu"));
		// sp.setUrl(request.getParameter("images"));
		// sp.setGia(100);
		// sp.setSoluong(100);
		// sp.setMaLoai("1");
		// sp.setMoTa(request.getParameter("editor"));
		// try {
		// boolean index = spc.insertSP(sp);
		// if (index) {
		// response.sendRedirect("index.jsp");
		// }
		// } catch (SQLException ex) {
		// Logger.getLogger(SanPhamServlet.class.getName()).log(Level.SEVERE, null, ex);
		// } catch (ClassNotFoundException ex) {
		// Logger.getLogger(SanPhamServlet.class.getName()).log(Level.SEVERE, null, ex);
		// }
		doGet(request, response);
	}

}
