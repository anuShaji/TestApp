package abstraction;

public class MultilevelClassImpl implements MultilevelInterface2{

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("The car is about to stop");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("The car is about to run");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MultilevelInterface2 m2=new MultilevelClassImpl();
m2.stop();
m2.start();
	}
}
