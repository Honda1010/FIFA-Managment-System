/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author mohaned
 */
public class Recent_goal_entity {
    private String Player_name;
    private int match_minute;
    private String match_result,Home_Team,Away_Team,stadium_name;

    public Recent_goal_entity(String Player_name, int match_minute, String match_result, String Home_Team, String Away_Team, String stadium_name) {
        this.Player_name = Player_name;
        this.match_minute = match_minute;
        this.match_result = match_result;
        this.Home_Team = Home_Team;
        this.Away_Team = Away_Team;
        this.stadium_name = stadium_name;
    }

    public String getPlayer_name() {
        return Player_name;
    }

    public void setPlayer_name(String Player_name) {
        this.Player_name = Player_name;
    }

    public int getMatch_minute() {
        return match_minute;
    }

    public void setMatch_minute(int match_minute) {
        this.match_minute = match_minute;
    }

    public String getMatch_result() {
        return match_result;
    }

    public void setMatch_result(String match_result) {
        this.match_result = match_result;
    }

    public String getHome_Team() {
        return Home_Team;
    }

    public void setHome_Team(String Home_Team) {
        this.Home_Team = Home_Team;
    }

    public String getAway_Team() {
        return Away_Team;
    }

    public void setAway_Team(String Away_Team) {
        this.Away_Team = Away_Team;
    }

    public String getStadium_name() {
        return stadium_name;
    }

    public void setStadium_name(String stadium_name) {
        this.stadium_name = stadium_name;
    }
    
}
