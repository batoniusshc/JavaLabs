package z4;

import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        File f = new File("f.txt");

        try (FileWriter fileWriter = new FileWriter(f)){
            System.out.println("Введите 15 вещ чисел");
            Scanner scanner = new Scanner(System.in);
            for(int i=0;i<15;i++){
                fileWriter.write(scanner.nextDouble()+"\n");
            }
        }
        catch (IOException e ){
            System.out.println("Вы: ошибка");
        }
        try (BufferedReader fileReader = new BufferedReader(new FileReader(f))){
            double averageSpeed = 0;
            String line;
            while((line = fileReader.readLine())!=null){
                averageSpeed += Double.parseDouble(line);
            }
            System.out.println(averageSpeed/15);
        }
        catch(IOException e ){
            System.out.println("Вы: ошибка");
        }
    }
}
