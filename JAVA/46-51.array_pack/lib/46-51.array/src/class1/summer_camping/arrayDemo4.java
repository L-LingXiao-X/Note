package src.class1.summer_camping;

public class arrayDemo4 {
    public static void main(String[] args) {
        //TODO:了解动态初始化元素默认值
        
        //整形  0
        int[] arr = new int[3];
        System.out.println(arr[0]);

        //字符  0
        char[] arr1 = new char[3];
        System.out.println((int)arr1[0]);
                          /*字符的编号0 */
        
        //整数浮点型 0.0
        double[] arr2 = new double[3];
        System.out.println(arr2[0]);

        //布尔型  false
        boolean[] arr3 = new boolean[3];
        System.out.println(arr3[0]);

        //引用类型  null
        String[] arr4 = new String[3];
        System.out.println(arr4[0]);
    }
}
