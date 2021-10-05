package defaultAndStaticMethod;

public interface B {
	static void fun() {
		System.out.println("Now static method can be written in interface ");
	}
}
class StaticMethodEx implements B{
	public static void main(String args[]) {
		B.fun();
	}
}
