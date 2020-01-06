
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class exam
 */
@WebServlet("/exam")
public class exam extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String action = request.getParameter("action");
		PrintWriter out = response.getWriter();
//gittest
		if (action == null) {
			out.print("안녕하세요");
		} else if (action.equals("printGuGu1")) {
			printGuGu(9, out);
		} else if (action.equals("printGuGu2")) {
			int limit = Integer.parseInt(request.getParameter("limit"));
			printGuGu(limit, out);
		} else if (action.equals("hello")) {
			String age = request.getParameter("age");
			String name = request.getParameter("name");
			out.print("<h1 style='color:blue'>안녕하세요 " + age + "살 " + name + "입니다<h1>");
		}
	}

	void printGuGu(int limit, PrintWriter out) {
		for (int dan = 2; dan <= limit; dan++) {
			out.print("<h4>****" + dan + "단****<h4>");
			for (int i = 1; i <= 9; i++) {
				out.print("<h5>" + dan + "*" + i + "=" + dan * i + "<h5>");
			}
		}
	}

}
