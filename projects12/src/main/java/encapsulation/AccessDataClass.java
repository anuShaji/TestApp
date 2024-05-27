package encapsulation;

public class AccessDataClass {
public void display() {
	System.out.println("EMPLOYEE DETAILS");
	System.out.println("________________");
	System.out.println("\nCompany Name: Infosys Limited");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessDataClass ad=new AccessDataClass();
		ad.display();
DataClass dc=new DataClass();
dc.setAddress("Muweaeilahh Sharjah");
dc.setAge(27);
dc.setEmpId(1009);
dc.setName("Anupama");
dc.setPincode(0000);
System.out.println("Name :"+dc.getName());
System.out.println("Age : "+dc.getAge());
System.out.println("Employee ID : "+dc.getEmpId());
System.out.println("Address : "+dc.getAddress());
System.out.println("Pin Code : "+dc.getPincode());
	}

}
