//for循环
//for（初始条件；判断条件；变化条件）{
//	语句；
//}
//首先执行初始条件，然后判断条件，如果满足，则执行语句，然后执行变化条件
//....
//直到判断条件不满足，for结束

//语句遇到{}，{}里面的内容是子语句
//变量作用域：变量的有效范围
//变量的作用域是从定义处开始，到它被包含的{}为止

package tian;

public class Text5 {
	public static void main(String[] args) {
		int i=0;
		for(int j=0;j<=100;j++) {
			i+=j;
		}
		System.out.println(i);
	}
}
