import java.util.Scanner; //import scanner class of util package

class SwitchExample{
		
		public void calc_grade(String grade){
			switch(grade) { //switch(expression)
			case "A" : 
			System.out.println("Congrats... You marks is in range of 100 - 80 ");
			break;
			
			case "B" : 
			System.out.println("Great... You marks is in range of 80 - 65 ");
			break;
			
			case "C" : 
			System.out.println("You marks is in range of 65 - 50 ");
			break;
			
			case "D" : 
			System.out.println("You marks is in range of 50 - 36 ");
			break;
			
			case "F" : 
			System.out.println("Failed... You marks is below 35");
			break;
			
			default:
			System.out.println("Error... Invalid grade");
			
		}
		}
		public static void main (String args[]){
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter grade ");
			String grade = sc.next();
			grade = grade.toUpperCase();
			
			SwitchExample se = new SwitchExample();
			se.calc_grade(grade);
		}
}