import java.util.Scanner;
import java.util.Stack;
/**
 * This class accepts an input from the user to check
 * to see if it's a palindrome or not
 * @author Jake Holovka
 *
 */
public class PalApp {

	public static void main(String[] args) {
		
		String userPal = "";
		String OpIn = "";
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Type in your Palindrome ");
		userPal= p.next();
		
		Stack pStack = new Stack();
		
		//adds the input to a stack
		for (int i=0; i<userPal.length(); i++)
		{
			pStack.push(userPal.charAt(i));
			
		}//end for loop
		
		System.out.println(pStack);
		
		//removes the input from the stack 
		for (int i=0; i<userPal.length(); i++)
		{
			OpIn += pStack.pop();
			
		}//end for loop
		
		//checks to see if input is a palindrome
		if (userPal.equals(OpIn)) {
			
			System.out.println("This is a Palindrome!");
			
		}else 
			
			System.out.println("This is not a Palindrome!");
		
	
		//prints out the the user input, the decremented stack, and the flipped input
		System.out.println(pStack);
		System.out.println(userPal);
		System.out.println(OpIn);
		
	}//end main

}//end class
