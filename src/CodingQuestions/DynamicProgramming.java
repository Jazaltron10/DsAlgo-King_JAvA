import java.util.*;

public class DynamicProgramming {
    public static int gridTraveler(int width, int height) {
        if (width == 1 && height == 1)
            return 1;
        if (width == 0 || height == 0)
            return 0;
        // Decreasing the width and height of the grid with each recursive call
        return gridTraveler(width - 1, height) + gridTraveler(width, height - 1);
    }

    public static double gridTravelerMemoized(int w, int h, Map<String, Double> memo) {
        String key = "" + w + "," + h;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        if (w == 1 && h == 1)
            return 1;
        if (w == 0 || h == 0)
            return 0;
        memo.put(key, (gridTravelerMemoized(w - 1, h, memo) + gridTravelerMemoized(w, h - 1, memo)));
        return memo.get(key);
    }

    public static void main(String[] args) {
        // int res = gridTraveler(2,3);
        // System.out.println("\n"+gridTraveler(2,3));
        // System.out.println("\n"+gridTraveler(3,3));
        // System.out.println("\n"+gridTraveler(4,3));
        // System.out.println("\n"+gridTraveler(8,8));
        // System.out.println("\n"+gridTraveler(18,18));
        Map<String, Double> memo = new HashMap<String, Double>();
        System.out.println("\n" + gridTravelerMemoized(18, 18, memo));
        System.out.println("\n" + gridTravelerMemoized(4, 3, memo));
    }
}

// int sum[] = new int[16];
// int h = 0;
// for (int i = 0; i < 4; i++) {
// for (int j = 0; j < 4; j++) {
// sum[h] = arr[i][j] + arr[i][j+1] + arr[i][j+2]
// + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1]
// + arr[i+2][j+2];
// h++;
// }
// }
// Arrays.sort(sum);
// System.out.println(sum[15]);

// public static List<Integer> twoDimensions(String[] coordinates, int n) {

// List<Integer> maxAndCount = new ArrayList<Integer>();
// int[][] grid = new int[n][n];
// int arrLength = coordinates.length;
// int max = Integer.MIN_VALUE;
// int count = 1;

// for (int i = 0; i < arrLength; i++) {

// String[] coors = coordinates[i].split(" ");
// int row = Integer.parseInt(coors[0]);
// int column = Integer.parseInt(coors[1]);

// for (int j = 0; j < row; j++) {
// for (int k = 0; k < column; k++) {

// grid[j][k] += 1;
// System.out.println("grid (" + j + "," + k + "): " + grid[j][k]);

// if (!(j == 0 & k == 0) && grid[j][k] > max) {

// max = grid[j][k];
// count = 1;

// } else if (grid[j][k] == max) {

// count++;

// }
// }
// }
// }

// maxAndCount.add(max);
// maxAndCount.add(count);

// return maxAndCount;
// }

// public static void main(String[] args) {

// String[] coors = { "1 3", "2 4", "4 1", "3 2" };
// System.out.println("The Max and count Are:" + twoDimensions(coors,
// 4).toString());
// }
