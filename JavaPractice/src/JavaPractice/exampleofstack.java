package JavaPractice;

import java.util.Stack;

public class exampleofstack {
	
	
	public static void main(String[] args) {
		
		
       Stack<String> animals = new Stack<>();
       
       animals.push( "Lion");
       
       animals.push( "Cat");
       
       animals.push( "Dog");
       
       animals.push( "elephant");
       
       System.out.println(" Stack: " + animals);
       
       
       System.out.println(animals.peek());// retrieve the top element
       
       animals.pop();
       
       System.out.println(" Stack: " + animals);
       
       
	}

}
