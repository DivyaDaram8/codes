import java.util.*;

public class SudokuSolverRowColOnly {

    // ---- EDIT THESE PRESET PUZZLES (change values, 0 = empty) ----
    static int[][] p3 = {
        {1, 0, 0},
        {0, 2, 0},
        {0, 0, 3}
    };

    static int[][] p4 = {
        {0, 0, 2, 4},
        {4, 0, 0, 2},
        {0, 2, 4, 0},
        {2, 0, 3, 0}
    };

    static int[][] p5 = {
        {0, 0, 4, 0, 0},
        {5, 0, 0, 0, 0},
        {0, 3, 5, 0, 0},
        {0, 0, 0, 0, 4},
        {0, 0, 0, 3, 0}
    };
    // -------------------------------------------------------------

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size (3, 4 or 5): ");
        int n = sc.nextInt();

        int[][] board;
        if (n == 3) board = copyBoard(p3);
        else if (n == 4) board = copyBoard(p4);
        else if (n == 5) board = copyBoard(p5);
        else {
            System.out.println("Unsupported size. Use 3, 4, or 5.");
            sc.close();
            return;
        }

        System.out.println("\nInput board:");
        printBoard(board);

        if (!validateInitialRowCol(board)) {
            System.out.println("\nInvalid puzzle: duplicates or out-of-range numbers found (row/column rules).");
            sc.close();
            return;
        }

        int sols = countSolutions(board, 2); // check uniqueness (stop after 2)
        if (sols == 0) {
            System.out.println("\nThis puzzle has NO solution.");
            sc.close();
            return;
        } else if (sols >= 2) {
            System.out.println("\nThis puzzle has MULTIPLE solutions (not unique). We'll still show one solution.");
        } else {
            System.out.println("\nThis puzzle has a UNIQUE solution. Solving...");
        }

        int[][] toSolve = copyBoard(board);
        boolean ok = solve(toSolve);
        if (ok) {
            System.out.println("\nOne solved board:");
            printBoard(toSolve);
        } else {
            System.out.println("\nSolver failed to find a solution (unexpected).");
        }

        sc.close();
    }

    // ----------------- SOLVER (backtracking) -----------------
    // ONLY rules enforced:
    // - no repeats in any row
    // - no repeats in any column
    public static boolean solve(int[][] b) {
        int n = b.length;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (b[r][c] == 0) {
                    for (int num = 1; num <= n; num++) {
                        if (isValidRowCol(b, r, c, num)) {
                            b[r][c] = num;
                            if (solve(b)) return true;
                            b[r][c] = 0;
                        }
                    }
                    return false; // no candidate works -> backtrack
                }
            }
        }
        return true; // filled successfully
    }

    // Check if placing num at (r,c) is valid under row+col rules only
    public static boolean isValidRowCol(int[][] b, int r, int c, int num) {
        int n = b.length;
        if (num < 1 || num > n) return false;
        // row
        for (int j = 0; j < n; j++) if (b[r][j] == num) return false;
        // column
        for (int i = 0; i < n; i++) if (b[i][c] == num) return false;
        return true;
    }

    // ----------------- UNIQUENESS CHECK -----------------
    public static int countSolutions(int[][] board, int limit) {
        int[][] copy = copyBoard(board);
        return countRec(copy, limit, 0);
    }

    private static int countRec(int[][] b, int limit, int foundSoFar) {
        int n = b.length;
        int r = -1, c = -1;
        outer:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (b[i][j] == 0) { r = i; c = j; break outer; }
            }
        }
        if (r == -1) {
            return foundSoFar + 1;
        }
        for (int num = 1; num <= n; num++) {
            if (isValidRowCol(b, r, c, num)) {
                b[r][c] = num;
                foundSoFar = countRec(b, limit, foundSoFar);
                b[r][c] = 0;
                if (foundSoFar >= limit) return foundSoFar;
            }
        }
        return foundSoFar;
    }

    // ----------------- VALIDATION & UTIL -----------------
    // Validate initial board: square, values in range, no duplicate in row/col
    public static boolean validateInitialRowCol(int[][] b) {
        int n = b.length;
        for (int[] row : b) if (row.length != n) return false;
        for (int i = 0; i < n; i++) {
            boolean[] rowSeen = new boolean[n + 1];
            boolean[] colSeen = new boolean[n + 1];
            for (int j = 0; j < n; j++) {
                int vr = b[i][j];
                if (vr != 0) {
                    if (vr < 1 || vr > n) return false;
                    if (rowSeen[vr]) return false;
                    rowSeen[vr] = true;
                }
                int vc = b[j][i];
                if (vc != 0) {
                    if (vc < 1 || vc > n) return false;
                    if (colSeen[vc]) return false;
                    colSeen[vc] = true;
                }
            }
        }
        return true;
    }

    public static void printBoard(int[][] b) {
        for (int[] row : b) {
            for (int x : row) System.out.print((x == 0 ? "." : x) + " ");
            System.out.println();
        }
    }

    public static int[][] copyBoard(int[][] src) {
        int n = src.length;
        int[][] out = new int[n][n];
        for (int i = 0; i < n; i++) System.arraycopy(src[i], 0, out[i], 0, n);
        return out;
    }
}
