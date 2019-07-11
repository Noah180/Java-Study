//定义两个数组，分别输出两个数组各自的数组名及元素值
//然后给每个数组的元素重新赋值，再次分别输出

package tian;

public class Text4 {
	public static void main(String[] args) {
		//
		int[] a=new int[3];
		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("----------------");
		//
		int[] b=new int[2];
		System.out.println(b);
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println("-----------------");
		a[1]=12;
		a[2]=34;
		b[1]=3445;
		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("----------------");
		System.out.println(b);
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println("-----------------");
	}
}
