package class4.summer_camping;

public class methodDemo1 {
    public static void main(String[] args){
        //TODO:【案例】打印整形数组内容
        print_arr(new int[]{1,2,3,4,5,6,7,8,9,10});
    }

    public static void print_arr(int[] arr){
        System.out.print("该数组内容为：[" );
        if (arr != null && arr.length > 0) {
            for(int i = 0; i < arr.length; i++){
                /*
                if( i != arr.length - 1){
                    System.out.print(arr[i] + ",");
                }else{
                    System.out.print(arr[i]);
                }
                */
                System.out.print(i != arr.length - 1 ? arr[i] + "," : arr[i]);
            }
        }else{
            System.out.print("NULL");
        }
        System.out.println("]");    
    }
}
