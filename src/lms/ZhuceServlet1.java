package lms;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/bbb")
public class ZhuceServlet1 extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        
		request.setCharacterEncoding("utf-8");
		
		response.setContentType("text/html;charset=utf-8");
		String xm=request.getParameter("ming");
		String ma=request.getParameter("ma");
		String cma=request.getParameter("cma");
		String major=request.getParameter("major");
		
		String[] xp=request.getParameterValues("ig");
		String sex=request.getParameter("sex");
		String ip=request.getRemoteAddr();
		
		Date now=new Date();
try {
			
			//注册驱动
			Class.forName("com.mysql.jdbc.Driver");
						
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		try {
			//连接数据库
			Connection conn = DriverManager.getConnection("jdbc:mysql://172.21.2.248:3306/2018demo1", "root", "111111");
			
			//创建执行SQL的语句(Statement)
			Statement st = conn.createStatement();
			
			String sql="insert into t_user(username,password,sex,major) values('"+xm+"','"+ma+"','"+sex+"','"+major+"')";
			//执行sql语句
			int i = st.executeUpdate(sql);
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//获取输出流---字符流
		PrintWriter out=response.getWriter();

		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>成功注册！</TITLE></HEAD>");
		out.println("  <BODY>");
		
		out.println("获取的数据：<br>");
		out.println("<br>用户名：  "+xm);
		out.println("<br>密码： "+ma);
		out.println("<br>重复密码： "+ma);
		out.println("<br>专业： "+major);
		out.println("<br>ip地址："+ip);
		out.println("<br>日期: "+now);
		out.println("<br>兴趣爱好： ");
		if(xp.length>0){
			for(int i=0;i<xp.length;i++){
			out.println(xp[i]+" ");
		}
		
		}
		out.println("<br>性别： "+sex);
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
		
		
		
		
		
		
	}

}
