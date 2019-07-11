/*
	数组元素逆序
	
	分析：
		1.定义一个数组，并进行静态初始化
		2.思路
			把0索引和arr.length-1的数据交换
			。。。
			
*/


package tian;

public class Text9 {
	public static void main(String[] args) {
		int[] arr= {23,34,35,2,4,6};
		int tmp;
		for(int i=0;i<(arr.length)/2;i++) {
			tmp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=tmp;
		}
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
		
	}
}
