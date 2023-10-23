package Task_2;

public class TicTacToe {
    private static final char EMPTY = ' ';
    private char[][] board;

    public TicTacToe(char[][] board) {
        this.board = board;
    }
public boolean checkRow() {
	for(char[] emplement : board) {
		int countX = 0;
		int countO =0;
		for (int i = 0; i < emplement.length; i++) {
			switch (emplement[i]) {
			case 'X': {
				countX++;
				break;
			}
			case 'O':{
				countO++;
				break;
				}
			}
		}
		return countX==board.length || countO==board.length;
	}
	
	return false;
}
public boolean checkCol() {
	for (int i = 0; i < board.length; i++) {
		int countX = 0;
		int countO = 0;
		for (int j = 0; j < board[i].length; j++) {
			switch (board[j][i]) {
			case 'X': {
				countX++;
				break;
			}
			case  'O':{
				countO++;
				break;
				}
			}
		}
		return countX==board.length || countO==board.length;
	}
	return false;
}
public boolean checkDiagonals() {
	
	return checkMailDig() || checkSubDig();
}
public boolean checkMailDig() {
	int countX = 0;
	int countO = 0;
	for (int i = 0; i < board.length; i++) {
		switch (board[i][i]) {
		case 'X': {
			countX++;
			break;			
		}
		case 'O':{
			countO++;
			break;
				}
			}
		}
	return countX==board.length || countO==board.length;	
}
public boolean checkSubDig() {
	int countX =0;
	int countO =0;
	for (int i = 0; i < board.length; i++) {
		switch (board[i][board.length -1 -i]) {
		case 'X': {
			countX++;
			break;
		}
		case 'O':{
			countO++;
			break;
		}
	}
}
	return countX==board.length || countO==board.length;
}
public static void main(String[] args) {
	  char[][] board = {{'O', 'O', 'O'}, {'X', ' ', 'X'}, {' ', ' ', 'X'}, {'X', 'X', 'X'}};
	TicTacToe ttt = new TicTacToe(board);	
	System.out.println(ttt.checkRow());
	System.out.println(ttt.checkCol());
	System.out.println(ttt.checkDiagonals());
}
}