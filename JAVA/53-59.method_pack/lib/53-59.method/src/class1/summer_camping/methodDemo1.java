package class1.summer_camping;

public class methodDemo1 {
    public static void main(String[] args) {
        //no method
        int a =10;
        int b = 20;
        int c = a+b;
        System.out.println(c);

        int a1 = 10;
        int b1 = 20;
        int c1 = a1+b1;
        System.out.println(c1);

        //have method
        System.out.println(sum(10,20));
        System.out.println(sum(100,200));
    }

    public static int sum(int a,int b){
        return a+b;
    }
}
