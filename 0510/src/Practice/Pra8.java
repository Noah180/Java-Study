//ʹ��whileѭ����ӡ1-100֮���ż����
//��ʹ��do-while��ӡ

package Practice;

public class Pra8 {
	public static void main(String[] args) {
		//1.ʹ��whileѭ����ӡ
		int i=1,a=0;
		while(i<=100) {
			if(i%2==0) {
				a+=i;
			}
			i++;
		}
		System.out.println(a);
		System.out.println("========================");
		//2.ʹ��do-while��ӡ
		int j=1,b=0;
		do {
			if(j%2==0) {
				
				b+=j;
			}
			j++;
		}while(j<=100);
		System.out.println(b);
		System.out.println("========================");
		//3.ʹ��forѭ��
		int c=0;
		for(int n=1;n<=100;n++) {
			if(n%2==0) {
				c+=n;
			}
		}
		System.out.println(c);
	}

}
