//do-while循环

//do {
//	表达式；
//}while（语句）；

//首先执行表达式，判断语句
//如果语句成立，再执行表达式，再判断语句
//.....
//直到语句不成立，则结束整个循环，继续向下运行

//注意点：
//1.while循环先判断，再执行，do-while是先执行再判断，do-while执行的次数至少一次
//2.不需要记住while和do-while执行内容，记住流程，do-while先执行
//3.while和do-while，执行循环时，一定要注意临界点
//

package tian;

public class Text4 {
	public static void main(String[] args) {
		int i=1;
		do{
			System.out.println(i);
			i++;
		}while(i<=3);
	}

}
