/*
	���������������������е�ÿһ��Ԫ��
	
	length��ȡ���鳤��
	��ʽ��
		������.length ��������ĳ���
	
	��������ķ���
	
	������ȷ��
		����ֵ���ͣ�void
		�����б�int[] arr
		
*/


package tian;

public class Text7 {
	public static void main(String[] args) {
		//��������
		int[] arr= {11,22,33,44,55};
		
		//��ȡÿһ��Ԫ��
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("----------------");
		int[] arr2= {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		//����Ԫ�ز��ܿ��˹���ʱ
		//length��ȡ���鳤��
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
