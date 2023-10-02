package ra.service;

import ra.model.Student;

import java.util.*;

public class StudentService implements IGennericStudent {
    private static List<Student> students = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    @Override
    public void input() {
        Student student = new Student();
        student.setId(autoId());
        System.out.println("Tên học sinh :");
        student.setStudentName(sc.nextLine());
        System.out.println("Địa chỉ :");
        student.setAddress(sc.nextLine());
        System.out.println("SĐT :");
        student.setPhone(sc.nextLine());
        System.out.println("Giới tính :");
        System.out.println("1. Nam");
        System.out.println("1. Nữ");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                student.setSex(true);
                break;
            case 2:
                student.setSex(false);
                break;
            default:
                System.out.println("Không hợp lệ mời nhập lại!");
        }
        System.out.println("Điểm :");
        student.setMark(Double.parseDouble(sc.nextLine()));
        students.add(student);
        System.out.println("thêm mới thành công!");
    }

    public void updateStudent() {
        System.out.println("Nhập ID học sinh muốn xóa :");
        int id = Integer.parseInt(sc.nextLine());
        int check = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                check = i;
            }
        }
        if (check != -1) {
            System.out.println("Nhập lại tên :");
            students.get(check).setStudentName(sc.nextLine());
            System.out.println("Nhập địa lại chỉ :");
            students.get(check).setAddress(sc.nextLine());
            System.out.println("Nhập lại SĐT :");
            students.get(check).setPhone(sc.nextLine());
            System.out.println("Giới tính :");
            System.out.println("1. Nam");
            System.out.println("1. Nữ");
            boolean blSex = true;
            while (blSex) {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        students.get(check).setSex(true);
                        blSex = false;
                        break;
                    case 2:
                        students.get(check).setSex(false);
                        blSex = false;
                        break;
                    default:
                        System.out.println("Không hợp lệ!");
                        break;
                }
            }
            System.out.println("Điểm :");
            students.get(check).setMark(Double.parseDouble(sc.nextLine()));
            System.out.println("Cập nhập thành công!");
        } else {
            System.out.println("Không tìm thấy sinh viên!");
        }
    }

    public void deleteStudent() {
        System.out.println("Nhập ID sinh viên muốn xoá :");
        int id = Integer.parseInt(sc.nextLine());
        boolean blDelete = true;
        for (Student st :
                students) {
            if (st.getId() == id) {
                students.remove(st);
                blDelete = false;
                System.out.println("Xóa thành công!");
            }
        }
        if (!blDelete) {
            System.out.println("Không tìm thấy sinh viên");
        }
    }

    public void searchStudent() {
        System.out.println("Nhập Tên Sinh viên :");
        String name = sc.nextLine();
        boolean blSearch = true;
        for (Student st :
                students) {
            if (st.getStudentName().equalsIgnoreCase(name)) {
                blSearch = false;
                System.out.println("Student{" +
                        "id=" + st.getId() +
                        ", studentName='" + st.getStudentName() + '\'' +
                        ", address='" + st.getAddress() + '\'' +
                        ", phone='" + st.getPhone() + '\'' +
                        ", sex=" + (st.isSex() ? "Nam" : "Nữ") +
                        ", mark=" + st.getMark() +
                        '}');
            }
        }
        if (!blSearch) {
            System.out.println("Không tìm thấy sinh viên!");
        }
    }

    public void sortStudent() {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return student1.getStudentName().compareTo(student2.getStudentName());
            }
        });
        for (Student st : students) {
            System.out.println("Student{" +
                    "id=" + st.getId() +
                    ", studentName='" + st.getStudentName() + '\'' +
                    ", address='" + st.getAddress() + '\'' +
                    ", phone='" + st.getPhone() + '\'' +
                    ", sex=" + (st.isSex() ? "Nam" : "Nữ") +
                    ", mark=" + st.getMark() +
                    '}');
        }
    }

    @Override
    public void display() {
        for (Student student :
                students) {
            System.out.println("Student{" +
                    "id=" + student.getId() +
                    ", studentName='" + student.getStudentName() + '\'' +
                    ", address='" + student.getAddress() + '\'' +
                    ", phone='" + student.getPhone() + '\'' +
                    ", sex=" + (student.isSex() ? "Nam" : "Nữ") +
                    ", mark=" + student.getMark() +
                    '}');
        }
    }
    public void sortStudentToMarkDSC(){
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                if (st1.getMark() < st2.getMark()) {
                    return -1;
                } else if (st1.getMark() > st2.getMark()) {
                    return 1;
                }
                return 0;
            }
        });
    }
    public void sortStudentToMarkDESC(){
        students.sort(new Comparator<Student>() {
                          @Override
                          public int compare(Student st1, Student st2) {
                              if (st1.getMark() < st2.getMark()) {
                                  return 1;
                              } else if (st1.getMark() > st2.getMark()) {
                                  return -1;
                              }
                              return 0;
                          }
                      }

        );
    }
    public static int autoId() {
        int max = 0;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() > max) {
                max = students.get(i).getId();
            }
        }
        return max + 1;
    }
}
