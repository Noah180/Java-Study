/*
	1:面向对象思想
		面向对象是基于面向过程的编程思想。
			
		面向过程：强调的是每个功能的步骤
		面向对象：强调的是对象，然后由对象去调用功能
			
	2：面向对象的思想特点
		A：是一种更符合我们思想习惯的思想
		B：可以将复杂的事情简单化
		C:将我们从执行者变成了指挥者
		
		举例：
			买电脑：
				面向过程：了解电脑--了解自己的需求--找对应的参数信息--买电脑--讨价还价--买回电脑
				面向对象：买电脑--班长去买--班长买回来
			洗衣服：
				面向过程：把衣服脱下--找一个盆--放点洗衣粉--加点水--把衣服扔进去--洗衣服--拧干--晾起来
				面向对象：把衣服脱下--打开全自动洗衣机--扔进去--一键即可--晾起来
			吃饭：
				面向过程：去超市买菜--摘菜--洗菜--切菜--炒菜--盛起来--吃
				面向对象：去饭店吃饭--叫服务员--厨师做菜--服务员端菜--吃
				
				万事万物皆对象
				
	3：把大象装进冰箱
		面向过程：
			动作有哪些呢？
				A:打开冰箱门
				B:装进冰箱
				C:关闭冰箱门
				
			代码体现：
				class Demo{
					public static void main(String[] args){
						System.out.println("打开冰箱门");
						//打开冰箱门的动作，现在仅仅是为了演示，就写了一个输出语句
						//其实，它可能需要做很多操作
						//这个时候代码就比较多了
						//假设需要多次打开冰箱门，就应该用方法改进
						 * 
						System.out.println("装进大象");
						System.out.println("关闭冰箱门");
						
						//写了方法以后，调用就改变了
						open();
						in();
						close();
					}
					public static void open(){
						System.out.println("打开冰箱门");
					}
					public static void in(){
						System.out.println("装进大象");
					}
					public static void close(){
						System.out.println("关闭冰箱门");
					}
				}
				
	面向对象：
		我们怎么才能更符合面向对象思想呢？
			A:有哪些类呢？
			B:每个类有哪些东西？
			C:类与类之间的关系是什么？
			
		把大象装进冰箱的分析？（如何分析有哪些类呢？UML。名词提取法。）
			A:有哪些类呢？
				大象
				冰箱
				Demo
			B:每个类有哪些东西？
				大象：
					进去
				冰箱：
					开门
					关门
				Demo:
					main方法
			C:类与类之间的关系是什么？
				Demo中使用大象和冰箱类的功能
				
		代码体现：
			class 大象{
				public static void in(){
					System.out.println("装进大象");
				}
			}
			
			class 冰箱{
				public static void open(){
					System.out.println("打开冰箱门");
				}
							
				
				public static void close(){
					System.out.println("关闭冰箱门");
				}
			}
				
			class Demo{
				public static void main(String[] args){
					冰箱调用开门
					大象调用进去
					冰箱调用关门
				}
			}	
			
	4：开发、设计、特征
		面向对象开发
			不断的创建对象，使用对象，指挥对象做事情。
		面向对象设计
			其实就是在管理和维护对象之间的关系。
		面向对象特征
			封装（encapsulation）
			继承（inheritance）
			多态（polymorphism）
			
*/

package object_Orientation;

public class Text1 {

}
