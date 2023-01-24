class VariableExample{
     static int num = 55; //static
     long num1 = 1234566; //instance
     public void display(){
          char a = 'M'; //local
          System.out.println("local variable value: "+a); //printing local variable
}
     public static void calc(){
          double b = 123.45;
          double c = 523.45;
          double res = b*c;
          System.out.println("Result is: " +res);
}
     public static void main(String args[]){
        VariableExample obj = new VariableExample(); //object creation
        obj.display();  //invoke nonstatic method with object
        calc();
        System.out.println("Instance variable value: "+obj.num1); //printing instance variable
        System.out.println("Static variable value: "+ VariableExample.num); //printing static variable
}
}

//static variable doesnt need a object
//non-static(instance var) needs a object