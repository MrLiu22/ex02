package lms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns="/aaa")
public class LoginServlet extends HttpServlet {

	
	/*public void doGet(HttpServletRequest request, HttpServletResponse response){
	
			doPost(request,response);
		
		}
	*/
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
request.setCharacterEncoding("utf-8");
		
		//�ύ���е�ѧ���ı�������
		String username = request.getParameter("username");

		String password = request.getParameter("password");

		if("admin".equals(username)&&"111111".equals(password)){
			                //��¼�ɹ�
			               //�õ���ǰ�û���session
			HttpSession session=request.getSession();
			session.setAttribute("user", "admin");  //��session�з�������--key��value
			request.setAttribute("msg", "�ɹ���¼!!");
			//ת����dm.jsp
            RequestDispatcher rd = request.getRequestDispatcher("dm.jsp");
			
			rd.forward(request, response);
			
		}
		else{
			request.setAttribute("msg", "����û����������������!!");
		}

    }
}
