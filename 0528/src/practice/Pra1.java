/*
	 公司年销售额求和
	某公司按照季度和月份统计的数据如下：单位(万元)
	第一季度：22,66,44
	第二季度：77,33,88
	第三季度：25,45,65
	第四季度：11,66,99
	

*/

package practice;

import java.util.Scanner;

public class Pra1 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int[][] arr1=new int[4][3];
	
	for(int i=0;i<4;i++) {
		System.out.print("请输入第"+(i+1)+"季度销售额：");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		//System.out.println();	
		arr1[i][0]=a;
		arr1[i][1]=b;
		arr1[i][2]=c;
		
	}
	getArray(arr1);
	System.out.println("销售额总和为："+sum(arr1)+"万元");			
}
public static void getArray(int[][] arr) {
	for(int i=0;i<arr.length;i++) {
		System.out.print("第"+(i+1)+"季度销售额：");
		for(int j=0;j<arr[i].length;j++) {
			if(j==arr[i].length-1) {
				System.out.print(arr[i][j]);
			}else {
				System.out.print(arr[i][j]+",");
			}
			
			}
		System.out.println();
		}
	}
public static int sum(int[][] arr) {
	int b=0,a=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			a=arr[i][j];
			b+=a;
		}
		
	}
	
	return b;
}

}

