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

public class Praa2 {
	public static void main(String[] args) {
		
		//1.从控制台输入月份m
		System.out.println("请输入月份：");
		Scanner input=new Scanner(System.in);
		int month=input.nextInt();
		
		//2.显示菜单
		System.out.println("--->2018年"+month+"月<---");
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		
		//3.计算本月共有多少天
		int monthDay=0,dayFeb=0;
		switch(month) {
		case 2:
			int year=2018;
			if((year%4==0&&year%100!=0)||(year%400==0)) {
				monthDay=29;
			}else {
				monthDay=28;
			}
			dayFeb=monthDay;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			monthDay=30;
			break;
		default:
			monthDay=31;
			break;
		}
		
		//4.第一天是星期几
		//4.1 计算年初到m-1月末共有多少天
		int day=0;
		/*switch(month) {
		case 12:
			day+=31;
		case 11:
			day+=30;
		case 10:
			day+=31;
		case 9:
			day+=30;
		case 8:
			day+=31;
		case 7:
			day+=31;
		case 6:
			day+=30;
		case 5:
			day+=31;
		case 4:
			day+=30;
		case 3:
			day+=31;
		case 2:
			day+=dayFeb;
		case 1:
			day+=31;			
		}*/
		for(int i=1;i<month;i++) {
			if(i==2) {
				day+=dayFeb;
			}else if(i==4||i==6||i==9||i==11) {
				day+=30;
			}else {
				day+=31;
			}
		}
		
		//4.2 根据天数d算出m月份第一天是星期几
		int week=day%7+1;
		
		//5.打印当月日历
		
		for(int i=1;i<=week;i++) {
			System.out.print("\t");
		}
		int tmp=0;
		for(int i=1;i<=monthDay;i++) {
			System.out.print(i+"\t");
			if(i+week==7) {
				//System.out.println();
				tmp=i;
			}
			if((i-tmp)%7==0) {
				System.out.println();
			}
		}
	}

}
