package javacoding.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;


public class ListPractices {

	public static void main(String[] args) {
		int num []= {10, 20, 30, 50};
		int value = num.length;
		System.out.println(value);
		
	
		// One way
		ArrayList listOne = new ArrayList(); // Old
		
		// 2nd way
		ArrayList<Integer> listTwo = new ArrayList<Integer>(); // New. Non generic error // Object
		listTwo.add(100);
		listTwo.add(200);
		
		//3rd Way 
		List<Integer> listThree = new ArrayList<Integer>(); // Prefarance of Arraylist
		listThree.add(100);
		listThree.add(200);
		
		//4th way
		List <Integer> listFour = new ArrayList<Integer>(Arrays.asList(100, 200, 300, 400, 500));
		int s= listFour.size();
		System.out.println(s);
		
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Aka Debnath");
		
		Vector<String> vector = new Vector<String>();
		vector.add("Aka Debnath");
		
		Stack<String> stack = new Stack<String>();
		stack.add("Aka Debnath");
		
		
	}

}
