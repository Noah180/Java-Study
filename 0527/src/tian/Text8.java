/*
	�����ȡ��ֵ
	
	������
		1.����һ�����飬���������Ԫ�ؽ��о�̬��ʼ����
		2.����������һ��Ԫ����Ϊ�����һ���һ������Ĭ��Ϊ���ֵ
		3.Ȼ�����������Ԫ��ֵ��һ�κͲ�����Ƚϣ�������£�С���뿪
		4.�����������汣��ľ������ֵ
	
*/


package tian;

public class Text8 {
	public static void main(String[] args) {
		int[] arr= {12,22,45,23,2};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}
