//循环:重复的工作

//	初始条件
//	while（判断条件）{
//		语句；
//		变化条件；
//	}

//首先执行初始条件
//while里面，先执行判断条件，如果满足，则执行语句，变化条件
//再执行判断条件，如果满足，则执行语句，变化条件
//......
//再执行判断条件，直到不满足，结束while循环
//死循环：无限循环

package tian;

public class Text3 {
	public static void main(String[] args) {
		//System.out.println("hello");
		//打印十遍
		int i=1;
		while(i<=50) {
			System.out.println("hello");
			i++;
			if(i==5) {
				break;
			}
		}
	}

}
