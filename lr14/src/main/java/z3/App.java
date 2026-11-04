package z3;

import java.io.*;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        File f = new File("f.txt");
        File g = new File("g.txt");
        File h = new File("h.txt");


        try (FileWriter fileWriter = new FileWriter(f);
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
        try (BufferedReader fileReader = new BufferedReader(new FileReader(f));
             FileWriter writeG = new FileWriter(g);
             FileWriter writeH = new FileWriter(h);)
        {
            String line;
            while((line = fileReader.readLine())!=null){
                int num = Integer.parseInt(line);
                System.out.println(num);
                if(num%11==0){
                    writeG.write(num+"\n");
                }
                else
                    writeH.write(num+"\n");
            }
        }
        catch(IOException e){
            System.out.println("Вы: ошибка");
        }
    }
}
