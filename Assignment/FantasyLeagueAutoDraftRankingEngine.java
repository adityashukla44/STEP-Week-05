import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FantasyLeagueAutoDraftRankingEngine {
    static class Player implements Comparable<Player> {
        final String name;
        final int matchesPlayed;
        final double battingAverage;
        final boolean injured;

        Player(String name, int matchesPlayed, double battingAverage, boolean injured) {
            this.name = name;
            this.matchesPlayed = matchesPlayed;
            this.battingAverage = battingAverage;
            this.injured = injured;
        }

        @Override
        public int compareTo(Player other) {
            return Double.compare(other.battingAverage, battingAverage);
        }
    }

    static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= 10;
    }

    static boolean isDraftable(int matchesPlayed, boolean injured) {
        return matchesPlayed >= 5 && !injured;
    }

    public static String draftAndRank(Player[] players) {
        List<Player> draftable = new ArrayList<>();
        for (Player player : players) {
            if (isDraftable(player.matchesPlayed)
                    || isDraftable(player.matchesPlayed, player.injured)) {
                draftable.add(player);
            }
        }
        Player[] ranked = draftable.toArray(new Player[0]);
        Arrays.sort(ranked);
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < ranked.length; i++) {
            if (i > 0) output.append(" | ");
            output.append(i + 1).append(". ").append(ranked[i].name);
        }
        return output.toString();
    }

    public static void main(String[] args) {
        Player[] players = {
            new Player("Virat", 15, 48.0, false),
            new Player("Rahul", 7, 55.0, false),
            new Player("Sameer", 3, 60.0, false),
            new Player("Dev", 12, 20.0, true)
        };
        System.out.println(draftAndRank(players));
    }
}
