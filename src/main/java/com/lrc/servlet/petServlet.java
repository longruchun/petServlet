package com.lrc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.lrc.model.pet;

/**
 * Servlet implementation class petServlet
 */
public class petServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public petServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html,charset=utf-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		List<pet> pets=new ArrayList<pet>();
		pets.add(new pet(1,"小花",120,"/public/upload/pet/pet1.jpg"));
		pets.add(new pet(2,"小黄",120,"/public/upload/pet/pet2.jpg"));
		pets.add(new pet(3,"小牛",120,"/public/upload/pet/pet3.jpg"));
		
		
		
		String json=JSON.toJSONString(pets);
		
		PrintWriter out=response.getWriter();
		out.write(json);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
