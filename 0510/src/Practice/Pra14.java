//敲7，逢7就过

package Practice;

import java.util.Scanner;

public class Pra14 {
	public static void main(String[] args) {
		System.out.println("请说一个开始的数字：");
		Scanner input=new Scanner(System.in);
		int i=input.nextInt();
		if(i<=0||i>100) {
			System.out.println("不符合要求！");
			System.exit(0);
		}
		for(;i<=100;i++) {
			
			if((i%7==0)||(i%10==7)||(i/10==7)) {
				continue;
			}
			System.out.println(i);
		}
		
			
		
			
	}
}
