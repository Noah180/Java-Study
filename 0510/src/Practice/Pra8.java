//使用while循环打印1-100之间的偶数和
//再使用do-while打印

package Practice;

public class Pra8 {
	public static void main(String[] args) {
		//1.使用while循环打印
		int i=1,a=0;
		while(i<=100) {
			if(i%2==0) {
				a+=i;
			}
			i++;
		}
		System.out.println(a);
		System.out.println("========================");
		//2.使用do-while打印
		int j=1,b=0;
		do {
			if(j%2==0) {
				
				b+=j;
			}
			j++;
		}while(j<=100);
		System.out.println(b);
		System.out.println("========================");
		//3.使用for循环
		int c=0;
		for(int n=1;n<=100;n++) {
			if(n%2==0) {
				c+=n;
			}
		}
		System.out.println(c);
	}

}
