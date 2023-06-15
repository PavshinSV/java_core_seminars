package main.java.ru.gb.javacore.seminar03;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0]=new Employee("Sergei Pavshin", "Enginier","123",100,43);
        employees[1]=new Employee("Egor Pavshin", "Worker","321",30,10);
        employees[2]=new Employee("Lada Pavshina", "Princes","231",200,4);
        employees[3]=new Employee("Viktoria Pavshina", "Manager","312",250,19);
        employees[4]=new Boss("Natali Pavshina", "Boss","213",500,45);

        for (Employee element: employees){
            System.out.println(element);
        }
        System.out.println("----------------");
        Boss.riseSalary(employees,30);

        for (Employee element: employees){
            System.out.println(element);
        }
    }
}
