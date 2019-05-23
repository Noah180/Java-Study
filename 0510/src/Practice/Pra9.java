//使用for循环计算1-100之间的奇数和，并打印

package Practice;

public class Pra9 {
	public static void main(String[] args) {
		int a=0;
		for(int i=0;i<=100;i++) {
			if(i%2==1) {
				a+=i;
			}
		}
		System.out.println(a);
	}

}
