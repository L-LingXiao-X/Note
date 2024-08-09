package class4.summer_camping;

public class methodDemo3 {
    public static void main(String[] args) {
        //TODO:【案例】比较两个数组是否一样
        System.out.println(cis(new int[]{1,2,3,4},new int[]{1,2,3,5}));
    }

    public static boolean cis(int[] arr1 ,int[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }else if(arr1.length == arr2.length && arr1.length != 0 && arr2.length != 0 && arr1 != null && arr2 != null){
            for (int i = 0; i < arr2.length;i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
