package handlingExceptions;

import java.io.IOException;

public class ExampleAritematicexception {
void div() {
	try {
		int a=20;
		int b=0;
		/*if(b==0) {
	    	throw new ArithmeticException("Cannot divide a number by zero it can cause an exception ");
	    }*/
		int val=a/b;
	    System.out.println(val);
	    
		
	}
	catch(ArithmeticException e) {
		System.out.println("Cannot divide a number by zero it can cause an exception "+e.getMessage());
	}
	finally {
		System.out.println("Finally Executes always");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ExampleAritematicexception are=new ExampleAritematicexception();
are.div();
	}

}
