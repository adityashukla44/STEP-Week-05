public class TopPerformerTracker {
    public static String findMinMaxSpread(int[] scores) {
        if (scores.length == 0) {
            throw new IllegalArgumentException("At least one score is required");
        }
        int minimum = scores[0];
        int maximum = scores[0];
        for (int score : scores) {
            if (score < minimum) minimum = score;
            if (score > maximum) maximum = score;
        }
        return "Min: " + minimum + " | Max: " + maximum + " | Spread: " + (maximum - minimum);
    }

    public static void main(String[] args) {
        System.out.println(findMinMaxSpread(new int[]{45, 82, 79, 90, 33, 90, 61}));
    }
}
