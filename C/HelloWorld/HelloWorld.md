# HelloWorld 程序

```c
//预处理 - 提前找到要用的东西
#include <stdio.h>

//业务代码
int/*整数-程序运行结果*/ main()	//程序主入口
{
    printf("HelloWorld!");	//输出内容
    return 0;				//返回值-程序结束
    /*
    程序返回结果0	- 正常
    程序返回非0	- 不正常
    */
}
```

*** `stdio` :StandardInputandOutput***

## 执行流程

1. 编写

2. 编译： ***把操作系统看不懂的内容转换为01 - `*.obj` 文件***

3. 链接/连接（组合）：***与头文件打包exe***

4. 运行

   

