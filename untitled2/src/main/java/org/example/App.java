package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер задания 1-3");
        int task = in.nextInt();
        switch (task) {
            case 1:
                Ticket ticket = new Ticket("Концерт","15B",100);
                ticket.displayInfo();
                ticket.applyDiscount();
                System.out.println(ticket);
                break;
            case 2:
                Plane[] planes = {
                        new Plane("676767", 180, 5600),
                        new Plane("Aалпоал", 186, 6100),
                        new Plane("МиниБар", 396, 9700),
                        new Plane("80", 525, 15200),
                        new Plane("47", 467, 14800),
                        new Plane("50", 440, 16100)
                };
                Plane maxCapacity = planes[0];
                Plane maxRange = planes[0];
                for (int i = 1; i < planes.length; i++) {
                    if (planes[i].capacity > maxCapacity.capacity) {
                        maxCapacity = planes[i];
                    }
                    if (planes[i].range > maxRange.range) {
                        maxRange = planes[i];
                    }
                }

                System.out.println("Самолет с макc вместимостью");
                System.out.println(maxCapacity.model + " - " + maxCapacity.capacity);

                System.out.println("Самолет с макс дальностью ");
                System.out.println(maxRange.model + " - " + maxRange.range + " км");
                break;
            case 3:
                Payment[] payments = {
                        new Payment(100, PaymentMethod.CASH),
                        new Payment(250, PaymentMethod.CARD),
                        new Payment(500, PaymentMethod.CRYPTO),
                        new Payment(320, PaymentMethod.CARD),
                        new Payment(700, PaymentMethod.TRANSFER)
                };

                for (Payment payment : payments) {
                    if (payment.method == PaymentMethod.CARD) {
                        System.out.println(payment.amount);
                    }
                }
                break;
        }
    }
}
