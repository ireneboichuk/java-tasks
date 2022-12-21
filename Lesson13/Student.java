package Lesson13;

public class Student {
    private int age;
    private long telNumber;
    private String name;

    private enum Faculty {
        MATH, COMPUTER_SCIENCE, MANAGEMENT, MARKETING
    }

    public Student (String name, int age, long telNumber, String Faculty) {
        this.name = name;
        this.age = age;
        this.telNumber = telNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(long telNumber) {
        this.telNumber = telNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String print() {
        return this.name + ", " + this.age + " років, ";
    }

    @Override
    public int hashCode() {
        return age * 137 * name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Student)) {
            return false;
        }
        Student st = (Student) obj;
        return this.age == st.age && this.name.equals(st.name);
    }
}
