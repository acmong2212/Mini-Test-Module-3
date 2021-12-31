package model;

import java.sql.Date;

public class Students {
    private int id;
    private String name;
    private Date birthday;
    private String address;
    private String phoneNumber;
    private String email;
    private String className;
    private int idClass;

    public Students() {
    }

    public Students(int id, String name, Date birthday, String address, String phoneNumber, String email, int idClass) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.idClass = idClass;
    }

    public Students(String name, String email, Date birthday, String address, String phoneNumber, int idClass) {
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.idClass = idClass;
    }

    public Students(int id, String name, Date birthday, String address, String phoneNumber, String email, String className, int idClass) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.className = className;
        this.idClass = idClass;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdClass() {
        return idClass;
    }

    public void setIdClass(int idClass) {
        this.idClass = idClass;
    }
}

//package model;
//
//import java.util.Date;
//
//public class Students {
//    private int id;
//    private String name;
//    private String birthday;
//    private String address;
//    private String phoneNumber;
//    private String email;
//    private int idClass;
//
//    public Students() {
//    }
//
//    public Students(int id, String name, String birthday, String address, String phoneNumber, String email, int idClass) {
//        this.id = id;
//        this.name = name;
//        this.birthday = birthday;
//        this.address = address;
//        this.phoneNumber = phoneNumber;
//        this.email = email;
//        this.idClass = idClass;
//    }
//
//    public Students(String name, String email, String birthday, String address, String phoneNumber, int idClass) {
//        this.name = name;
//        this.email = email;
//        this.birthday = birthday;
//        this.address = address;
//        this.phoneNumber = phoneNumber;
//        this.idClass = idClass;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(String birthday) {
//        this.birthday = birthday;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public int getIdClass() {
//        return idClass;
//    }
//
//    public void setIdClass(int idClass) {
//        this.idClass = idClass;
//    }
//}
