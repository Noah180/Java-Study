/*
	二维数组遍历：
		
*/


package Array2;

public class Text2 {
	public static void main(String[] args) {
		int [][] arr1= {{1,2,3},{4,5,6},{7,8,9}};
		getArray(arr1);
		System.out.println("--------------------");
		
	}
	public static void getArray(int[][] arr) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("[");
			for(int j=0;j<arr[i].length;j++) {
				if(j==arr[arr.length-1].length-1) {
					System.out.print(arr[i][j]+"]");
				}else {
					System.out.print(arr[i][j]+",");
				}
			}
			System.out.println();
		}
		
		
	}
}
