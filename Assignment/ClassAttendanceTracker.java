import java.util.Arrays;

public class ClassAttendanceTracker {
    public static int[] attendanceSummary(int[] days) {
        int present = 0, currentStreak = 0, longestStreak = 0;
        for (int day : days) {
            if (day == 1) {
                present++;
                currentStreak++;
                longestStreak = Math.max(longestStreak, currentStreak);
            } else {
                currentStreak = 0;
            }
        }
        return new int[]{present, longestStreak};
    }

    public static void main(String[] args) {
        int[] days = {1, 1, 0, 1, 1, 1, 0, 1};
        int[] summary = attendanceSummary(days);
        System.out.println("Days: " + Arrays.toString(days));
        System.out.println("Present: " + summary[0] + ", Longest streak: " + summary[1]);
        System.out.println("Complexity: O(n) time and O(1) extra space.");
    }
}
