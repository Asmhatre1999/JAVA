//Inheritance of Owner and new owner
//super keyword is used to tell function that derive this method from the parent or super class not the sub class else it will override.


class Owner{    // Super Class
	
	final int area = 1000;  // here 1000 can't be change bcoz of final
	String dateOfPurchase="28-09-1999";
	String name = "Archita";
	boolean noc = true;
	public void renew(){   //method states that owner what had in his house before selling

		String color = "Blue";
		String flat = "2BHK";
		int ceilingHeight = 8;

		System.out.println("Old Flat Features:   "+color +"  "+ flat+" "+ ceilingHeight);
	}
}

class New_Owner extends Owner{   // Sub class

	String dateOfRegister= "03-02-2023";
	double flatValue= 2.300000;
	String name="Aarohi";
	public void display(){

		System.out.println("Area is: "+area);  // access parent property
		System.out.println("Owner name is: :"+super.name);  // access parent property, super is used so that new owner name doesn't overrride owner's name
                                                                    // if you dont use super here new owner name will only appear as owner
		System.out.println("Current Flat Value is: "+flatValue);
		System.out.println("New Owner name is: :"+name);   // here the new name will override the owner name that means owner and new owner dono Aarohi hi                                                                        //dikhayega, to prevent it super keyword is used 
	}

	public void renew(){  //method override


		String color = "White";
		String flat = "3BHK";
		int ceilingHeight = 10;

		System.out.println("New flat features:   "+ (color +"  "+ flat+" "+ ceilingHeight));
		super.renew();  // cxall parent method
	}
}


class InheritanceExample{

	public static void main(String args[]){
		
		New_Owner c = new New_Owner();   //class object
		c.display(); //invoke child to access child and parent property
		c.renew(); // invoke child method
	}

}



















