/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author mohaned
 */
public class Model_menu {

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public menutype getType() {
        return type;
    }

    public void setType(menutype type) {
        this.type = type;
    }
 private String icon;
 private String name;
 private menutype type;

    public Model_menu(String icon, String name, menutype type) {
        this.icon = icon;
        this.name = name;
        this.type = type;
    }
 public Icon toIcon(){
     return new ImageIcon(getClass().getResource("/icons/"+icon+".png"));
 }
 public static enum menutype{
     TITLE , MENU ,EMPTY
 }
}
