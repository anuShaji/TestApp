package handlingExceptions;

public class ExampleNullPonterExec {
	public void test() {
		try {
			String a=null;
			System.out.println(a.length());
		}
		catch(NullPointerException np) {
			System.out.println("String has no value");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ExampleNullPonterExec np=new ExampleNullPonterExec();
np.test();
	}

}
