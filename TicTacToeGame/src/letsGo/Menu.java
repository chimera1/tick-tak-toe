package letsGo;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		System.out.println("Enter one of the following commands:");
		System.out.println("1 - Start the Game");
		System.out.println("2 - Change your mark  ");
		System.out.println("3 - exit");
		Scanner scanchoice = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter \"1\", \"2\" or \"3\"");
		int choiceentry = scanchoice.nextInt();
	

	while (choiceentry != 3) {

	    if (choiceentry < 1 || choiceentry > 3) {

	        System.out.println("Enter \"1\", \"2\", \"3\" or \"4\"");
	        choiceentry = scanchoice.nextInt();

	    }

	    else if(choiceentry == 1) {
	    
	    }
	    else if(choiceentry == 2) {
	    
	    }
	    else if(choiceentry == 3) {
	    
	    }

	}   
	}
}
