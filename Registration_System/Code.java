package Registration_System;

import java.util.Scanner;

public class Code {

	
static Scanner scanner = new Scanner (System.in);
	
	public static void registration() {
		
		System.out.println("Type your name: ");
		String name = scanner.next();
		
		System.out.println("Type your e-mail: ");
		String email = scanner.next();
		
		System.out.println("\nHello "+name+"! Please, check the e-mail '"+email+"' for the registration confirmation message");
	}
	
	public static void regAgain() {
		
		System.out.println("Do you want to make a new registration?\nType 'y' for yes\nType 'n' for no");
		String resposta = scanner.next();
		
		switch(resposta) {
		case "y": registration();
		regAgain();
		break;
		
		case "n": System.out.println("Shuting down the system.");
		scanner.close();
		break;
		
		default: System.out.println("Unrecognized Option.");
		regAgain();
		break;
		}
		
	}
	
public static void main(String[] args) {
	 
	System.out.println("Wellcome to the our new registration system.");
	registration();
	regAgain();
	
 }
}
