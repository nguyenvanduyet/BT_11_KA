import java.util.ArrayList;

public class ManageStudentRecords {
    ArrayList<StudentRecords> list = new ArrayList();

    public void addStudent(StudentRecords studentRecords) {
        list.add(studentRecords);
    }

    public void displayAll() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void testClass() {
        boolean testClass = true;
        for (int i = 0; i < list.size(); i++) {
            String class10A2 = list.get(i).getClassS();
            testClass = class10A2.equalsIgnoreCase("10A2");
            if (testClass) {
                System.out.println(list.get(i));
            }
        }
        if (!testClass) {
            System.out.println("không có lớp này");
        }
    }

    public void testBirthdayYearAndHomeTown() {
        boolean testYear = true;
        boolean testHomeTown = true;
        for (int i = 0; i < list.size(); i++) {
            String birthday = list.get(i).getStudent().getBirthday();
            String birthYear = birthday.substring(6, 10);
            testYear = birthYear.equalsIgnoreCase("1985");
            String HomeTown = list.get(i).getStudent().getHomeTown();
            testHomeTown = HomeTown.equalsIgnoreCase("thái nguyên");
            if (testYear && testHomeTown) {
                System.out.println(list.get(i));
                break;
            }
        }
        if (!testYear && !testHomeTown) {
            System.out.println("không có học sinh nào");
        }

    }
}
