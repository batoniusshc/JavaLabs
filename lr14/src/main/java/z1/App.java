package z1;

import java.io.*;
public class App {
    public static void main(String[] args) {
        File file = new File("dream");
        try(FileWriter fileWriter = new FileWriter(file)){
            fileWriter.write("Моя мечта это слетать на концерт Twenty One Pilots");

            System.out.println("Имя файла " + file.getName());
            System.out.println("Размер файла " + file.length());
            System.out.println("Путь " + file.getAbsolutePath());
            System.out.println("Существует " + file.exists());
        }
        catch (IOException e){
            System.out.println("Пока "+e);
        }
        try(BufferedReader fileReader =new BufferedReader(new FileReader(file))){
            String line;
            while((line = fileReader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println("Пока "+ e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
