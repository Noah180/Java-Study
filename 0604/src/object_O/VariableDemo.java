/*
	��Ա�����;ֲ�����������
		A:�����е�λ�ò�ͬ
			��Ա�����������з����⡣
			�ֲ��������ڷ��������л��߷��������ϡ�
		B:���ڴ��е�λ�ò�ͬ
			��Ա�������ڶ��ڴ�
			�ֲ���������ջ�ڴ�
		C:�������ڲ�ͬ
			��Ա���������Ŷ���Ĵ��������ڣ����Ŷ������ʧ����ʧ
			�ֲ����������ŷ����ĵ��ö����ڣ����ŷ����ĵ�����϶���ʧ
		D:��ʼ��ֵ��ͬ
			��Ա��������Ĭ�ϳ�ʼ��ֵ
			�ֲ�������û��Ĭ�ϳ�ʼ��ֵ�����붨�塢��ֵ��Ȼ�����ʹ�á�
			
		ע�����
			�ֲ��������ƿ��Ժͳ�Ա��������һ�����ڷ�����ʹ�õ�ʱ�򣬲��õ��Ǿͽ�ԭ��
*/

package object_O;

class Variable{
	//��Ա����
	int num=10;
	
	public void show() {
		int num2 = 0; //�ֲ�����
		System.out.println(num2);
		int num=100;
		System.out.println(num);
	}
}
public class VariableDemo {
	public static void main(String[] args) {
		Variable v=new Variable();
		
		System.out.println(v.num);
		
		v.show();
	}

}
