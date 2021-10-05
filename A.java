package defaultAndStaticMethod;

public interface A {
void birth();
void dead();
default void accident() {
	System.out.println("This is unexpected stage of Human Life Cycle");
}
}
class HumanLifeCycle implements A{

	@Override
	public void birth() {
		// TODO Auto-generated method stub
		System.out.println("This is initial stage of Human Life cycle");
	}

	@Override
	public void dead() {
		// TODO Auto-generated method stub
		System.out.println("This is final stage of Human Life cycle");	
	}
	public static void main(String []args) {
		HumanLifeCycle obj=new HumanLifeCycle();
		obj.birth();
		obj.accident();
		obj.dead();
	}
}
	

