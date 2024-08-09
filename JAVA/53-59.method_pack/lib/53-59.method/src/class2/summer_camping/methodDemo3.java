package class2.summer_camping;

public class methodDemo3 {
    public static void main(String[] args){
        //TODO:【案例】数组求最值-方法
        System.out.println(ms(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }

    public static int ms(int[] a){
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
}
