package src.class1.summer_camping;

public class arrayDemo2 {
    public static void main(String[] args) {
        // TODO: 访问数组元素
        int[] arr = {1, 2, 3, 4, 5};

        //格式：数组名[下标]
        
        //取值
        System.out.println(arr[1]);

        //格式: 数组名[下标] = 值

        //赋值
        arr[1] = 100;
        System.out.println(arr[1]);

        //格式：数组名.length
        System.out.println(arr.length);
    }
}
