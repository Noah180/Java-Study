//已知2018年1月1日是星期一，从控制台输入任意月份，并打印出该月的日历
//1.从控制台输入月份m
//2.显示菜单
//3.计算本月共有多少天
//4.第一天是星期几
//4.1 计算年初到m-1月末共有多少天
//4.2 根据天数d算出m月份第一天是星期几
//5.打印当月日历

package practice;

import java.util.Scanner;

public class Pra2 {
	public static void main(String[] args) {
		//从控制台输入月份m
		System.out.println("请输入月份：");
		Scanner input=new Scanner(System.in);
		int m=input.nextInt();
		if((m<1)||(m>12)) {
			System.out.println("输入错误！");
			System.exit(0);
		}else {
			//2.显示菜单
			System.out.println("--------------------->2018年"+m+"月<--------------------");
			System.out.println("日\t一\t二\t三\t四\t五\t六");
			System.out.println();
			int d=0,day=0;
			//3.计算本月有多少天
			switch(m) {			
			case 2:
				d=28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				d=30;
				break;				
			default:
				d=31;
				break;
			}
			//4.1计算年初到m-1月共有多少天
			for(int i=1;i<m;i++) {
				switch(i) {
				case 2:
					d=28;
					break;
				case 4:
				case 6:
				case 9:
				case 11: 
					d=30;
					break;				
				default:
					d=31;
					break;
				}
				day+=d;
			}
			//4.2计算出m月份的第一天是星期几
			int t=day%7;
			//第m月份的第一天是星期t+1
			//打印日历
			if(t<6) {
				for(int j=1;j<=t;j++) {
					System.out.print("\t");
				}
			}
			int n1=1;
			for(int n=1;n<=d;n++) {
				
					System.out.print(n+"\t");
				
				//System.out.println();				
			}
				
		}
	}

}
