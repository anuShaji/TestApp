package abstraction;

public class ChildClassForInterface implements ParentInterface1,ParentInterface2{//multiple inheritance

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Interface 2");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int sum=a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ParentInterface1 p1=new ChildClassForInterface();//creating interface object
p1.add();
ParentInterface2 p2=new ChildClassForInterface();
p2.display();

	}

}
