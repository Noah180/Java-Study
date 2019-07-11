/*
	二维数组：就是元素为一维数组的数组。
	
	格式1：
		数据类型[][] 数组名=new 数据类型[m][n];
		
		m：表示这个二维数组有多少个一维数组
		n：表示每一个一维数组的元素有多少个
		
	格式2：
		数据类型[][] 数组名=new 数据类型[m][];
		
		m:表示这个二维数组有多少个一维数组。
		列数没有给出，可以动态的给，变化的列数
		
	格式3：
		数据类型[][] 变量名=new 数据类型[][]{{元素...},{元素...}..{元素...}};
		简化格式：
			数据类型[][] 变量名={{元素...},{元素...}..{元素...}};
		
	注意：
		1.以下格式也可以表示二维数组
			数据类型 数组名[][]=new 数据类型[m][n];
			数据类型[] 数组名[]=new数据类型[m][n];
		2.注意下面定义的区别
			int x，y;
			int[] x,y[];
			
*/

package Array2;

public class Text1 {
	public static void main(String[] args) {
		//格式1
		int[][] arr=new int[3][2];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println("-------------------");
		//格式2
		int[][] arr2=new int[3][];
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		arr2[0]=new int[3];
		arr2[1]=new int[2];
		arr2[2]=new int[1];
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		System.out.println(arr2[0][0]);
		System.out.println(arr2[0][1]);
		System.out.println(arr2[0][2]);
		System.out.println("-------------------");
		//格式3
		int[][] arr3= {{1,1,2},{2,3,4},{1}};
		System.out.println(arr3);
		System.out.println(arr3[0][0]);
		System.out.println(arr3[1][1]);
		System.out.println(arr3[0][2]);
	}
}
