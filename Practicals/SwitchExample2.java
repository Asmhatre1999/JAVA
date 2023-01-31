import java.util.Scanner; //import scanner class of util package

class SwitchExample2{
		
		public void calc_month(String month){
			switch(month) { //switch(expression)
			case "january" : 
			System.out.println(" Happy Republic day");
			break;
			
			case "february" : 
			System.out.println("Have a wonderul month ahead. ");
			break;
			
			case "March" : 
			System.out.println("Honesty is the best policy ");
			break;
			
			case "April" : 
			System.out.println("Be good,do good ");
			break;
			
			case "May" : 
			System.out.println("Laughter is the best medicine");
			break;
			
			case "June":
			System.out.println("Rainy season");

                        case "July":
			System.out.println("Heavy rain");
                    
                        case "August":
			System.out.println("Hello");

                        case "September":
			System.out.println("Yay the year is near to its end");

                        case "October":
			System.out.println("Winter is starting");

                        case "November":
			System.out.println("Cold winters");

                        case "December":
			System.out.println("Happy new year");
			
		}
		}
		public static void main (String args[]){
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter month ");
			String month = sc.next();
			month = month.toLowerCase();
			
			SwitchExample2 se = new SwitchExample2();
			se.calc_month(month);
		}
}