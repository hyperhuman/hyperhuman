package sudokuSolve;

public class NumberObject {

	private int num;
	private int row;
	private int col;
	private boolean access;
	
	public NumberObject(int num, int row, int col, boolean access) {
		setNum(num);
		setRow(row);
		setCol(col);
		setAcc(access);
	}

	public void setNum(int numb){
		this.num = numb;
	}
	
	private void setRow(int row) {
		this.row = row;
	}
	
	private void setCol(int col) {
		this.col = col;
	}
	
	private void setAcc(boolean access) {
		this.access = access;
	}
	
	public int getNum() {
		return num;
	}
	
	public int getRow() {
		return row;
	}
	
	public int getCol() {
		return col;
	}
	
	public boolean getAccess() {
		return access;
	}
}

