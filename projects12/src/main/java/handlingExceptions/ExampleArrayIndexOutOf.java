package handlingExceptions;

import java.util.Scanner;

public class ExampleArrayIndexOutOf {
public void test() {
	try {
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the position in array to enter the value");
		int pos=sc.nextInt();
		System.out.println("Enter the value");
		int val=sc.nextInt();
		a[pos]=val;
		System.out.println(val+" is entered at position " +pos);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("available positions are between 0 to 9 ");
	}
	finally {
		System.out.println("Finally block testion");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleArrayIndexOutOf ex=new ExampleArrayIndexOutOf();
		ex.test();

	}

}
