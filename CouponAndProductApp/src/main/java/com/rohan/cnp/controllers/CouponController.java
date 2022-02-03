package com.rohan.cnp.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import com.rohan.cnp.dao.CouponDAO;
import com.rohan.cnp.model.Coupon;

/**
 * Servlet implementation class CouponController
 */
public class CouponController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CouponDAO dao = new CouponDAO();
	private Coupon coupon = new Coupon();

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");

		if (action.equals("create")) {
			createCoupon(request, response);
		} else if (action.equals("find")) {
			findCoupon(request, response);
		}

	}

	private void createCoupon(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String couponCode = request.getParameter("couponCode");
		String discount = request.getParameter("discount");
		String expiryDate = request.getParameter("expiryDate");

		coupon.setCode(couponCode);
		coupon.setDiscount(new BigDecimal(discount));
		coupon.setExpDate(expiryDate);

		dao.save(coupon);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.print("<b>Coupon Created!!</b>");
		out.print("<br/><br/><a href='/CouponAndProductApp'>Home</a>");
	}

	private void findCoupon(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String couponCode = request.getParameter("couponCode");
		Coupon coupon = dao.findByCode(couponCode);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.print(coupon);
		out.print("<br/><br/><a href='/CouponAndProductApp'>Home</a>");
	}

}
