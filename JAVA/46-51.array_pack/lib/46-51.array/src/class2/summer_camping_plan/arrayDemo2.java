package src.class2.summer_camping_plan;

public class arrayDemo2 {
    public static void main(String[] args) {
        //TODO: 数组的遍历求和

        int[] arr = {4, 10, 5 , 6};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }

        System.out.println(sum);
    }
}
