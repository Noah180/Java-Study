package tian;

//switch语句：首先判断表达式的值，跟下面的每一个常量比较，如果等于某个常量的值，则从这个常量开始依次往下执行。

//	switch(表达式){
//	case 常量1：
//		语句1；
//	case 常量2：
//		语句2；
//	。。。
//	case 常量n：
//		语句n；
//	default:
//		语句m；
//	}

//break，表示结束switch结构，或者是循环
//if-else if-else做等值比较，可以转换成switch

//System.exit(0):结束整个进程
//break：结束switch，或循环

//case和default顺序可以互换
//default可以省略
//如果case后面的语句相同，case可以合并
//case后面的常量不能相同
//switch表达式可以是整型、字符型、字符串、枚举类型都可以，但是不能是浮点型和Boolean类型

public class Text2 {
	public static void main(String[] args) {
		int a=2,ret=0;
		switch(a) {
		case 1:
			ret++;
			System.out.println("-------1");
		case 2:
			ret++;
			System.out.println("-------2");
		case 3:
			ret++;
			System.out.println("-------3");
		default:
			ret++;
			System.out.println("default");
		}
		System.out.println(ret);
	}

}
