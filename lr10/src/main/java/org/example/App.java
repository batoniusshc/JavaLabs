package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Workable[] workers = {
                new Doctor("Андрилайна", 10, "Хирург", 5),
                new Doctor("КириллАкулич", 7, "Терапевт", 3),
                new Doctor("Ктото", 12, "Кардиолог", 6),
                new Teacher("Гдето", 15, "Математика", 25),
                new Teacher("Когдато", 8, "Информатика", 20)
        };

        for (Workable worker : workers) {
            worker.work();

            System.out.println("Опыт работы "
                    + worker.getExperience());

            if (worker instanceof Teachable) {
                Teachable teacher = (Teachable) worker;

                teacher.teach();

                System.out.println("Количество студентов: "
                        + teacher.getStudents());
            }

            System.out.println();
        }
    }
}
