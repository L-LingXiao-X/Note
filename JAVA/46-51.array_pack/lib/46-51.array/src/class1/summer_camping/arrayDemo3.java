package src.class1.summer_camping;

public class arrayDemo3 {
    public static void main(String[] args) {
        //TODO:学会动态数组的定义&使用

        int[] arr = new int[3];

        //赋值
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 6;

        System.out.println(arr[1]);

        String[] names = new String[90];
        names[0] = "张三";
        names[3] = "李四";
        System.out.println(names[0]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
