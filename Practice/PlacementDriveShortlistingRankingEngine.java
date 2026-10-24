import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlacementDriveShortlistingRankingEngine {
    static class Candidate implements Comparable<Candidate> {
        final String name;
        final double cgpa;
        final int codingScore;

        Candidate(String name, double cgpa, int codingScore) {
            this.name = name;
            this.cgpa = cgpa;
            this.codingScore = codingScore;
        }

        double compositeScore() {
            return cgpa * 10.0 + codingScore * 0.5;
        }

        @Override
        public int compareTo(Candidate other) {
            return Double.compare(other.compositeScore(), compositeScore());
        }
    }

    static boolean isEligible(double cgpa) {
        return cgpa >= 7.5;
    }

    static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 6.5 && codingScore >= 60;
    }

    public static String shortlistAndRank(Candidate[] candidates) {
        List<Candidate> shortlisted = new ArrayList<>();
        for (Candidate candidate : candidates) {
            if (isEligible(candidate.cgpa) || isEligible(candidate.cgpa, candidate.codingScore)) {
                shortlisted.add(candidate);
            }
        }
        Candidate[] ranked = shortlisted.toArray(new Candidate[0]);
        Arrays.sort(ranked);
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < ranked.length; i++) {
            if (i > 0) output.append(" | ");
            output.append(i + 1).append(". ").append(ranked[i].name)
                    .append(" (").append(String.format("%.1f", ranked[i].compositeScore())).append(')');
        }
        return output.toString();
    }

    public static void main(String[] args) {
        Candidate[] candidates = {
            new Candidate("Aisha", 8.2, 40),
            new Candidate("Rohit", 6.8, 65),
            new Candidate("Meena", 6.0, 90),
            new Candidate("Karan", 7.5, 20)
        };
        System.out.println(shortlistAndRank(candidates));
    }
}
