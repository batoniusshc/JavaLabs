package z2;

import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        File file = new File("f.txt");

        try (FileWriter fileWriter = new FileWriter(file);
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("Введите 10 чисел ");

            for (int i = 0; i < 10; i++) {
                int num = scanner.nextInt();
                fileWriter.write(num + "\n");
            }

        }
        catch (IOException e) {
            System.out.println("пока реально " + e);
        }

        int count = 0;

        try (BufferedReader fileReader =
                     new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = fileReader.readLine()) != null) {

                int num = Integer.parseInt(line);
                System.out.println(num);

                int temp = num;
                int reverse = 0;

                while (temp > 0) {
                    int digit = temp % 10;
                    reverse = reverse * 10 + digit;
                    temp = temp / 10;
                }

                if (num >= 0 && num == reverse) {
                    count++;
                }
            }

            System.out.println("Количество палиндромов " + count);

        }
        catch (IOException e) {
            System.out.println("пока " + e);
        }
    }
}