package tian;

//switch��䣺�����жϱ��ʽ��ֵ���������ÿһ�������Ƚϣ��������ĳ��������ֵ��������������ʼ��������ִ�С�

//	switch(���ʽ){
//	case ����1��
//		���1��
//	case ����2��
//		���2��
//	������
//	case ����n��
//		���n��
//	default:
//		���m��
//	}

//break����ʾ����switch�ṹ��������ѭ��
//if-else if-else����ֵ�Ƚϣ�����ת����switch

//System.exit(0):������������
//break������switch����ѭ��

//case��default˳����Ի���
//default����ʡ��
//���case����������ͬ��case���Ժϲ�
//case����ĳ���������ͬ
//switch���ʽ���������͡��ַ��͡��ַ�����ö�����Ͷ����ԣ����ǲ����Ǹ����ͺ�Boolean����

public class Text2 {
	public static void main(String[] args) {
		int a=2,ret=0;
		switch(a) {
		case 1:
			ret++;
			System.out.println("-------1");
		case 2:
			ret++;
			System.out.println("-------2");
		case 3:
			ret++;
			System.out.println("-------3");
		default:
			ret++;
			System.out.println("default");
		}
		System.out.println(ret);
	}

}
