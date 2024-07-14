package src.class2.summer_camping_plan;

public class arrayDemo6 {
    public static void main(String[] args) {
        //TODO:冒泡排序

        int[] arr = {20,53,12,76,78};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length -1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int arr2 = 0; arr2 < arr.length; arr2++) {
            System.out.print(arr[arr2] + "\t");
        }
    }
}
