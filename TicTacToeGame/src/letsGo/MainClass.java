package letsGo;

import java.util.Scanner;

public class MainClass extends Board {

	public static void printMenu() {
		System.out.println("Enter one of the following commands:");
		System.out.println("1 - Start the Game");
		
		System.out.println("2 - exit");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//////////////////////////////////////////////////////////////////////////////////////////

		while (true) {
			printMenu();
			int choiceentry = 0;
			do {
				System.out.println();
				System.out.println("Enter \"1\" or \"3\"");
				choiceentry = scanner.nextInt();
			} while (choiceentry > 2 || choiceentry <1);

			if (choiceentry == 1) {
				startGame(scanner);
			}

		
			if (choiceentry == 2) {
				System.out.println("Bye");
				break;
			}

		}
	}

	private static void startGame(Scanner scanner) {
		Board board = new Board();
		board.initializeBoard();

		while (true) {
			board.printBoard();
			System.out.println("Enter row");
			int x = scanner.nextInt();
			System.out.println("Enter column");
			int y = scanner.nextInt();

			if (!board.play(x, y)) {
				continue;
			}

			if (board.checkForWin()) {
				System.out.println("We have a winner!");
				break;
			} else if (board.isBoardFull()) {
				System.out.println("Appears we have a draw!");
				break;
			}
		}
	}


}
