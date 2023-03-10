package Lab6;


public class Problem1 {

	
	private static String myString;   // Declaring a static variable myString of type String

	
	public static void main(String[] args) {

		// Call createString method with argument "Welcome to Java World"
		createString("Welcome to Java World");

		// Call return5th method with argument myString
		return5th(myString);

		// Call compareString method with argument myString
		compareString(myString);

		// Call concatenateString method with argument "- Let us learn"
		concatenateString("- Let us learn");

		// Call firstOccOfa method with argument myString
		firstOccOfa(myString);

		// Call replaceWithE method with argument myString
		replaceWithE(myString);

		// Call returnBW4thAnd10th method with argument myString
		returnBW4thAnd10th(myString);

		// Call returnLower method with argument myString
		returnLower(myString);
	}

	
	private static void createString(String string) {   // Method to create a string and assign it to myString variable
		myString = new String(string);
		System.out.println("Value of variable myString: " + myString);
	}

	
	private static void return5th(String myString2) {    // Method to print the character at the 5th position of a given string
		System.out.println("Character at 5th position: " + myString2.charAt(5));
	}

	
	private static void compareString(String myString2) {    // Method to compare a given string with the word "Welcome"
		
		int order = myString2.compareToIgnoreCase("Welcome");

		
		if (order < 0) {         // Check the result of the comparison and print the appropriate message
			System.out.println("Welcome comes after " + myString2);
		} else if (order > 0) {
			System.out.println(myString2 + " comes after welcome");
		} else {
			System.out.println(myString2 + " and welcome are the same words");
		}
	}

	
	private static void concatenateString(String string) {  // Method to concatenate a given string to myString variable
		System.out.println(myString + " " + string);
	}

	
	private static void firstOccOfa(String myString2) {
		System.out.println("Position of the first occurrence of character 'a': " + myString2.indexOf("a"));
	}

	
	private static void replaceWithE(String myString2) {
		System.out.println("After replacing all 'a' characters with 'e' characters: " + myString2.replace('a', 'e'));
	}

	
	private static void returnBW4thAnd10th(String myString2) {
		System.out.println("String between 4th position and 10th position: " + myString2.substring(3, 10));
	}

	   
	private static void returnLower(String myString2) {    // Method to print the lowercase version of a given string
		System.out.println("String in lower case: " + myString2.toLowerCase());
	}
}
