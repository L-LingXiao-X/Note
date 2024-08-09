package class1.summer_camping;

public class methodDemo4 {
    public static int sum0(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        /*

        1.方法的编写顺序无所谓1

        2.方法与方法之间是平级关系，不能嵌套定义

            public static sum(int a;int b)
            {
            return a+b;
            }
        3.方法的返回值为 `void（无返回值）` ，方法内部不能使用 `return` 返回数据，如果方法的返回值写了具体类型，方法内部必须用 `return` 返回相对应类型数据  

        4.`return` 语句下面，不能编写代码（因为永远不会执行，属于无效的代码）

        5.方法不调用就不执行，调用时必须严格匹配方法的参数情况

        6.有返回值的方法调用时可以选择定义变量的接收结果，或者直接输出使用；无返回值的方法只能直接调用。
        
        */

        System.out.println(sum(1, 2));
        System.out.println(sum0(100, 2));

        //print(111);
        
        int rs = sum(100,2000);
        System.out.println(rs);

        System.out.println(sum(100,2000));

        sum(300,100);

        /*int rs1 = */print();
    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static void print(){
        System.out.println("HelloWorld");
        //return;
    }

    public static int print1(){
        System.out.println("HelloWorld");
        //return aaa;
        return 0;
    }

    public static int sum00(int a, int b){
        int c = a + b;
        return c;
        //System.out.println("can't");
    }
}
