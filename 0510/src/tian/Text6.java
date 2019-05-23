//跳转语句
//break，结束switch或循环
//continue，结束当前循环，继续下一次循环
//return，结束当前函数，它后面的代码没有意义
//System.exit(0)，结束整个进程

package tian;

public class Text6 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			if(i==3) {
				continue;
				//break;
			}
			System.out.println(i);
		}
		//System.exit(0)，结束整个进程
		System.exit(0);
		System.out.println("===============");
		
	}

}
