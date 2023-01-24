class TypecastingExample{
      
      public static void main(String args[]){
           int x = 890;
           long z = x; //automatically convert int into long
           System.out.println(x);
           System.out.println(z);
           double y=x;//automatically convert int into double
           System.out.println(y);

           double a = 456.23;
           int b = (int)a;
           System.out.println(a);
           System.out.println(b);

}
}