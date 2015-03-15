package Backtracking;

public class SUDOKU {
	public static int[][] grid;

	public boolean solveSUDOKU() {
		int row;
		int col;
		int[] blankCell = findBlankLocation();
		row = blankCell[0];
		col = blankCell[1];
		if (row == -1) {
			// means will have filled the grid, return;
			return true;
		}
		// we need to fill grid[row][col] cell
		for (int i = 1; i <= 9; i++) {
			// check if number i is safe for grid[row][col] cell
			if (isSafe(row, col, i)) {
				// means its safe to fill the number
				grid[row][col] = i;
				// fill the rest of the grid
				if (solveSUDOKU()) {
					return true;
				}
				// if we are here that means current selection of number didnt
				// work, revert back the changes
				grid[row][col] = 0;
			}
		}
		return false; // This will cause the backtracking
	}

	public boolean isSafe(int row, int col, int n) {
		// we need to check row contains number n OR
		// Column contains number n OR
		// Block in which cell appears contains number n
		// If Any of the above statement is true, return false
		if (!UsedInRow(row, n) && !UsedInColumn(col, n)
				&& !UsedInBox(row - row % 3, col - col % 3, n)) {
			return true;
		}
		return false;
	}
	// check if n not in particular row
	public boolean UsedInRow(int row, int n) {
		for (int i = 0; i < 9; i++) {
			if (grid[row][i] == n) {
				return true;
			}
		}
		return false;
	}
	// check if n not in particular column
	public boolean UsedInColumn(int col, int n) { 
		for (int i = 0; i < 9; i++) {
			if (grid[i][col] == n) {
				return true;
			}
		}
		return false;
	}
	// check if n not in particular box
	public boolean UsedInBox(int boxStartRow, int boxStartCol, int n) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (grid[i + boxStartRow][j + boxStartCol] == n) {
					return true;
				}
			}
		}
		return false;
	}

	public int[] findBlankLocation() {
		int[] cell = new int[2]; // cell[0]-row cell[1] -column
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (grid[i][j] == 0) {
					cell[0] = i;
					cell[1] = j;
					return cell;
				}
			}
		}
		cell[0] = -1;
		cell[1] = -1;
		return cell; // means grid is full
	}

	public void print() {
		for (int row = 0; row < 9; row++) {
			if(row % 3==0){
				System.out.println();  // for more readability
			}
			for (int col = 0; col < 9; col++) {
				if (col % 3 == 0) {
					System.out.print(" "); // for more readability
				}
				System.out.print(grid[row][col] + " ");
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		grid = new int[][] { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
				{ 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
				{ 0, 5, 0, 0, 9, 0, 6, 0, 0 }, { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		SUDOKU s = new SUDOKU();
		if (s.solveSUDOKU()) {
			s.print();
		} else {
			System.out.println("NO SOLUTION");
		}
	}

}
