package src.class2.summer_camping_plan;

import java.util.Scanner;
import java.util.Random;

public class arrayDemo5 {
    public static void main(String[] args) {
        //随机排名
        
        Scanner sc = new Scanner(System.in);
        
        int[] name = new int[5];

        //录入
        for (int i = 0; i < name.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个数字:");
            name[i] = sc.nextInt();
        }
        sc.close();

        //随机数组索引
        Random r = new Random();
        for (int i = 0; i < name.length; i++) {
            int ri = r.nextInt(name.length);
            int temp = name[i];
            name[i] = name[ri];
            name[ri] = temp;
        }

        //输出
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }

}
