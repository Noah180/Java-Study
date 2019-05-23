//A刚工作时的工资是4500元，公司每年涨工资的幅度是基本工资的30%，问5年后，A的工资是多少？

package Practice;

public class Pra11 {
	public static void main(String[] args) {
		float a=4500;
		
		for(int i=1;i<=5;i++) {
			a*=1.3;
		}
		System.out.println(a);
	}

}
