
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
        hilda.hildaTakeAttack(enemyStrength/2 + 5, battle_hit_limit);
    }
    public void enemyTakeAttack(int HPtaken, Random battle_hit_limit) {
        enemyHP -= HPtaken;
        System.out.println("The " + name_type + " loses " + HPtaken + " health points! \n\n");
    }
}
