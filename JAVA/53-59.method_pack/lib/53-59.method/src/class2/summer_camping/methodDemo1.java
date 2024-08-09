package class2.summer_camping;

public class methodDemo1 {
    public static void main(String args[]){
        //TODO:【案例】计算1到n的和返回
        int rs = sum(5);
        System.out.println(rs);
    }

    public  static int sum(int n){
        int sum = 0;
        for(int i = 0 ; i <= n ; i++){
            sum += i;
        }
        return sum;
    }
}
