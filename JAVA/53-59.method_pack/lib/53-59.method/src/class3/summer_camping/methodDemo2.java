package class3.summer_camping;

public class methodDemo2{
    public static void main(String[] args){
        //TODO:了解引用类型的参数传递（值传递）
        int[] arrs = new int[]{10,20,30};
        change(arrs);
        System.out.println(arrs[1]);
    }
    
    public static void change(int[] arrs){
        System.out.println(arrs[1]);
        arrs[1] = 888;
        System.out.println(arrs[1] + "\n");
    }
    /*
     * 20 
     * 888 
     * 888 
     */
}