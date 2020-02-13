public class Student {
    private String Name;
    private Gender gender;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
            "Name='" + Name + '\'' +
            ", gender=" + gender +
            '}';
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Student() {
    }

    public Student(String name, Gender gender) {
        Name = name;
        this.gender = gender;
    }
}
