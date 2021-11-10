package sudokuSolve;

public class Solver {
	
	private static NumberObject[][] board = new NumberObject[9][9];
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if(i==0&&j==1) board[0][1] = new NumberObject(3, 0, 1, false);
				if(i==0&&j==8) board[0][8] = new NumberObject(7, 0, 8, false);
				if(i==1&&j==1) board[1][1] = new NumberObject(1, 1, 1, false);
				if(i==1&&j==8) board[1][8] = new NumberObject(5, 1, 8, false);
				if(i==2&&j==1) board[2][1] = new NumberObject(9, 2, 1, false);
				if(i==2&&j==2) board[2][2] = new NumberObject(7, 2, 2, false);
				if(i==2&&j==7) board[2][7] = new NumberObject(3, 2, 7, false);
				if(i==3&&j==2) board[3][2] = new NumberObject(9, 3, 2, false);
				if(i==3&&j==5) board[3][5] = new NumberObject(1, 3, 5, false);
				if(i==4&&j==2) board[4][2] = new NumberObject(3, 4, 2, false);
				if(i==4&&j==4) board[4][4] = new NumberObject(7, 4, 4, false);
				if(i==4&&j==7) board[4][7] = new NumberObject(5, 4, 7, false);
				if(i==4&&j==8) board[4][8] = new NumberObject(6, 4, 8, false);
				if(i==5&&j==2) board[5][2] = new NumberObject(6, 5, 2, false);
				if(i==5&&j==3) board[5][3] = new NumberObject(5, 5, 3, false);
				if(i==5&&j==4) board[5][4] = new NumberObject(3, 5, 4, false);
				if(i==5&&j==7) board[5][7] = new NumberObject(4, 5, 7, false);
				if(i==5&&j==8) board[5][8] = new NumberObject(1, 5, 8, false);
				if(i==6&&j==1) board[6][1] = new NumberObject(7, 6, 1, false);
				if(i==6&&j==4) board[6][4] = new NumberObject(6, 6, 4, false);
				if(i==6&&j==7) board[6][7] = new NumberObject(8, 6, 7, false);
				if(i==7&&j==3) board[7][3] = new NumberObject(4, 7, 3, false);
				if(i==7&&j==7) board[7][7] = new NumberObject(7, 7, 7, false);
				if(i==7&&j==8) board[7][8] = new NumberObject(3, 7, 8, false);
				if(i==8&&j==3) board[8][3] = new NumberObject(2, 8, 3, false);
				if(i==8&&j==6) board[8][6] = new NumberObject(6, 8, 6, false);
				//if(i==8&&j==5) board[8][5] = new NumberObject(6, 8, 5, false);
				if(board[i][j]==null)board[i][j] = new NumberObject(0, i, j, true);
				}
			}	
		
		printBoard();
		play();
		printBoard();
						
		
	}
	
	public static boolean squareCheck(NumberObject o) {
		if(o.getRow() < 3) {
			if(o.getCol() < 3) {
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 3; j++) {
						if(i == o.getRow() && j == o.getCol()) {
							continue;
						}
						if(o.getNum() == board[i][j].getNum()) {
							return false;
						}
					}	
				}
			}
			if(o.getCol() < 6 && o.getCol()> 2) {
				for(int i = 0; i < 3; i++) {
					for(int j = 3; j < 6; j++) {
						if(i == o.getRow() && j == o.getCol()) {
							continue;
						}
						if(o.getNum() == board[i][j].getNum()) {
							return false;
						}
					}	
				}
			}
			if(o.getCol() > 5) {
				for(int i = 0; i < 3; i++) {
					for(int j = 6; j < 9; j++) {
						if(i == o.getRow() && j == o.getCol()) {
							continue;
						}
						if(o.getNum() == board[i][j].getNum()) {
							return false;
						}
					}	
				}
			}
					}
		if(o.getRow() < 6 && o.getRow() > 2) {
			if(o.getCol() < 3) {
				for(int i = 3; i < 6; i++) {
					for(int j = 0; j < 3; j++) {
						if(i == o.getRow() && j == o.getCol()) {
							continue;
						}
						if(o.getNum() == board[i][j].getNum()) {
							return false;
						}
					}	
				}
			}
			if(o.getCol() < 6 && o.getCol() > 2) {
				for(int i = 3; i < 6; i++) {
					for(int j = 3; j < 6; j++) {
						if(i == o.getRow() && j == o.getCol()) {
							continue;
						}
						if(o.getNum() == board[i][j].getNum()) {
							return false;
						}
					}	
				}
			}
			if(o.getCol() > 5) {
				for(int i = 3; i < 6; i++) {
					for(int j = 6; j < 9; j++) {
						if(i == o.getRow() && j == o.getCol()) {
							continue;
						}
						if(o.getNum() == board[i][j].getNum()) {
							return false;
						}
					}	
				}
			}
		}
		if(o.getRow() > 5) {
			if(o.getCol() < 3) {
				for(int i = 6; i < 9; i++) {
					for(int j = 0; j < 3; j++) {
						if(i == o.getRow() && j == o.getCol()) {
							continue;
						}
						if(o.getNum() == board[i][j].getNum()) {
							return false;
						}
					}	
				}
			}
			if(o.getCol() < 6 && o.getCol() > 2) {
				for(int i = 6; i < 9; i++) {
					for(int j = 3; j < 6; j++) {
						if(i == o.getRow() && j == o.getCol()) {
							continue;
						}
						if(o.getNum() == board[i][j].getNum()) {
							return false;
						}
					}	
				}
			}
			if(o.getCol() > 5) {
				for(int i = 6; i < 9; i++) {
					for(int j = 6; j < 9; j++) {
						if(i == o.getRow() && j == o.getCol()) {
							continue;
						}
						if(o.getNum() == board[i][j].getNum()) {
							return false;
						}
					}	
				}
			}
		}
		return true;
	}
	
	public static boolean columnCheck(NumberObject o) {
		
		for(int i = 0; i < board.length; i++) {
			if(i ==  o.getRow()) {
				continue;
			}
			if(o.getNum() == board[i][o.getCol()].getNum()) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean rowCheck(NumberObject o) {
		
		for(int i = 0; i < board[0].length; i++) {
			if(i == o.getCol()) {
				continue;
			}
			if(o.getNum() == board[o.getRow()][i].getNum()) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void printBoard() {
		for(int i = 0; i < board.length; i++) {
			if(i == 3 || i == 6) {
				System.out.println();
			}
			for(int j = 0; j < board[0].length; j++) {
				
			System.out.print(board[i][j].getNum());
			if(j == 2 || j == 5) {
				System.out.print("   ");
			}
			if(j == 8) {
				System.out.println();
			}
		}
		}
	}

public static void play() {
	
	for(int row = 0; row < board.length; row++) {  // starting position in array
		
		for(int col = 0; col < board[0].length; col++) {
			
			if(board[row][col].getAccess()) { //if you can authorize access to this square
				
				for(int num = 1; num < 10; num++) {  //loop to test possible numbers
					if(num <= 0) {
						num = 1;
					}
						board[row][col].setNum(num); //setting the location to specific number
						if(columnCheck(board[row][col]) && rowCheck(board[row][col]) && squareCheck(board[row][col])){
							break;  // if a working number is found move to next spot
						} else {
							while(num == 9) { // this loop will continue to move the location back until a suitable spot is reached
								board[row][col].setNum(0);
								
								col = col - 1;
								if(col < 0) col = 0;
								if(row < 0) row = 0;
								if(col == 0 && row > 0 && (board[row][col].getNum() == 0 || board[row][col].getNum() == 9)) {
									board[row][col].setNum(0);
									row = row - 1;
									col = 8;
								}
								
								
								//System.out.println(row + " " + col);
								while(board[row][col].getAccess() == false) { // authorization check for new space
									col = col - 1;
									if(col <= 0 && row > 0 && board[row][col].getAccess() == false) {
										row = row - 1;
										col = 8;
									}
								}
								
								num = board[row][col].getNum();

								}
							}
						continue;
						}
					}
				}	
			}
		}
}

	
