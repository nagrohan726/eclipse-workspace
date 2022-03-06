package com.rohan.cnp.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import com.rohan.cnp.dao.CouponDAO;
import com.rohan.cnp.dao.ProductDAO;
import com.rohan.cnp.model.Coupon;
import com.rohan.cnp.model.Product;

/**
 * Servlet implementation class ProductController
 */
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private CouponDAO cdao = new CouponDAO();
	private ProductDAO pdao = new ProductDAO();
	private Product product = new Product();

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String description = request.getParameter("description");
		String price = request.getParameter("price");
		String couponCode = request.getParameter("couponCode");

		Coupon coupon = cdao.findByCode(couponCode);

		product.setName(name);
		product.setDescription(description);
		product.setPrice(new BigDecimal(price).subtract(coupon.getDiscount()));

		pdao.save(product);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.print("<b>Product Created!!</b>");
		out.print("<br/><br/><a href='/CouponAndProductApp'>Home</a>");

	}

}
