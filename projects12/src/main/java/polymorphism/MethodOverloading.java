package polymorphism;

public class MethodOverloading {
	String str1,str2,name;
	int a;
public void add() {
	int a=10,b=20;
	int sum=a+b;
	System.out.println(sum);
}
public void add(String str1,String str2) {
	
	this.str1=str1;
	this.str2=str2;
	String str3=str1+str2;
	System.out.println(str3);
}
public void add(int a,String name) {
	this.a=a;
	this.name=name;
	System.out.println("Hi "+name+" Your age is "+a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodOverloading mo= new MethodOverloading();
mo.add();
mo.add(20, "Ram");
mo.add("Hello", "World");
	}

}
