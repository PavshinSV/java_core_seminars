package main.java.ru.gb.javacore.seminar03;

public class Boss extends Employee{
    public Boss(String fio, String jobTitle, String phone, int salary, int age) {
        super(fio, jobTitle, phone, salary, age);
    }

    public static void riseSalary(Employee[] employees, int percent){
        for (int i = 0; i<employees.length; i++){
            if (!(employees[i] instanceof Boss)){
                employees[i].setSalary((employees[i].getSalary()+(employees[i].getSalary()*percent/100)));
            }
        }
    }
}