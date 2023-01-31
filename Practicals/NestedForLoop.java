// Printing star pyramid using Nested For Loop(Simple Method)


class NestedForLoop{
          public static void main(String args[]){
		int rows= 5;

		for(int i=1;i<=rows;i++){           // outer loop
			for(int j=1;j<=i;j++){      //inner loop
        			System.out.print("* ");  
			}  
			System.out.println();//new line  
		}  
	}
}
        