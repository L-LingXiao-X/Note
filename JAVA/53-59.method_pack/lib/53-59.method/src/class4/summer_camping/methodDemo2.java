package class4.summer_camping;

public class methodDemo2 {
    public static void main(String[] args) {
        //TODO:从数组中查找元素并返回对应的元素位置
        System.out.println(getIndex(new int[]{1,2,3,4,5,6,7,8,9}, 10));
    }

    public static int getIndex(int[] arrs , int num){
      for (int i = 0; i < arrs.length; i++) {
        if (i == num) {
            return i;
        }
      }
      return -1;
    }
}
