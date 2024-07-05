/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;
public class Top_Salary_entity {
    private String Player_Name;
    int salary;

    public Top_Salary_entity (String Player_Name, int salary) {
        this.Player_Name = Player_Name;
        this.salary = salary;
    }

    public String getPlayer_Name() {
        return Player_Name;
    }

    public void setPlayer_Name(String Player_Name) {
        this.Player_Name = Player_Name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}
