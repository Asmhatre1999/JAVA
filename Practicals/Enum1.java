// ENUM in JAVA

enum Day {       // Declaring enum outside the class

	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THRUSDAY,
	FRIDAY,
	SATURDAY;
	

}


public class Enum1{

	/*enum Day {       // Declaring enum inside the class

	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THRUSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY;

}*/

	public static void main(String[] args){

		Day d1=Day.THRUSDAY;
		System.out.println(d1);


}


}