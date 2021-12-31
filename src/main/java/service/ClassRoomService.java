package service;

import dao.ClassRoomDao;
import model.ClassRoom;

import java.util.List;

public class ClassRoomService {
    public List<ClassRoom> fillAllClassRoom(){
        return ClassRoomDao.getAllClassRoom();
    }


}
