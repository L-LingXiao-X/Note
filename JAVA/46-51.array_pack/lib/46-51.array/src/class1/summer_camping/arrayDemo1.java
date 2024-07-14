package src.class1.summer_camping;

public class arrayDemo1 {
    public static void main(String[] args) {
        //TODO:静态初始化方式定义数组
        //完整语法
        //数据类型[] 数组名 = new 数据类型[]{元素1,元素2,元素3...};
        int[] arr = new int[]{20,10,80,60,90};
        double[] arr2 = new double[]{20.0,10.0,80.0,60.0,90.0};
        //简略语法
        //数据类型[] 数组名 = {元素1,元素2,元素3...};
        int[] arr3 = {20,10,80,60,90};
        System.out.println(arr);
        System.out.println(arr2);
        System.out.println(arr3);

        //基本原理demo
        System.out.println(arr3);
      }
}
