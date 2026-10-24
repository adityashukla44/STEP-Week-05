public class BusiestBusRow {

    public static int[] busiestRow(int[][] grid) {
        if (grid.length == 0) return new int[]{-1, 0};
        int bestIndex = 0;
        int bestTotal = Integer.MIN_VALUE;
        for (int row = 0; row < grid.length; row++) {
            int total = 0;
            for (int seats : grid[row]) total += seats;
            if (total > bestTotal) {
                bestTotal = total;
                bestIndex = row;
            }
        }
        return new int[]{bestIndex, bestTotal};
    }

    public static void main(String[] args) {
        int[][] grid = {{2, 0, 1}, {3, 3, 1}, {1, 1, 1}};
        int[] answer = busiestRow(grid);
        System.out.println("Row " + answer[0] + ", Total " + answer[1]);
        System.out.println("Complexity: O(r*c) time and O(1) extra space.");
    }
}
