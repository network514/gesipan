package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/home/main.do",
			"/bang/index.do","/dap/index.do"})
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*response.getWriter().append("Served at: ").append(request.getContextPath());*/
		process(request, response);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath().substring(+1);
		System.out.println(path);
		
		String url = "";
		switch (path){
		case "home/main.do": url="/view/home/main.jsp"; break;
		case "bang/index.do": url="..."; break;
		case "dap/index.do": url="..."; break;
		default: break;
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
			}
}

/*
 package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

@WebServlet({"/jquery/ch01.do","/jquery/ch02.do","/jquery/ch03.do","/jquery/ch04.do",
			"/jquery/ch05.do","/jquery/ch06.do","/jquery/ch07.do","/jquery/ch08.do",
			"/jquery/ch09.do","/jquery/ch10.do","/jquery/ch11.do","/jquery/ch12.do",
			"/jquery/ch13.do","/jquery/ch14.do"})
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		String path = request.getServletPath().substring(+1);
		String url = "";
		switch (path){
		case "/jquery/ch01.do": url="/jquery/ch01/index.html"; break;
		case "/jquery/ch02.do": url="/jquery/ch02/index.html"; break;
		case "/jquery/ch03.do": url="/jquery/ch03/index.html"; break;
		case "/jquery/ch04.do": url="/jquery/ch04/index.html"; break;
		case "/jquery/ch05.do": url="/jquery/ch05/index.html"; break;
		case "/jquery/ch06.do": url="/jquery/ch06/index.html"; break;
		case "/jquery/ch07.do": url="/jquery/ch07/index.html"; break;
		case "/jquery/ch08.do": url="/jquery/ch08/index.html"; break;
		case "/jquery/ch09.do": url="/jquery/ch09/index.html"; break;
		case "/jquery/ch10.do": url="/jquery/ch10/index.html"; break;
		case "/jquery/ch11.do": url="/jquery/ch11/index.html"; break;
		case "/jquery/ch12.do": url="/jquery/ch13/index.html"; break;
		case "/jquery/ch13.do": url="/jquery/ch13/index.html"; break;
		case "/jquery/ch14.do": url="/jquery/ch14/index.html"; break;
		}
	}
}
*/
