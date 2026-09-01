import java.util.*;

class Team {
    String name;
    int matchesPlayed;
    int wins;
    int draws;

    Team(String name, int matchesPlayed, int wins, int draws) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.wins = wins;
        this.draws = draws;
    }

    int calculatePoints() {
        return 0;
    }
}

class CricketTeam extends Team {

    CricketTeam(String name, int matchesPlayed, int wins, int draws) {
        super(name, matchesPlayed, wins, draws);
    }

    @Override
    int calculatePoints() {
        return (wins * 2) + draws;
    }
}

class FootballTeam extends Team {

    FootballTeam(String name, int matchesPlayed, int wins, int draws) {
        super(name, matchesPlayed, wins, draws);
    }

    @Override
    int calculatePoints() {
        return (wins * 3) + draws;
    }
}

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Team[] teams = new Team[2];
        String[] sports = new String[2];

        // Pehle dono inputs
        for (int i = 0; i < 2; i++) {
            String[] data = sc.nextLine().split(",");

            sports[i] = data[0];

            String name = data[1];
            int matchesPlayed = Integer.parseInt(data[2]);
            int wins = Integer.parseInt(data[3]);
            int draws = Integer.parseInt(data[4]);

            if (sports[i].equals("Cricket")) {
                teams[i] = new CricketTeam(
                        name, matchesPlayed, wins, draws
                );
            } else {
                teams[i] = new FootballTeam(
                        name, matchesPlayed, wins, draws
                );
            }
        }

        // Dono outputs ek saath
        for (int i = 0; i < 2; i++) {
            System.out.println(
                    "Team: " + teams[i].name +
                            " (" + sports[i] + ") Points: " +
                            teams[i].calculatePoints()
            );
        }

        sc.close();
    }
}