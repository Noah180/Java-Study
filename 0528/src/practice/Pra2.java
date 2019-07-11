/*
	打印杨辉三角（行数可以键盘录入）
*/

package practice;
import java.util.Scanner;
public class Pra2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入行数：");
		int n=input.nextInt();
		int[][] arr1=new int[n][n];
		System.out.println("输出的杨辉三角如下：");
		get(arr1);
	}
	public static void get(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i][0]=1;
			arr[i][i]=1;
			System.out.println();
			
			for(int j=0;j<=i;j++) {
				if(j==0||j==i) {
					System.out.print("1\t");
				}else {
					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
					System.out.print(arr[i][j]+"\t");	
				}
							
			}
			System.out.println();
			
			
		}
	}
}
