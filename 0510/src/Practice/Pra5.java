//从控制台输入年份、月份，打印该月份的天数

package Practice;

import java.util.Scanner;

public class Pra5 {
	public static void main(String[] args) {
//		1.从控制台输入年份
		System.out.println("请输入年份：");
		Scanner input=new Scanner(System.in);
		int Y=input.nextInt();
		if((Y<1000)||(Y>9999)) {
			System.out.println("输入错误！");
			System.exit(0);
		}
//		2.从控制台输入月份
		System.out.println("请输入月份：");
		int M=input.nextInt();
		if((M<1)||(M>12)) {
			System.out.println("输入错误！");
			System.exit(0);
		}
		
//		3.用switch判断，如果是二月份，需要先计算该年份是否为闰年
		switch(M) {
		//case后面的语句相同，case可以合并
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("这个月有31天。");
			break;
		case 2:
			boolean ret=((Y%4==0)&&(Y%100!=0))||(Y%400==0);
			if(ret) {
				System.out.println("这个月有29天。");
			}else {
				System.out.println("这个月有28天。");
			}
			break;			
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("这个月有30天。");
			break;
			//default可以省略
		/*default:
			System.out.println("输入错误");
			System.exit(0);
			break;*/
		}
	}

}
