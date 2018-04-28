

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
			for (int i = 0; i < 100; i++) {
				
			
				String n1 = JOptionPane.showInputDialog("Insert a random number.");
				String n2 = JOptionPane.showInputDialog("Insert another random number.");
				int a = Integer.parseInt(n1);
				int b = Integer.parseInt(n2);
				
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Would you like to add, subtract, multiply, or divide?", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		add(a,b);
		subtract(a,b);
		multiply(a,b);
		divide(a,b);
		
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}
}
	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	static void add(int a, int b) {
		System.out.println(a + b);
	}
	// 4. Create similar methods for subtraction, multiplication and division.
	static void subtract(int a, int b) {
		System.out.println(a - b);
	}
	static void multiply(int a, int b) {
		System.out.println(a * b);
	}
	static void divide(int a, int b) {
		System.out.println(a / b);
	}
	
}