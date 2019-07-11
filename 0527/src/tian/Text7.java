/*
	数组遍历：依次输出数组中的每一个元素
	
	length获取数组长度
	格式：
		数组名.length 返回数组的长度
	
	遍历数组的方法
	
	两个明确：
		返回值类型：void
		参数列表：int[] arr
		
*/


package tian;

public class Text7 {
	public static void main(String[] args) {
		//定义数组
		int[] arr= {11,22,33,44,55};
		
		//获取每一个元素
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("----------------");
		int[] arr2= {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		//数组元素不能靠人工数时
		//length获取数组长度
		//arr2.length;
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("------------------");
		int[] arr3= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		printArray(arr3);
	}
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
