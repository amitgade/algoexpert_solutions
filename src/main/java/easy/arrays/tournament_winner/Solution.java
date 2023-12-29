package easy.arrays.tournament_winner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by amitgade on 13-Feb-2022
 */
public class Solution {
    // O(n) time : n is number of competitions
    // O(k) space : k is number of teams

    private int HOME_TEAM_WON = 1;

    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

        Map<String, Integer> scores = new HashMap<>();
        String currentBestTeam = "";
        scores.put(currentBestTeam, 0);

        for (int i = 0; i < competitions.size(); i++) {
            ArrayList<String> competition = competitions.get(i);
            String homeTeam = competition.get(0);
            String awayTeam = competition.get(1);
            String winnerTeam = (results.get(i) == HOME_TEAM_WON) ? homeTeam : awayTeam;

            this.updateScore(winnerTeam, 3, scores);
            if (scores.get(winnerTeam) > scores.get(currentBestTeam)) {
                currentBestTeam = winnerTeam;
            }
        }
        return currentBestTeam;
    }

    private void updateScore(String teamName, int points, Map<String, Integer> scores) {
        if (scores.containsKey(teamName)) {
            scores.put(teamName, scores.get(teamName) + points);
        } else {
            scores.put(teamName, points);
        }
    }
}
