//1.录入班级人数和学员成绩，计算班级学员的平均成绩
//2.2012年培养学员8万人，每年增长25%，请问按此增长速度，到哪一年培训学员人数将达到20万人？
//3.输入年、月，计算出这一年从年初开始到这一天共有多少天？

package Practice;

import java.util.Scanner;

public class Pra12 {
	public static void main(String[] args) {
		//1.录入班级人数和学员成绩，计算班级学员的平均成绩
		System.out.println("请输入班级人数：");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int sum=0;
		System.out.println("请输入学员成绩：");
		for(int i=0;i<a;i++) {
			int b=input.nextInt();
			sum+=b;
		}
		int var=sum/a;
		System.out.println("平均成绩为：");
		System.out.println(var);
		System.out.println("==================================");
		//2.2012年培养学员8万人，每年增长25%，请问按此增长速度，到哪一年培训学员人数将达到20万人？
		int m=80000,n=200000;
		int j=0;
		while(m<=n) {
			m*=1.25;
			j++;
		}
		System.out.println(j);
		//3.输入年、月、日，计算出这一年从年初开始到这一天共有多少天？
		System.out.println("================================");
		System.out.println("请输入年份：");
		Scanner input1=new Scanner(System.in);
		int Y=input.nextInt();
		if(Y<1000||Y>9999) {
			System.out.println("输入错误！");
			System.exit(0);			
		}
		System.out.println("请输入月份：");
		int M=input.nextInt();
		if(M<1||M>12) {
			System.out.println("输入错误！");
			System.exit(0);			
		}
		System.out.println("请输入日期：");
		int D=input.nextInt();
		if(D<1||D>30) {
			System.out.println("输入错误！");
			System.exit(0);			
		}
		int day_sum=0;
		for(int q=1;q<M;q++) {
			int day=0;
			switch(q) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				day=31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				day=30;
				break;
			case 2:
				if(((Y%4==0)&&(Y%100!=0))||(Y%400==0)) {
					day=29;
				}else {
					day=28;
				}
			}
			day_sum+=day;
		}
		int Day_sum=day_sum+D;
		System.out.println(Y+"年1月1日开始，到"+M+"月"+D+"日为止，共经历了"+Day_sum+"天");
	}

}
