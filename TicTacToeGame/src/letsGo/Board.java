package letsGo;

public class Board {
	private char[][] board;
	private char Mark;

	public Board() {
		board = new char[3][3];
		Mark = 'x';
		initializeBoard();
	}

	public boolean isBoardFull() {
		boolean isFull = true;
		for (int i = 0; i < getBoard().length; i++) {
			for (int j = 0; j < getBoard().length; j++) {
				if (getBoard()[i][j] == ' ') {
					isFull = false;
				}
			}
		}
		return isFull;
	}

	public void initializeBoard() {
		for (int i = 0; i < getBoard().length; i++) {
			for (int j = 0; j < getBoard().length; j++) {
				getBoard()[i][j] = ' ';
			}
		}
	}

	public void printBoard() {
		System.out.println("-------");
		for (int i = 0; i < getBoard().length; i++) {
			System.out.print("|");
			for (int j = 0; j < getBoard().length; j++) {
				System.out.print(getBoard()[i][j] + "|");
			}
			System.out.println();
			System.out.println("-------");
		}

	}

	public char[][] getBoard() {
		return board;
	}

	public boolean checkForWin() {
		return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());

	}

	private boolean checkRowsForWin() {
		for (int i = 0; i < board.length; i++) {
			if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {
				return true;

			}
		}
		return false;
	}

	private boolean checkColumnsForWin() {
		for (int i = 0; i < board.length; i++) {
			if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {
				return true;
			}
		}
		return false;
	}

	private boolean checkDiagonalsForWin() {
		return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true)
				|| (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));

	}

	private boolean checkRowCol(char c1, char c2, char c3) {
		return ((c1 != ' ') && (c1 == c2) && (c2 == c3));
	}

	public void changePlayer() {
		if (Mark == 'x') {
			Mark = 'o';
		} else {
			Mark = 'x';
		}
	}

	private boolean placeMark(int row, int col) {
		if ((row >= 0) && (row < 3)) {
			if ((col >= 0) && (col < 3)) {
				if (board[row][col] == ' ') {
					board[row][col] = Mark;
					return true;
				}
			}

		}
		return false;
	}
	public char[][] placeMark() {
		return board;
	}

	public boolean play(int x, int y) {
		boolean successful = placeMark(x, y);
		
		if (!successful) {
			System.out.println("Try again");
			return false;
		}
		changePlayer();
         
		return true;
	}



}
