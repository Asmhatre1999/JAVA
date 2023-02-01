//Print star pyramid using scanner

import java.util.Scanner;

public class StarPattern {
    public void pattern(int input) {
        for (int i = 1; i <= input; ++i) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println("  ");
        }
    }

    public static void main(String args[]) {
        StarPattern obj = new StarPattern();
	
        Scanner sc = new Scanner(System.in);
	
        System.out.println("Enter Number To See Pattern");
        int input = sc.nextInt();
        obj.pattern(input);

    }
}