/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author MOHAMED
 */
public class match_entity_league_next {
    private String league_name;
    private int league_week;
    private String match_date;
    private String match_result;
    private String Home;
    private String Away;

    public match_entity_league_next(String league_name, int league_week, String match_date, String match_result, String Home, String Away) {
        this.league_name = league_name;
        this.league_week = league_week;
        this.match_date = match_date;
        this.match_result = match_result;
        this.Home = Home;
        this.Away = Away;
    }

    public String getLeague_name() {
        return league_name;
    }

    public void setLeague_name(String league_name) {
        this.league_name = league_name;
    }

    public int getLeague_week() {
        return league_week;
    }

    public void setLeague_week(int league_week) {
        this.league_week = league_week;
    }

    public String getMatch_date() {
        return match_date;
    }

    public void setMatch_date(String match_date) {
        this.match_date = match_date;
    }

    public String getMatch_result() {
        return match_result;
    }

    public void setMatch_result(String match_result) {
        this.match_result = match_result;
    }

    public String getHome() {
        return Home;
    }

    public void setHome(String Home) {
        this.Home = Home;
    }

    public String getAway() {
        return Away;
    }

    public void setAway(String Away) {
        this.Away = Away;
    }
    
}
