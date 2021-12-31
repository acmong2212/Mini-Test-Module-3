package dao;

import model.Students;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static dao.ConnectMySQL.getConnection;

public class StudentsDao {
    static Connection connection = ConnectMySQL.getConnection();

    public static List<Students> getAllStudents() {
        String sqlGetAll = "select student.*, classroom.nameClass as classname from student \n" +
                "join classroom on student.idClass = classroom.idClass";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlGetAll);
            ResultSet resultSet = preparedStatement.executeQuery(sqlGetAll);

            List<Students> studentsList = new ArrayList<>();

            while (resultSet.next()) {
                int idStudent = resultSet.getInt("idStudent");
                String name = resultSet.getString("name");
                Date birthday = resultSet.getDate("birthday");
                String address = resultSet.getString("address");
                String phoneNumber = resultSet.getString("phoneNumber");
                String email = resultSet.getString("email");
                String className = resultSet.getString("classname");
                int idClass = resultSet.getInt("idClass");

                studentsList.add(new Students(idStudent, name, birthday, address, phoneNumber, email, className ,idClass));
            }
            return studentsList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void addStudent(Students students) {
        String addSQL = "INSERT INTO student (`name`, `birthday`, `address`, `phoneNumber`, `email`, `idClass`) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(addSQL);
            preparedStatement.setString(1, students.getName());
            preparedStatement.setDate(2, students.getBirthday());
            preparedStatement.setString(3, students.getAddress());
            preparedStatement.setString(4, students.getPhoneNumber());
            preparedStatement.setString(5, students.getEmail());
            preparedStatement.setInt(6, students.getIdClass());

            preparedStatement.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateStudent(Students students) {
        String UPDATE_USERS_SQL = "update student set name = ?,birthday= ?, address =?, phoneNumber=?, email=?, idClass=? where (idStudent = ?);";

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USERS_SQL);) {
            preparedStatement.setString(1, students.getName());
            preparedStatement.setDate(2, students.getBirthday());
            preparedStatement.setString(3, students.getAddress());
            preparedStatement.setString(4, students.getPhoneNumber());
            preparedStatement.setString(5, students.getEmail());
            preparedStatement.setInt(6, students.getIdClass());
            preparedStatement.setInt(7, students.getId());

            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteStudent(int id) {
        String deleteSQL = "DELETE FROM student where idStudent = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Students> findByName(String findName) {
        String find = "select student.*, classroom.nameClass as classname from student \n" +
                "join classroom on student.idClass = classroom.idClass\n" +
                "where student.name like '%"+findName+"%'";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(find);
            ResultSet resultSet = preparedStatement.executeQuery(find);

            List<Students> studentsList = new ArrayList<>();

            while (resultSet.next()) {
                int idStudent = resultSet.getInt("idStudent");
                String name = resultSet.getString("name");
                Date birthday = resultSet.getDate("birthday");
                String address = resultSet.getString("address");
                String phoneNumber = resultSet.getString("phoneNumber");
                String email = resultSet.getString("email");
                String className = resultSet.getString("classname");
                int idClass = resultSet.getInt("idClass");

                studentsList.add(new Students(idStudent, name, birthday, address, phoneNumber, email, className ,idClass));
            }
            return studentsList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
