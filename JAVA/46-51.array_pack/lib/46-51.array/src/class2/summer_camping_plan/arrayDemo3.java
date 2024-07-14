package src.class2.summer_camping_plan;

public class arrayDemo3 {
    public static void main(String[] args) {
        //TODO:求最大值
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = 0;
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("正在处理元素：" + arr[i]);
            
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("最大值为：" + max);
    }
}
