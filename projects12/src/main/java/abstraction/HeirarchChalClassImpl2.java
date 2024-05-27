package abstraction;

public class HeirarchChalClassImpl2 implements HeirarChichalInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HeirarchChalClassImpl2 h2=new HeirarchChalClassImpl2();
h2.m1();
h2.m2();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2");
	}

}
