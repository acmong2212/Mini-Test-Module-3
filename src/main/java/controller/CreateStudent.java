package controller;

import model.Students;
import service.StudentService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

@WebServlet(urlPatterns = "/create")
public class CreateStudent extends HttpServlet {
    StudentService studentService = new StudentService();
    RequestDispatcher dispatcher;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("addName");
        String email = req.getParameter("addEmail");
        Date birthday = Date.valueOf(req.getParameter("addBirthday"));
        String address = req.getParameter("addAddress");
        String phoneNumber = req.getParameter("addPhoneNumber");
        int idClass = Integer.parseInt(req.getParameter("addClass"));

        try {
            studentService.createStudent(new Students(name, email, birthday, address, phoneNumber, idClass));
        } catch (Exception e) {
            e.printStackTrace();
        }

        req.setAttribute("students", studentService.fillAllStudent());
        dispatcher = req.getRequestDispatcher("/view/home.jsp");
        dispatcher.forward(req, resp);
    }
}
