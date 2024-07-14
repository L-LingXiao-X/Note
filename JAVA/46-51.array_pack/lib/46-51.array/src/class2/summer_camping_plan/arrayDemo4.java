package src.class2.summer_camping_plan;

import java.util.Random;
import java.util.Scanner;

public class arrayDemo4 {
    public static void main(String[] args) {
        //TODO:猜数字游戏
        Random random = new Random();
        
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
        }
        Scanner scanner = new Scanner(System.in);
        OUT:
        while (true) {
            
            int a = scanner.nextInt();
            
            for (int i = 0; i < arr.length; i++) {
                if (a == arr[i]) {
                    System.out.println("猜对了！");
                    break OUT;
                }
            }

            System.out.println("XXXXX");
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        scanner.close();
    }
}
