/*
	某个公司采用公用电话传递数据信息，数据是小于8位的整数，为了确保安全，在传过程中需要加密，加密规则如下：
		首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字，
		最后将第一位和最后一位数字交换。请注意给定一个小于8位的整数
		然后，把加密后的结果在控制台打印出来
		
		1.输入小于8位的整数
		2.将数据逆序
		3.每位数字加5，除以10取余代替该数字
		4.第一位和最后一位交换
		5.打印
*/


package practice;
import java.util.Scanner;
public class Pra3 {
	public static void main(String[] args) {
		//1.输入小于8位的整数
		Scanner input=new Scanner(System.in);
		System.out.println("请输入数据的位数：");
		int n=input.nextInt();
		System.out.println("请输入这个"+n+"位数：");
		int[] arr1=new int[n];
		for(int i=0;i<arr1.length;i++) {
			int m=input.nextInt();
			arr1[i]=m;
		}
		getNum(arr1);
		getJiami(arr1);
	}
	public static void getNum(int[] arr) {
		System.out.println("你输入的数据为：");
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]);
					
		}
		System.out.println();
	}
	//2.将数据逆序
	//3.每位数字加5，除以10取余代替该数字
	//4.第一位和最后一位交换
	public static void getJiami(int[] arr) {
		//逆序
		for(int i=0;i<(arr.length/2);i++) {
			int temp;
			temp=arr[i];
			arr[i]=arr[arr.length-1-i];	
			arr[arr.length-1-i]=temp;
		}
		for(int r=0;r<arr.length;r++) {
			//System.out.print(arr[r]);
		}
		
		//System.out.println();
		//每位数字加5，除以10取余代替该数字
		for(int j=0;j<arr.length;j++) {
			
			arr[j]=(arr[j]+5)%10;
			//System.out.print(arr[j]);
		}
		//System.out.println();
		//第一位和最后一位交换
		int tmp;
		tmp=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=tmp;
		System.out.println("加密后的结果为：");
		for(int p=0;p<arr.length;p++) {
			System.out.print(arr[p]);
		}
	}
}
