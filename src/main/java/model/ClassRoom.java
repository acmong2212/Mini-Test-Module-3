package model;

public class ClassRoom {
    private int idClass;
    private String nameClass;

    public ClassRoom() {
    }

    public ClassRoom(int idClass, String nameClass) {
        this.idClass = idClass;
        this.nameClass = nameClass;
    }

    public int getIdClass() {
        return idClass;
    }

    public void setIdClass(int idClass) {
        this.idClass = idClass;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }
}
