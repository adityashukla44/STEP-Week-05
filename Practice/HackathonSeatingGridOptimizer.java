public class HackathonSeatingGridOptimizer {
    private static double rowAverage(int[] row) {
        if (row.length == 0) return 0.0;
        int sum = 0;
        for (int value : row) sum += value;
        return (double) sum / row.length;
    }

    public static String classifyRows(int[][] seatingScores, int threshold) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < seatingScores.length; i++) {
            if (i > 0) output.append(" | ");
            double average = rowAverage(seatingScores[i]);
            output.append("Row ").append(i).append(": ")
                    .append(average < threshold ? "Quiet Zone" : "Buzzing Zone");
        }
        return output.toString();
    }

    public static void main(String[] args) {
        int[][] scores = {{40, 50, 45}, {85, 90, 95}, {30, 20, 25}};
        System.out.println(classifyRows(scores, 60));
    }
}
