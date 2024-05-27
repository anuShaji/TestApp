package inheritance;

public class HeirarchicalClass2 extends HeirarchicalClass1{
	public void print1() {
		System.out.println("child class1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeirarchicalClass2 c2=new HeirarchicalClass2();
		c2.print();
		c2.print1();
	}

}
