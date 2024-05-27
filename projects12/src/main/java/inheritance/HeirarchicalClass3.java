package inheritance;

public class HeirarchicalClass3 extends HeirarchicalClass1 {
	public void print3() {
		System.out.println("Child Class2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeirarchicalClass3 c3=new HeirarchicalClass3();
		c3.print();
		c3.print3();
	}

}
