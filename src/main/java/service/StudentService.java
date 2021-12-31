package service;

import dao.StudentsDao;
import model.Students;

import java.util.List;

public class StudentService {
    public static List<Students> studentsList = StudentsDao.getAllStudents();

    public List<Students> fillAllStudent(){
        studentsList = StudentsDao.getAllStudents();
        return studentsList;
    }

    public List<Students> findByName(String name){
        studentsList = StudentsDao.findByName(name);
        return studentsList;
    }

    public void createStudent(Students students) {
        StudentsDao.addStudent(students);
        studentsList = StudentsDao.getAllStudents();
    }

    public void editStudent(Students students) {
        StudentsDao.updateStudent(students);
        studentsList = StudentsDao.getAllStudents();
    }

    public void deleteStudent(int id) {
        StudentsDao.deleteStudent(id);
        studentsList = StudentsDao.getAllStudents();
    }

    public int findIndexById(int id){
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }
}
