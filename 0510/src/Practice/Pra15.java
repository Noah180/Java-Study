//小明2000米长跑（5圈），跑第三圈的时候受伤了，

package Practice;

public class Pra15 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			
			if(i==3) {
				System.out.println("受伤了");
				System.exit(0);
			}
			System.out.println(i);
		}
	}

}
