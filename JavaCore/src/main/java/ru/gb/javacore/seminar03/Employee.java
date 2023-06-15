package main.java.ru.gb.javacore.seminar03;

public class Employee {
    private String fio;
    private String jobTitle;
    private String phone;
    private int salary;
    private int age;
    private static int count;
    private int uid;

    public Employee(String fio, String jobTitle, String phone, int salary, int age) {
        this.fio = fio;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        this.uid = ++count;
    }

    public Employee(){
        this("Anonim");
    }

    public Employee(String fio){
        this(fio, "unemployed", "no phone", 0,0);
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "uid=" + uid +
                ", fio='" + fio + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
