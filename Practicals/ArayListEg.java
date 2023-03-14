//Write a java program to iterate through all elements in array list


import java.util.ArrayList;

public class ArayListEg {
	public static void main(String[] args) {
		//To create array list
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("James");
		l1.add("Stella");
		l1.add("Adrien");
		l1.add("Bella");
		System.out.println("Names of students: "+l1);
		l1.add(0,"Liam");
		System.out.println(l1);//To insert an element at first position of the array list
		System.out.println(l1.get(2));//to retrieve an element from the array list
		System.out.println(l1.remove(3));//to remove the third element from a array list
		if(l1.contains("Adrien"))//To search an element in a array list
			System.out.println("Adrien is present in the list");
		else
			System.out.println("Not present");
		
		// To create another list 
		ArrayList<String>l2 = new ArrayList<>();
		l2.add("Adrien");
		l2.add("Elena");
		l2.add("Sweety");
		
		//to copy from one array list to another
		l1.addAll(l2);
		System.out.println(l1);
		
		//Compares two array list
		boolean b = l1.equals(l2);//returns true if both are equal else false
		System.out.println(b+"As both array lists are not equal");
	}

}