import java.util.*;
/**
 * Write a description of class Enemy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Enemy {
    // instance variables - replace the example below with your own
    String name_type = "Strangly-Shaped Troll";
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
    public void enemyTakeMagicAttack(String magic_type, int HPtaken, Random battle_hit_limit) {
        int maybe_miss = battle_hit_limit.nextInt(101);
        int magic_affinity;
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
        }
        else {
            System.out.println("The " + name_type + " dodges! \n");
        }
    }
}
