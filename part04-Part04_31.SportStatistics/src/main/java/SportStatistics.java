
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        ArrayList<Records> statistic = readStatisticFromFile(file);

        System.out.println("Team:");
        String viewTeam = scan.nextLine();

        int totalGamesPlayed = 0;
        int totalWin = 0;
        int totalLoss = 0;
        for (Records team : statistic) {

            int counter = 0;

            if (team.getTeamName().equals(viewTeam)) {
                counter++;
                totalGamesPlayed += counter;

                totalWin += team.getWin();
                totalLoss += team.getLoss();

            }

        }

        System.out.println("Games: " + totalGamesPlayed);
        System.out.println("Wins: " + totalWin);
        System.out.println("Losses: " + totalLoss);
    }

    public static ArrayList<Records> readStatisticFromFile(String file) {

        ArrayList<Records> teams = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(file))) {

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();

                String[] parts = line.split(",");
                String teamOne = parts[0];
                String teamTwo = parts[1];

                int pointsOne = Integer.parseInt(parts[2]);
                int pointsTwo = Integer.parseInt(parts[3]);

                int teamA = 0;
                int lossA = 0;
                int teamB = 0;
                int lossB = 0;

                if (pointsOne > pointsTwo) {

                    teamA = +1;
                    lossB = +1;

                } else if (pointsTwo > pointsOne) {
                    teamB = +1;
                    lossA = +1;

                }

                teams.add(new Records(teamOne, pointsOne, teamA, lossA));
                teams.add(new Records(teamTwo, pointsTwo, teamB, lossB));

            }

        } catch (Exception e) {

            System.out.println("No file found!");
        }

        return teams;

    }

}
