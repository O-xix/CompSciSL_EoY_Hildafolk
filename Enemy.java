import java.awt.*;
import java.io.*;
import java.lang.*;
import java.net.*;
import java.util.*;
import javax.imageio.*;
import javax.swing.*;
/**
 * Write a description of class Enemy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Enemy {
    // instance variables - replace the example below with your own
    String name_type = "Strangly-Shaped Troll";
    int enemyXpos = 10;
    int enemyYpos = 405;
    //basic stats
    int enemyHP = 1000;
    int enemyStrength = 10;
    int enemyIntellect;
    int enemyDefense;
    int enemyMagicDefense;
    int enemyAgility;
    int enemyAccuracy = 15;
    int enemyEvasion = 48;
    //spell-affinities
    int enemyFireAff;
    int enemyIceAff;
    int enemyLightningAff;
    int enemyEarthAff;
    int enemyWindAff;
    int enemyWaterAff;
    int enemyDarkAff;
    int enemyGravityAff;
    int enemyDrainAff;
    public void enemySpriteRefresh(DrawingPanel panel, int enemyXPos, int enemyYPos) {
        Graphics enemy = panel.getGraphics();
        //enemy.setColor(new Color(255, 255, 255));
        //enemy.fillRect(720, 405, 1440, 810);
        enemy.setColor(new Color(0, 0, 0));
        enemy.fillRect(10 + enemyXPos, 10 + enemyYPos, 10, 10);
        enemy.fillRect(10 + enemyXPos, 20 + enemyYPos, 10, 10);
        enemy.fillRect(10 + enemyXPos, 30 + enemyYPos, 10, 10);
        enemy.fillRect(20 + enemyXPos, 10 + enemyYPos, 10, 10);
        enemy.fillRect(20 + enemyXPos, 30 + enemyYPos, 10, 10);
        enemy.fillRect(30 + enemyXPos, 10 + enemyYPos, 10, 10);
        enemy.fillRect(30 + enemyXPos, 20 + enemyYPos, 10, 10);
        enemy.fillRect(30 + enemyXPos, 30 + enemyYPos, 10, 10);
    }
    public void enemyAttack(Hilda hilda, Random battle_hit_limit) {
        System.out.println("The " + name_type + " attacks!");
        int maybe_hit = battle_hit_limit.nextInt(101);
        if (maybe_hit <= enemyAccuracy) {
            hilda.hildaTakeAttack(enemyStrength/2 + 5, battle_hit_limit);
        }
        else {
            System.out.println("The " + name_type + " misses!");
            System.out.println("\n");
        }
    }
    public void enemyTakeAttack(int HPtaken, Random battle_hit_limit) {
        int maybe_miss = battle_hit_limit.nextInt(101);
        if (maybe_miss <= enemyEvasion) {
            enemyHP -= HPtaken;
            System.out.println("The " + name_type + " loses " + HPtaken + " health points! \n");
            if (enemyHP == 0) {
                System.out.println(name_type + " lost their soul.");
                System.out.println(name_type + "'s game is over. You won?");
                System.exit(0);
            }
            else {
                //do nothing
            }
        }
        else {
            System.out.println("The " + name_type + " dodges! \n");
        }
    }
    
    //Magic attacks:
    public void enemyMagicAttack(Hilda hilda, Random battle_hit_limit) {
        System.out.println("The " + name_type + " attacks!");
        int maybe_hit = battle_hit_limit.nextInt(101);
        if (maybe_hit <= enemyAccuracy) {
            hilda.hildaTakeAttack(enemyStrength/2 + 5, battle_hit_limit);
        }
        else {
            System.out.println("The " + name_type + " misses!");
            System.out.println("\n");
        }
    }
    public void enemyTakeMagicAttack(String magic_type, int HPtaken, Random battle_hit_limit, int magic_affinity) {
        int maybe_miss = battle_hit_limit.nextInt(101);
        //find magic_affinity factor
        if(magic_type.equals("Fire")) {
            magic_affinity = enemyFireAff;
        }
        else if(magic_type.equals("Water")) {
            magic_affinity = enemyFireAff;
        }
        else if(magic_type.equals("Ice")) {
            magic_affinity = enemyFireAff;
        }
        else {
            System.out.println("Error.");
        }
        //actual damage
        if (maybe_miss <= enemyEvasion) {
            enemyHP -= ((HPtaken * magic_affinity)/100);
            System.out.println("The " + name_type + " loses " + ((HPtaken * magic_affinity)/100) + " health points! \n");
            if (enemyHP == 0) {
                System.out.println(name_type + " lost their soul.");
                System.out.println(name_type + "'s game is over. You won?");
                System.exit(0);
            }
            else {
                //do nothing
            }
        }
        else {
            System.out.println("The " + name_type + " dodges! \n");
        }
    }
}  
