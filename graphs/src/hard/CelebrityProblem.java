package graphs.src.hard;

/**
 * Problem URL: https://www.geeksforgeeks.org/the-celebrity-problem/
 */
public class CelebrityProblem {

    static final int N = 8;

    static int[][] MATRIX = {{0, 0, 1, 0},
                             {0, 0, 1, 0},
                             {0, 0, 0, 0},
                             {0, 0, 1, 0}};

    public static void main(String[] args) {

        int n = 4;

        int id = findCelebrity(n);
        if (id == -1) System.out.print("No celebrity");
        else System.out.print("Celebrity ID " + id);
    }

    static int findCelebrity(int n) {

        int[] inDegree = new int[n];
        int[] outDegree = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = knows(i, j);
                outDegree[i] = outDegree[i] + x;
                inDegree[j] = inDegree[j] + x;
            }
        }

        for (int i = 0; i < n; i++) if (inDegree[i] == n - 1 && outDegree[i] == 0) return i;

        return -1;
    }

    static int knows(int a, int b) {

        return MATRIX[a][b];
    }

}
