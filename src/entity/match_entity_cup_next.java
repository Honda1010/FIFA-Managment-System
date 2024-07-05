/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author MOHAMED
 */
public class match_entity_cup_next {
 private String cup_name;
 private String cup_round;
 private String match_date;
 private String match_result;
 private String Home;
 private String Away;

    public match_entity_cup_next(String cup_name, String cup_round, String match_date, String match_result, String Home, String Away) {
        this.cup_name = cup_name;
        this.cup_round = cup_round;
        this.match_date = match_date;
        this.match_result = match_result;
        this.Home = Home;
        this.Away = Away;
    }

    public String getCup_name() {
        return cup_name;
    }

    public void setCup_name(String cup_name) {
        this.cup_name = cup_name;
    }

    public String getCup_round() {
        return cup_round;
    }

    public void setCup_round(String cup_round) {
        this.cup_round = cup_round;
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
