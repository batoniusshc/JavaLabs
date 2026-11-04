//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package task3;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер задания 1-4");
        int task = in.nextInt();
        switch (task) {
            case 1:
                System.out.println("Введите строку");

                String s;
                for(s = in.next(); s.length() < 7; s = in.next()) {
                    System.out.println("Размер должен быть больше 6");
                }

                System.out.println(s.substring(2, 7));
                break;
            case 2:
                in.nextLine();
                System.out.println("Введите строку");
                String s1 = in.nextLine();
                String[] words = s1.trim().split(" ");

                for(String word : words) {
                    System.out.println(word);
                }
                break;
            case 3:
                class Employee {
                    String fullname;
                    double salary;

                    Employee(String f, double s) {
                        this.fullname = f;
                        this.salary = s;
                    }
                }

                Employee[] employees = new Employee[]{new Employee("Иванов", 45000.5545), new Employee("Петров", 52340.75545), new Employee("Сидоров", (double)61000.0F)};

                class Report {
                    static void generateReport(Employee[] employees) {
                        for(Employee employee : employees) {
                            System.out.printf("%-15s %10.2f%n", employee.fullname, employee.salary);
                        }

                    }
                }

                Report.generateReport(employees);
                break;
            case 4:
                String s2 = "aXa aXXa aXXXa aXXXXa aXXXXXa";
                String[] words2 = s2.split(" ");

                for(String word : words2) {
                    if (word.matches("aX{2,4}a")) {
                        System.out.println(word);
                    }
                }
                break;
            default:
                System.out.println("Такого задания няма :(");
        }

    }
}
