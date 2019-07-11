/*
	private:
		是一个权限修饰符
		可以修饰成员变量和成员方法
		被其修饰的成员只能在本类中被访问
*/

package object_O;

class Demo11{
	private int num=10;
	public void show() {
		System.out.println(num);
	}
}
class Pri {
	public static void main(String[] args) {
		Demo11 d=new Demo11();
		//System.out.println(d.num);
	}

}
