package ra.run;

import ra.model.Student;
import ra.service.StudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    static StudentService studentService = new StudentService();
    public static void main(String[] args) {
        while (true) {
            System.out.println("********** StudentManagerment************ ");
            System.out.println("1. Thêm mới học sinh\n" +
                    "2. Sửa học sinh\n" +
                    "3.Xóa học sinh\n" +
                    "4.Tìm kiếm học sinh theo studentId\n" +
                    "5.Sắp xếp theo tên học sinh từ a-z\n" +
                    "6.In ra danh sách học sinh\n" +
                    "7.Sắp xếp điểm tăng dần\n" +
                    "8. Sắp xếp điểm giảm dần\n" +
                    "9.Thoát\n");
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    studentService.input();
                    break;
                case 2:
                    studentService.updateStudent();
                    break;
                case 3:
                    studentService.deleteStudent();
                    break;
                case 4:
                    studentService.searchStudent();
                    break;
                case 5:
                    studentService.sortStudent();
                    break;
                case 6:
                    studentService.display();
                    break;
                case 7:
                    studentService.sortStudentToMarkDSC();
                    break;
                case 8:
                    studentService.sortStudentToMarkDESC();

                    break;
                case 9:
                    System.exit(0);
                    break;
            }
        }
    }
}
