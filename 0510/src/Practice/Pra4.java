//从控制台输入成绩，并显示等级
//90-100，优
//70-89，良
//60-70，及格
//0-59，不及格

package Practice;

import java.util.Scanner;

public class Pra4 {
	public static void main(String[] args) {
		System.out.println("请输入成绩：");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		if((a<0)||(a>100)) {
			System.out.println("输入错误，请重新输入！");
		}else if((a>=0)&&(a<60)) {
			System.out.println("不及格");
		}else if((a>=60)&&(a<70)) {
			System.out.println("及格");
		}else if((a>=70)&&(a<90)) {
			System.out.println("良");
		}else {
			System.out.println("优");
		}
	}

}
