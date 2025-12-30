import java.util.*;

public class Sudoku {

    // Public solve method. Modifies board in-place and returns true if solved.
    public static boolean solve(int[][] board, int[][] regions) {
        int n = board.length;
        if (!validateSquare(board)) throw new IllegalArgumentException("Board must be square");
        if (regions != null && (regions.length != n || Arrays.stream(regions).anyMatch(r -> r.length != n)))
            throw new IllegalArgumentException("Regions must match board size");

        // If no regions provided and n is perfect square, make box regions
        if (regions == null) {
            int s = (int) Math.sqrt(n);
            if (s * s == n) {
                regions = new int[n][n];
                for (int r = 0; r < n; r++)
                    for (int c = 0; c < n; c++)
                        regions[r][c] = (r / s) * s + (c / s);
            }
        }

        // Validate initial board (no duplicates)
        if (!validateInitial(board, regions)) {
            System.out.println("Invalid starting board: duplicates found.");
            return false;
        }

        return backtrack(board, regions);
    }

    // Backtracking using MRV: choose empty with fewest candidates
    private static boolean backtrack(int[][] board, int[][] regions) {
        int n = board.length;
        // Find empty cell with min candidates
        int bestR = -1, bestC = -1;
        List<Integer> bestCandidates = null;
        int minCount = Integer.MAX_VALUE;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (board[r][c] == 0) {
                    List<Integer> cand = candidates(board, regions, r, c);
                    if (cand.isEmpty()) return false; // dead end
                    if (cand.size() < minCount) {
                        minCount = cand.size();
                        bestCandidates = cand;
                        bestR = r;
                        bestC = c;
                        if (minCount == 1) break; // can't get better than 1
                    }
                }
            }
            if (minCount == 1) break;
        }

        // if no empties, solved
        if (bestR == -1) return true;

        for (int val : bestCandidates) {
            board[bestR][bestC] = val;
            if (backtrack(board, regions)) return true;
            board[bestR][bestC] = 0; // undo
        }
        return false;
    }

    // Return candidate numbers for (r,c)
    private static List<Integer> candidates(int[][] board, int[][] regions, int r, int c) {
        int n = board.length;
        boolean[] used = new boolean[n + 1]; // index 1..n
        // row
        for (int j = 0; j < n; j++) {
            int v = board[r][j];
            if (v != 0) used[v] = true;
        }
        // col
        for (int i = 0; i < n; i++) {
            int v = board[i][c];
            if (v != 0) used[v] = true;
        }
        // region if present
        if (regions != null) {
            int rid = regions[r][c];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    if (regions[i][j] == rid) {
                        int v = board[i][j];
                        if (v != 0) used[v] = true;
                    }
        }
        List<Integer> res = new ArrayList<>();
        for (int v = 1; v <= n; v++) if (!used[v]) res.add(v);
        return res;
    }

    // Validate board is square shape
    private static boolean validateSquare(int[][] board) {
        int n = board.length;
        if (n == 0) return false;
        for (int[] row : board) if (row.length != n) return false;
        return true;
    }

    // Validate initial board does not have duplicates in row/col/region
    private static boolean validateInitial(int[][] board, int[][] regions) {
        int n = board.length;
        int maxVal = n;
        // rows & cols
        for (int i = 0; i < n; i++) {
            boolean[] rowSeen = new boolean[n + 1];
            boolean[] colSeen = new boolean[n + 1];
            for (int j = 0; j < n; j++) {
                int vr = board[i][j];
                if (vr != 0) {
                    if (vr < 1 || vr > maxVal) return false;
                    if (rowSeen[vr]) return false;
                    rowSeen[vr] = true;
                }
                int vc = board[j][i];
                if (vc != 0) {
                    if (vc < 1 || vc > maxVal) return false;
                    if (colSeen[vc]) return false;
                    colSeen[vc] = true;
                }
            }
        }
        // regions
        if (regions != null) {
            // collect distinct region ids
            Set<Integer> rids = new HashSet<>();
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    rids.add(regions[i][j]);

            for (int rid : rids) {
                boolean[] seen = new boolean[n + 1];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (regions[i][j] == rid) {
                            int v = board[i][j];
                            if (v != 0) {
                                if (seen[v]) return false;
                                seen[v] = true;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    // Utility: pretty print
    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int x : row) System.out.print((x == 0 ? "." : x) + " ");
            System.out.println();
        }
    }

    // Demo main: shows a 4x4 and 5x5 example
    public static void main(String[] args) {
        // 4x4 example (standard 2x2 boxes): numbers 1..4
        int[][] p4 = {
            {1, 0, 0, 3},
            {0, 3, 1, 0},
            {0, 0, 2, 0},
            {2, 0, 0, 4}
        };
        System.out.println("4x4 input:");
        printBoard(p4);
        boolean ok4 = solve(p4, null); // null -> auto box regions (2x2)
        if (ok4) {
            System.out.println("4x4 solved:");
            printBoard(p4);
        } else {
            System.out.println("No solution for 4x4 (or invalid).");
        }

        // 5x5 example as Latin-square (rows & cols unique) numbers 1..5
        int[][] p5 = {
            {0, 2, 0, 0, 0},
            {0, 0, 1, 2, 5},
            {4, 5, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 4, 1, 0}
        };
        System.out.println("\n5x5 input (Latin-square constraints):");
        printBoard(p5);
        boolean ok5 = solve(p5, null); // null -> no regions and n not perfect square -> Latin rules
        if (ok5) {
            System.out.println("5x5 solved (one possible solution):");
            printBoard(p5);
        } else {
            System.out.println("No solution for 5x5 (or invalid).");
        }

        // Example 5x5 with regions (jigsaw) - if you have custom regions, uncomment example below:
        /*
        int[][] regions5 = {
            {0,0,1,1,1},
            {0,2,2,3,1},
            {0,2,4,3,3},
            {0,4,4,4,3},
            {0,0,4,4,3},
        };
        int[][] p5j = {
            {0,2,0,0,1},
            {0,0,0,5,0},
            {2,0,0,0,4},
            {0,0,0,2,0},
            {0,0,4,0,0},
        };
        System.out.println("\n5x5 jigsaw input:");
        printBoard(p5j);
        if (solve(p5j, regions5)) {
            System.out.println("5x5 jigsaw solved:");
            printBoard(p5j);
        } else {
            System.out.println("No solution or invalid jigsaw puzzle.");
        }
        */
    }
}
