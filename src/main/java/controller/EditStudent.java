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

@WebServlet(urlPatterns = "/edit")
public class EditStudent extends HttpServlet {
    StudentService studentService = new StudentService();
    RequestDispatcher dispatcher;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("editName");
        Date birthday = Date.valueOf(req.getParameter("editBirthday"));
        String address = req.getParameter("editAddress");
        String phoneNumber = req.getParameter("editPhoneNumber");
        String email = req.getParameter("editEmail");
        int idClass = Integer.parseInt(req.getParameter("editIdClass"));
        Students students = new Students(id, name, birthday, address, phoneNumber, email, idClass);

        studentService.editStudent(students);

        req.setAttribute("students", studentService.fillAllStudent());
        dispatcher = req.getRequestDispatcher("/view/home.jsp");
        dispatcher.forward(req, resp);
    }
}
