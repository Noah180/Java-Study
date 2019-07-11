/*
	1.定义第一个数组，定义完毕后，给数组元素赋值。
	赋值完毕后，再输出数组名称和元素。
	2.定义第一个数组，定义完毕后，给数组元素赋值。
	赋值完毕后，再输出数组名称和元素。
	3.定义第一个数组，把第一个数组的地址值赋值给它。（注意类型一致），通过第三个数组的名称，去把元素重新赋值。
	最后再次输出第一个数组的数组名称和元素。
	
	栈内存的两个引用指向同一个堆内存空间。
	无论是它们睡的操作，都是针对同一个地方。
	
*/

package tian;

public class Text5 {
	public static void main(String[] args) {
		//1.
		int[] arr1=new int[2];
		arr1[0]=12;
		arr1[1]=23;
		System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println("------------------");
		//2.
		int[] arr2=new int[2];
		arr2[0]=13;
		arr2[1]=21;
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println("------------------");
		//3.
		int[] arr3=new int[2];
		arr3=arr2;
		arr3[0]=14;
		arr3[1]=25;
		System.out.println(arr3);
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
	}
}
