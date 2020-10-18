package lesson1.homework19102020;

import java.util.Arrays;

public class Group {

    private String name;

    public Group(String name) {
        this.name = name;
    }

    public String getNameGroup() {
        return name;
    }

    public void setNameGroup(String name) {
        this.name = name;
    }

    private Employee[] employees = new Employee[10];
    private int empNumber = -1;

    public void addEmp(Employee employee) {
        if (empNumber < employees.length){
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] == null) {
                    employees[i] = employee;
                    break;
                }
            }
        } else {
            System.out.println("Group is full");
        }
    }

    public void removeEmp(int i) {
        if (employees[i] == null) {
            System.out.println("Employee is null");
        } else {
            employees[i] = null;
            empNumber--;
        }
    }

    public void cleanGroup() {
        Arrays.fill(employees, null);
        empNumber = -1;
    }

    public void getEmpFromGroup() {
        int j = 0;
            for (int i = 0; i < employees.length; i++) {
                if( employees[i] != null ) {
                    System.out.println(employees[i].getInfo());
                } else {
                    j++;
                }
            }
        if (j == employees.length) {
            System.out.println("Group is empty");
        }
    }

    public static void main(String[] args) {
        Group group2 = new Group("QA");
        group2.addEmp(new Employee("Имя1", "email1@mail.ru", 25, "Тестировщик", group2));
        group2.addEmp(new Employee("Имя2", "email1@mail.ru", 25, "Тестировщик", group2));
        group2.addEmp(new Employee("Имя3", "email1@mail.ru", 25, "Тестировщик", group2));
        group2.addEmp(new Employee("Имя4", "email1@mail.ru", 25, "Тестировщик", group2));
        group2.addEmp(new Employee("Имя5", "email1@mail.ru", 25, "Тестировщик", group2));
        group2.addEmp(new Employee("Имя6", "email1@mail.ru", 25, "Тестировщик", group2));
        group2.addEmp(new Employee("Имя7", "email1@mail.ru", 25, "Тестировщик", group2));
        group2.addEmp(new Employee("Имя8", "email1@mail.ru", 25, "Тестировщик", group2));
        group2.addEmp(new Employee("Имя9", "email1@mail.ru", 25, "Тестировщик", group2));
        group2.addEmp(new Employee("Имя10", "email1@mail.ru", 25, "Тестировщик", group2));
        //group2.removeEmp(0);
        //group2.cleanGroup();
        group2.getEmpFromGroup();
    }

}
