public class Student {
    private String name;
    private String birthday;
    private String homeTown;

    public Student(String name, String birthday, String homeTown) {
        this.name = name;
        this.birthday = birthday;
        this.homeTown = homeTown;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getHomeTown() {
        return homeTown;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", homeTown='" + homeTown + '\'' +
                '}';
    }
}
