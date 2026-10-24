import java.util.Arrays;

public class DutyRosterRotation {
    public static String[] rotateRoster(String[] names, long k) {
        int n = names.length;
        if (n == 0) return new String[0];
        int shift = (int) (k % n);
        String[] rotated = new String[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + shift) % n] = names[i];
        }
        return rotated;
    }

    public static void main(String[] args) {
        String[] names = {"A", "B", "C", "D", "E"};
        System.out.println("k=2: " + Arrays.toString(rotateRoster(names, 2)));
        System.out.println("k=7: " + Arrays.toString(rotateRoster(names, 7)));
        System.out.println("Complexity: O(n) time and O(n) extra space.");
    }
}
