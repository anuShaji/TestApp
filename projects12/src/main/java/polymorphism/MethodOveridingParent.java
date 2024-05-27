package polymorphism;

import java.util.Scanner;

public class MethodOveridingParent {
	static int age;
public int CheckEligiblity() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name");
	String str=sc.next();
	System.out.println("Enter your age");
	int age=sc.nextInt();
	this.age=age;
	System.out.println("Name is "+str+"\nAge is "+age);
	return age;
}
}
