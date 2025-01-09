package Numberprograms;

public class Swaptwonumbers {
	
	
	
	public static void main(String[] args ) {
		
		int num1=5;
		int num2=6;
		
		System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        // Swapping using a temporary variable
        int temp = num1; // Store num1 in temp
        num1 = num2;     // Assign num2 to num1
        num2 = temp;     // Assign temp (original num1) to num2

        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
		
	}

}
