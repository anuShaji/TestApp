package aggregation;

public class AggregationClass2 {
AggregationClass1 ag;//creating parent class reference variable
int empId;
String name;
	public AggregationClass2(AggregationClass1 ag, int empId, String name) {
	
	this.ag = ag;
	this.empId = empId;
	this.name = name;
}
	public void print() {
		ag.display();
		System.out.println("Name : "+name);
		System.out.println("Employee ID: " +empId);
		System.out.println("City : "+ag.city);
		System.out.println("State : "+ag.state);
		System.out.println("Country : "+ag.country);
		System.out.println("Zip code: "+ag.zipcode);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggregationClass1 ag1=new AggregationClass1("Kottayam", "Kerala", "India", 110002);
		AggregationClass2 ag2=new AggregationClass2(ag1, 201, "Samuel");
		ag2.print();
	}

}
