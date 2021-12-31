package dao;

import model.ClassRoom;
import model.Students;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClassRoomDao {
    static Connection connection = ConnectMySQL.getConnection();

    public static List<ClassRoom> getAllClassRoom() {
        String sqlGetAll = "SELECT * FROM classroom;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlGetAll);
            ResultSet resultSet = preparedStatement.executeQuery(sqlGetAll);

            List<ClassRoom> classRoomList = new ArrayList<>();

            while (resultSet.next()) {
                int idClass = resultSet.getInt("idClass");
                String nameClass = resultSet.getString("nameClass");

                classRoomList.add(new ClassRoom(idClass, nameClass));
            }
            return classRoomList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
