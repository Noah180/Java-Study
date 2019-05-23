//使用while循环打印1-100之间的偶数和
//再使用do-while打印

package Practice;

import java.util.Scanner;

public class Pra13 {
	public static void main(String[] args) {
		//使用while打印 
		int i=1,sum=0;
		while(i<=100) {
			if(i%2==1) {
				sum+=i;
			}
			i++;
		}
		System.out.println("和为"+sum);
		System.out.println("==========================");
		//使用do-while打印
		int j=0,sum1=0;
		do {
			if(j%2==1) {
				sum1+=j;
			}
			j++;
		}while(j<=100);
		System.out.println("和为"+sum1);
	}

}
