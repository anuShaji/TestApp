package polymorphism;

import java.util.Scanner;

public class MethodOverRidingChild extends MethodOveridingParent {
public int  CheckEligiblity() {
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter the voting id");
	int voterId=sc1.nextInt();
	super.CheckEligiblity();
	
	if(super.age>=18) {
		System.out.println("Eligible for voting");
	}else {
		System.out.println("Not eligible for voting");
	}
	
	
	return voterId;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodOverRidingChild mc=new MethodOverRidingChild();
System.out.println("Voter id is "+mc.CheckEligiblity());

	}

}
