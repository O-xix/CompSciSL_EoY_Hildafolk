
import java.util.*;
/**
 * Write a description of class Hilda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hilda {
    //Stats and other variables:
    String hildaName = "Hilda";
    //basic stats:
    int hildaHP = 300;
    int hildaMaxHP = 0;
    int hildaMP = 0;
    int hildaMaxMP = 0;
    int hildaStrength = 15;
    int hildaAgility = 0;
    int hildaIntelligence = 0;
    int hildaStamina = 0;
    int hildaLuck = 0;
    int hildaAttack = 0;
    int hildaAccuracy = 15;
    int hildaDefense = 0;
    int hildaEvasion = 48;
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
    /*
    public void hildaSpriteRefresh(DrawingPanel panel, int hildaXPos, int hildaYPos) {
        Graphics hildaSprite = panel.getGraphics();
        //Making the sprite:
        //g.setColor(new Color(0, 0, 0)); RGB Coloring
        //g.fillRect(x, y, width, height);
        //Black portion of the sprite:
        hildaSprite.setColor(new Color(0, 0, 0));
        //Column 1 of Sprite (x = 5)
        hildaSprite.fillRect(5 + hildaXPos, 35 + hildaYPos, 5, 10);
        hildaSprite.fillRect(5 + hildaXPos, 73 + hildaYPos, 5, 15);
    }
    */
    public void hildaAttack(Enemy enemy, Random battle_hit_limit) {
        System.out.println(hildaName + " attacks!");
        int maybe_hit = battle_hit_limit.nextInt(101);
        if (maybe_hit <= hildaAccuracy) {
            enemy.enemyTakeAttack(hildaStrength/2 + 5, battle_hit_limit);
        }
        else {
            System.out.println(hildaName + " misses!");
        }
    }
    public void hildaTakeAttack(int HPtaken, Random battle_hit_limit) {
        int maybe_miss = battle_hit_limit.nextInt(101);
        if (maybe_miss <= hildaAccuracy) {
            hildaHP -= HPtaken;
            System.out.println(hildaName + " loses " + HPtaken + " health points! \n\n");
        }
        else {
            System.out.println(hildaName + " dodges!");
        }
    }
}
class trollHilda extends Hilda {
    
}
