/*
	1.�����һ�����飬������Ϻ󣬸�����Ԫ�ظ�ֵ��
	��ֵ��Ϻ�������������ƺ�Ԫ�ء�
	2.�����һ�����飬������Ϻ󣬸�����Ԫ�ظ�ֵ��
	��ֵ��Ϻ�������������ƺ�Ԫ�ء�
	3.�����һ�����飬�ѵ�һ������ĵ�ֵַ��ֵ��������ע������һ�£���ͨ����������������ƣ�ȥ��Ԫ�����¸�ֵ��
	����ٴ������һ��������������ƺ�Ԫ�ء�
	
	ջ�ڴ����������ָ��ͬһ�����ڴ�ռ䡣
	����������˯�Ĳ������������ͬһ���ط���
	
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
