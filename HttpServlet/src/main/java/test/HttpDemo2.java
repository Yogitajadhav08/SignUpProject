package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/yogitalink")
public class HttpDemo2 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int no1=Integer.parseInt(req.getParameter("no1"));
	int no2=Integer.parseInt(req.getParameter("no2"));;
	int result=no1+no2;
	PrintWriter pw=resp.getWriter();
	pw.print("<h1 style='color:red'>add"+result+"</h1>");
}
}
