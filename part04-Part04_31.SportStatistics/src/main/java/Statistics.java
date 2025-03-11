/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ilja
 */
public class Statistics {
    private String home = "";
    private String away = "";
    private String homePoints = "";
    private String awayPoints = "";
    private int homeCounter = 0;
    private int awayCounter = 0;
    
    public Statistics(String home, String away, String homePoints, String awayPoints) {
        this.home = home;
        this.away = away;
        this.homePoints = homePoints;
        this.awayPoints = awayPoints;
    }
    
    public String getHome() {
        return this.home;
    }
    
    public String getAway() {
        return this.away;
    }
    
    public int getHomePoints() {
        return Integer.valueOf(homePoints);
    }
    
    public int getAwayPoints() {
        return Integer.valueOf(awayPoints);
    }
    
    @Override
    public String toString() {
        return this.home + ", " + this.away + ". " + this.homePoints + ", " + this.awayPoints;
    }
  
}
