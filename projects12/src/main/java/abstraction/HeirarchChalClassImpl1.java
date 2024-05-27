package abstraction;

public class HeirarchChalClassImpl1 implements HeirarChichalInterface {

	

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1...");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2....");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HeirarchChalClassImpl1 h1=new HeirarchChalClassImpl1();
h1.m1();
h1.m2();
	}
}
