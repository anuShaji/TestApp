package abstraction;

public class Class2 extends ClassAbstract1{

	

	@Override
	void shape() {
		// TODO Auto-generated method stub
		System.out.println("abstract method implemented from abstract class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Class2 c2=new Class2();
c2.shape();
c2.display();
	}

}
