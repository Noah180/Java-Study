//输入一个年份，判断改年份是否为闰年

package Practice;

import java.util.Scanner;

public class Pra1 {
	public static void main(String[] args) {
		System.out.println("请输入一个年份：");
		Scanner input=new Scanner(System.in);
		int year=input.nextInt();
		if(year<1000||year>9999) {
			System.out.println("输入错误！");
			System.exit(0);
		}
		//！+表达式1表示取反
		//如果表达式1的值为真，则整个表达式的值为假
		//如果表达式1的值为假，则整个表达式的值为真
		//if(year>=1000&&year<=9999) {
		if(!(year<1000||year>9999))	{
			
			//if(表达式){
			//	语句1；
			//}else {			
			//	语句2；
			//}
			//如果表达式的值为真，则执行语句1
			//如果表达式的值为假，则执行语句2
			//注：语句1和语句2是并列结构，只能执行一句
			
			boolean ret=(year%4==0)&&(year%100!=0)||(year%400==0);
			if(ret) {
						
			//if(year%4==0&&year%100!=0||year%400==0) {
				System.out.println("这一年是闰年");
			}else {
				 System.out.println("这一年不是闰年");
			}
				
		}
			
	}

}
