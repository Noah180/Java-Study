/*
	main�����ĸ�ʽ���⣺
		public static void main(String[] args){...}
		
		public:�����ģ�����Ȩ�������ġ�����main�����Ǳ�jvm���ã�����Ȩ��Ҫ����
		static:��̬�ģ�����Ҫ��������ͨ�������Ϳ��ԡ�����jvm�ĵ��á�
		void:��Ϊ��������˵���������ķ���ֵ�Ƿ��ظ������ߣ���main�����Ǳ�jvm���á��������ݸ�jvmû�����塣
		main:��һ����������ڡ������������Զ�����main��Ϊ��ڡ�
		String[] args:�ַ������顣
			�������������Ϊ�˽��ռ���¼������ݵġ�
			��ʽ�ǣ�
				java MainDemo hello worid java
*/

package testStatic;



class MainDemo {
	public static void main(String[] args) {
		
		//System.out.println(args); //@1c2c22f3
		//System.out.println(args.length); //0
		//System.out.println(args[0]); //ArrayIndexOutOfBoundsException
		
		//�������ݺ�
		System.out.println(args); 
		System.out.println(args.length); 
		//System.out.println(args[0]); 
	}
}
