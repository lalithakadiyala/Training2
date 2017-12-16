package methods;

public class methods {

	public static void main(String[] args) {

		jobapp jobobj = new jobapp("tina", 980, 780000.78, "Sunyvale");
		jobobj.display();

		jobapp jobobj1 = new jobapp();
		jobobj1.display();

	}
}

class jobapp {
	String name;
	int jobcode;
	Double salary;
	String city;

	jobapp(String nm, int jc, Double sal, String city) {
		name = "nm";
		jobcode = jc;
		salary = sal;
		city = "city";

	}

	jobapp() {
		name = "Hummy";
		jobcode = 879;
		salary = 89000.00;
		city = "New jersy";
	}

	static String country = "california";

	Double getbonus() {
		Double bonus = salary * .05;
		return bonus;
	}

	void display() {

		System.out.println("name : " + name);
		System.out.println("jobcode : " + jobcode);
		System.out.println("salary : " + salary);
		System.out.println("city : " + city);
		System.out.println(country);
		System.out.println("get bounus " + getbonus());
	}

}