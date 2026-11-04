package org.example;

import java.io.*;

public class App {
    public static void main(String[] args) {

        File file = new File("f.txt");

        int[] numbers = {8, 12, 16, 24, 7, 32, 15, 40, 11, 48};

        try (FileWriter fileWriter = new FileWriter(file)) {

            for (int i = 0; i < numbers.length; i++) {
                fileWriter.write(numbers[i] + "\n");
            }

        }
        catch (IOException e) {
            System.out.println("Ошибка " + e);
        }

        int count = 0;

        try (BufferedReader fileReader =
                     new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = fileReader.readLine()) != null) {

                int num = Integer.parseInt(line);

                System.out.println(num);

                if (num % 8 == 0) {
                    count++;
                }
            }

            System.out.println("Количество чисел, кратных 8 " + count);

        }
        catch (IOException e) {
            System.out.println("Ошибка " + e);
        }
    }
}