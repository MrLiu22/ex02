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
			
			//ע������
			Class.forName("com.mysql.jdbc.Driver");
						
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		try {
			//�������ݿ�
			Connection conn = DriverManager.getConnection("jdbc:mysql://172.21.2.248:3306/2018demo1", "root", "111111");
			
			//����ִ��SQL�����(Statement)
			Statement st = conn.createStatement();
			
			String sql="insert into t_user(username,password,sex,major) values('"+xm+"','"+ma+"','"+sex+"','"+major+"')";
			//ִ��sql���
			int i = st.executeUpdate(sql);
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//��ȡ�����---�ַ���
		PrintWriter out=response.getWriter();

		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>�ɹ�ע�ᣡ</TITLE></HEAD>");
		out.println("  <BODY>");
		
		out.println("��ȡ�����ݣ�<br>");
		out.println("<br>�û�����  "+xm);
		out.println("<br>���룺 "+ma);
		out.println("<br>�ظ����룺 "+ma);
		out.println("<br>רҵ�� "+major);
		out.println("<br>ip��ַ��"+ip);
		out.println("<br>����: "+now);
		out.println("<br>��Ȥ���ã� ");
		if(xp.length>0){
			for(int i=0;i<xp.length;i++){
			out.println(xp[i]+" ");
		}
		
		}
		out.println("<br>�Ա� "+sex);
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
		
		
		
		
		
		
	}

}
