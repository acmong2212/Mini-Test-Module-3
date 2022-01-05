package controller;

import model.Students;
import service.ClassRoomService;
import service.StudentService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "")
public class HomeServlet extends HttpServlet {
    StudentService studentService = new StudentService();
    ClassRoomService classRoomService = new ClassRoomService();
    List<Students> studentsList = studentService.fillAllStudent();
    RequestDispatcher dispatcher;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                req.setAttribute("listClass", classRoomService.fillAllClassRoom());
                dispatcher = req.getRequestDispatcher("/view/CreateStudent.jsp");
                dispatcher.forward(req, resp);
                break;
            case "edit":
                int indexEdit = Integer.parseInt(req.getParameter("id"));
                Students students = studentService.fillAllStudent().get(studentService.findIndexById(indexEdit));

                req.setAttribute("indexEdit", indexEdit);
                req.setAttribute("editStudent", students);
                dispatcher = req.getRequestDispatcher("/view/EditStudent.jsp");
                dispatcher.forward(req, resp);
                break;
            case "delete":
                int idDelete = Integer.parseInt(req.getParameter("id"));
                req.setAttribute("idDelete", idDelete);
                dispatcher = req.getRequestDispatcher("/view/DeleteStudent.jsp");
                dispatcher.forward(req, resp);
                break;
            case "search":
                String name = req.getParameter("search");
                req.setAttribute("students", studentService.findByName(name));
                dispatcher = req.getRequestDispatcher("/view/home.jsp");
                dispatcher.forward(req, resp);
                break;
            default:
                req.setAttribute("students", studentsList);
                dispatcher = req.getRequestDispatcher("/view/home.jsp");
                dispatcher.forward(req, resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
