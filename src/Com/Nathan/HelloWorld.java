package Com.Nathan;

import java.util.Scanner;

/**
 * @author Nathan
 * @date 06/06/2024
 * a java implementation of Hello World
 */

public class HelloWorld {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Get info from the user
		System.out.println("Please enter your name");
		String name = input.nextLine();
		System.out.println("Please enter a greeting");
		String greeting = input.nextLine();
		
	}
/**
 * creates a greeting using a custom greeting and name
 * @param greeting - what greeting to use
 * @param 
 */
	
	public static String generateGreeting(String greeting, String name) {
		return greeting + ", " + name;	
		}
}
