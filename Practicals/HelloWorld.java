class My{
    public static void display(){ //static method
       System.out.println("Hi....");
}
}
class HelloWorld{  //start of class with main()
    public static void main(String args[]){   //entry point
        System.out.println("Hello");
        My.display(); //classname.methodname
}
}