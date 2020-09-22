package lms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/BookDownload")
public class BookDownloadServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException{
		String bookname=request.getParameter("bookname");
    //‘⁄œﬂ‘§¿¿ response.setContentType("application/pdf");
     //response.addHeader("content-type"," application/octet-stream");
     //response.addHeader("content-Disposition", "attachment;filename=\"");
     File file=new File("e:/book/"+bookname);
     
     InputStream is;
     try {
		is=new FileInputStream(file);
		OutputStream os;
		try {
			os=response.getOutputStream();
			byte[] bytes=new byte[1024];
	 int num=0;
	 while((num=is.read(bytes))!=-1){
		 os.write(bytes,0,num);
		 os.flush();
		} 
		  }catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
	 
	 
	
     }catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
	 
	 }

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

}