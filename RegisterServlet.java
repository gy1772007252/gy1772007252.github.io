package com.briup.form;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        response.sendRedirect("form/login.html");

        /*RequestDispatcher requestDispatcher = request.getRequestDispatcher("/login.html");
        requestDispatcher.forward(request, response);*/

        /*PrintWriter pw = response.getWriter();
        String userNames = request.getParameter("userName");
        pw.println("昵称：" + userNames + "<br>");
        String userPwd = request.getParameter("userPwd");
        pw.println("密码：" + userPwd + "<br>");
        String reUserPwd = request.getParameter("reUserPwd");
        pw.println("确认密码：" + reUserPwd + "<br>");
        String gender = request.getParameter("gender");
        pw.println("性别：" + gender + "<br>");
        String email = request.getParameter("email");
        pw.println("邮箱：" + email + "<br>");
        String[] hobbies = request.getParameterValues("hobby");
        if (hobbies != null) {
            String h = "";
            for (String hobby : hobbies) {
                h += hobby + " ";
            }
            pw.println("爱好：" + h + "<br>");
        }
        //pw.println("爱好：" + Arrays.toString(hobbies) + "<br>");
        String address = request.getParameter("address");
        pw.println("地址：" + address + "<br>");
        String info = request.getParameter("info");
        pw.println("备注：" + info + "<br>");
        pw.flush();
        pw.close();*/
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
