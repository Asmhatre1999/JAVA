public class Nested{
	public void Age(){ //non static method
		int x = 10;
		
		if (x < 18){
			System.out.println("You are not eligible to work");
		}
		else{
			if (x>=18 && x<=60){
				System.out.println("You are eligible to work");
			}
			else {
				System.out.println("U can't work as per government rule");
			}
		}
	}
		public static void main(String args[]){
			Nested nc = new Nested();
			nc.Age();
		}
	
}