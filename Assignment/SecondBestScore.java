import java.util.Arrays;

public class SecondBestScore {
    public static int secondHighest(int[] scores) {
        int highest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int score : scores) {
            if (score > highest) {
                second = highest;
                highest = score;
            } else if (score < highest && score > second) {
                second = score;
            }
        }
        return second == Integer.MIN_VALUE ? -1 : second;
    }

    public static void main(String[] args) {
        int[] scores = {45, 78, 92, 78, 60};
        System.out.println("Scores: " + Arrays.toString(scores));
        System.out.println("Second-highest distinct score: " + secondHighest(scores));
        System.out.println("All equal: " + secondHighest(new int[]{50, 50, 50}));
            System.out.println("Complexity: O(n) time and O(1) extra space; sorting would take O(n log n) time.");
    }
}
