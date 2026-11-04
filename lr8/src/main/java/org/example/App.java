package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Professional[] professionals = {
                new Doctor("Анна", 10, 4.8, "Хирург"),
                new Doctor("Иван", 7, 4.5, "Терапевт"),
                new Doctor("Мария", 5, 4.7, "Кардиолог"),
                new Engineer("Алексей", 8, 4.6, "Мост"),
                new Engineer("Олег", 12, 4.9, "Новый завод")
        };

        Professional professional1 =  new Doctor("Анна", 10, 4.8, "Хирург");
        Doctor doctor1 =  new Doctor("Анна", 10, 4.8, "Хирург");
        doctor1.print();
        doctor1.print1();
        professional1.print1();

        for (Professional professional : professionals) {
            professional.displayInfo();
            professional.work();

            if (professional instanceof Doctor) {
                Doctor doctor = (Doctor) professional;
                doctor.diagnose();
            }

            if (professional instanceof Engineer) {
                Engineer engineer = (Engineer) professional;
                engineer.design();
            }

            System.out.println();
    }
}
}
