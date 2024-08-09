package class3.summer_camping;

public class methodDemo1 {
    public static void main(String[] args){
        //TODO:了解JAVA的值传递
        int a = 10;
        change(a);
        System.out.println(a);
    }

    public static void change(int a){
        a = 100;
    }
}
