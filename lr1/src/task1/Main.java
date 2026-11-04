package task1;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner option = new Scanner(System.in);
        System.out.println("Введите номер задания 1-3");
        int op = option.nextInt();
        switch (op){
            case 1:
                //   Scanner in = new Scanner(System.in);
                System.out.println("Введите число");
                int a = option.nextInt();
                System.out.println(Math.powExact(a,3));
                break;
            case 2:
                //Scanner in1 = new Scanner(System.in);
                System.out.println("Введите год");
                int year = option.nextInt();
                if(year/4==0 && year/400!=0 && year/100!=0){
                    System.out.println("Год високосный");
                }
                else{
                    System.out.println("Год не високосный");
                }
            case 3:
                Scanner in2 = new Scanner(System.in);
                System.out.println("Введите число");
                int n = in2.nextInt();
                float sum = 0;
                int i = 1;
                while(i<=n){
                    sum += 1.0/i;
                    i++;
                }
                System.out.println(sum);
            default:
                System.out.println("Такого задания няма :(");



        }

    }
}
