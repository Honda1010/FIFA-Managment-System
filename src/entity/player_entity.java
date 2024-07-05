/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author mohaned
 */
public class player_entity {
private int player_id,age,height,club_id,shirt_num,salary;
private String fname,lname,player_national,position,preferred_foot;

    public player_entity(int player_id, String fname, String lname, int age, String player_national, int height, String position, String preferred_foot, int club_id, int shirt_num, int salary) {
        this.player_id = player_id;
        this.age = age;
        this.height = height;
        this.club_id = club_id;
        this.shirt_num = shirt_num;
        this.salary = salary;
        this.fname = fname;
        this.lname = lname;
        this.player_national = player_national;
        this.position = position;
        this.preferred_foot = preferred_foot;
    }

    public int getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getClub_id() {
        return club_id;
    }

    public void setClub_id(int club_id) {
        this.club_id = club_id;
    }

    public int getShirt_num() {
        return shirt_num;
    }

    public void setShirt_num(int shirt_num) {
        this.shirt_num = shirt_num;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPlayer_national() {
        return player_national;
    }

    public void setPlayer_national(String player_national) {
        this.player_national = player_national;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPreferred_foot() {
        return preferred_foot;
    }

    public void setPreferred_foot(String preferred_foot) {
        this.preferred_foot = preferred_foot;
    }

    
}
