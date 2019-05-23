//从控制台输入一个数，判断是奇数还是偶数

package Practice;

import java.util.Scanner;

public class Pra2 {
	public static void main(String[] args) {
		System.out.println("请输入一个数：");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		if(a==0) {
			System.out.println("0既不是奇数，也不是偶数！");
		}else {
			if(a%2==0) {
				System.out.println("这个数是偶数");
			}else {
				System.out.println("这个数是奇数");
				
			}
			
		}
	}

}
