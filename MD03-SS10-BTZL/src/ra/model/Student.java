package ra.model;

public class Student {
    private int id;
    private String studentName;
    private String address;
    private String phone;
    private boolean sex;
    private double mark;

    public Student() {
    }

    public Student(int id, String studentName, String address, String phone, boolean sex, double mark) {
        this.id = id;
        this.studentName = studentName;
        this.address = address;
        this.phone = phone;
        this.sex = sex;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
