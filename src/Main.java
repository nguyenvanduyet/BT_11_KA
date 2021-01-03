import javafx.scene.shape.TriangleMesh;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ManageStudentRecords manageStudentRecords = new ManageStudentRecords();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. nhập số học sinh");
            System.out.println("2. hiện thị thông tin các học sinh");
            System.out.println("3. hiện thị các học sinh cùng năm sin 1985 và cùng quê thái nguyên");
            System.out.println("4. hiện thị các học sinh cùng lớp");
            System.out.println("0. thoát chương trình");
            System.out.println("nhập biến choice");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("nhập số lượng học sinh");
                    int number =Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < number; i++) {
                        addNew();
                    }
                    break;
                case 2:
                    manageStudentRecords.displayAll();
                    break;
                case 3:
                    manageStudentRecords.testBirthdayYearAndHomeTown();
                    break;
                case 4:
                    manageStudentRecords.testClass();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }

        } while (choice != 0);
    }
    public static void addNew(){
        Scanner sc1=new Scanner(System.in);
        System.out.println("nhập tên");
        String name = sc.nextLine();
        System.out.println("nhập ngày sinh (dd/mm/yyyy");
        String birthday= sc1.nextLine();
        System.out.println("nhập quê quán");
        String homeTown = sc.nextLine();
        System.out.println("nhập lớp ");
        String classS=sc1.nextLine();
        System.out.println("nhập khóa học ");
        String course =sc.nextLine();
        System.out.println("nhập kì học");
        int semester=Integer.parseInt(sc1.nextLine());
        Student student =new Student(name,birthday,homeTown);
        StudentRecords studentRecords= new StudentRecords(student, classS,course,semester);
        manageStudentRecords.addStudent(studentRecords);
    }
}
