//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package lr2;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер задания 1-2");
        int task = in.nextInt();
        switch (task) {
            case 1:
                System.out.println("Введите размер массива");
                int n = in.nextInt();
                int[] nums = new int[n];

                for(int i = 0; i < nums.length; ++i) {
                    nums[i] = (int)(Math.random() * (double)100.0F);
                    System.out.print(nums[i] + " ");
                }

                for(int i = 0; i < nums.length; ++i) {
                    if (nums[i] % 5 == 0 && nums[i] % 3 == 0) {
                        System.out.println(i);
                    }
                }
                break;
            case 2:
                System.out.println("Введите размер массива");
                int n1 = in.nextInt();
                int n2 = in.nextInt();
                int[][] nums1 = new int[n1][n2];

                for(int i = 0; i < nums1.length; ++i) {
                    System.out.println("\n");

                    for(int j = 0; j < nums1[i].length; ++j) {
                        nums1[i][j] = -50 + (int)(Math.random() * (double)100.0F);
                        System.out.print(nums1[i][j] + " ");
                    }
                }

                System.out.println("\n");
                int sum = 0;
                int count = 0;

                for(int i = 0; i < n1; ++i) {
                    for(int j = 0; j < n2; ++j) {
                        if (i < j) {
                            sum += nums1[i][j];
                            if (nums1[i][j] >= 0) {
                                ++count;
                            }
                        }
                    }
                }

                System.out.println("Сумма " + sum + " Кол-во положительных " + count);
                break;
            default:
                System.out.println("Такого задания няма :(");
        }

        in.close();
    }
}
