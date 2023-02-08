// ENUM in JAVA



public class Enum2{

	enum Day {       // Declaring enum inside the class

	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THRUSDAY,
	FRIDAY,
	SATURDAY;

		

}

	public static void main(String[] args){

		Day d1=Day.THRUSDAY;
		System.out.println(d1);
		System.out.println("Index Of Tuesday is: "+Day.valueOf("Tuesday"));
		System.out.println("Index Of Tuesday is: "+Day.valueOf("Tuesday").ordinal());	
		for(Day d:Day.values())
		{
			System.out.println(d);

		}
			
		


}


}