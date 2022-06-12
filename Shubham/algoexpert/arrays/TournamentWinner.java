package algoexpert.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TournamentWinner {
    public static String findTournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        Map<String, Integer> teamScores = new HashMap<>();
        String currentBestTeam = "";
        teamScores.put(currentBestTeam, 0);

        for (int i = 0; i < results.size(); i++) {
            String home = competitions.get(i).get(0);
            String away = competitions.get(i).get(1);
            String winner = results.get(i) == 1 ? home : away;

            teamScores.put(winner, teamScores.getOrDefault(winner, 0) + 3);

            if (teamScores.get(winner) > teamScores.get(currentBestTeam)) {
                currentBestTeam = winner;
            }
        }
        return currentBestTeam;
    }
}
