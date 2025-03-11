
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        ArrayList<Statistics> records = readRecordsFromFile(file);
        System.out.println("Team:");
        String team = scan.nextLine();
        int wins = 0;
        int losses = 0;
        int games = 0;
                
            for(Statistics statistics : records) {
                String awayTeam = statistics.getAway();
                String homeTeam = statistics.getHome();
                
                if(awayTeam.equals(team)) {
                    games++;
                    if(statistics.getAwayPoints() > statistics.getHomePoints()) {
                        wins++;
                    } else {
                        losses++;
                    }       
                }
                if(homeTeam.equals(team)) {
                    games++;
                    if(statistics.getHomePoints() > statistics.getAwayPoints()) {
                        wins++;
                    } else {
                        losses++;
                    }
                }        
            }
            
            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
    }
    
    public static ArrayList<Statistics> readRecordsFromFile(String file) {
        ArrayList<Statistics> list = new ArrayList<>();
        try(Scanner reader = new Scanner(Paths.get(file))) {
            
            while(reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] info = line.split(",");
                
                String home = info[0];
                String away = info[1];
                String homePoints = info[2];
                String awayPoints = info[3];
                
                Statistics game = new Statistics(home, away, homePoints, awayPoints);
                list.add(game);   
            }
         
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return list;
        
    }
    
}
    



        