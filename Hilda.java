
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
    int hildaLevel = 10;
    int hildaHP = 300;
    int hildaMaxHP = 0;
    int hildaMP = 0;
    int hildaMaxMP = 0;
    int hildaStrength = 15;
    int hildaAgility = 0;
    int hildaIntelligence = 0;
    int hildaStamina = 0;
    int hildaLuck = 13;
    int hildaAttack = 0;
    int hildaAccuracy = 15;
    int hildaDefense = 100;
    int hildaEvasion = 48;
    //spell-affinities; the greater the number, the harder the hit.
    int hildaFireAff = 110;
    int hildaIceAff;
    int hildaLightningAff;
    int hildaEarthAff;
    int hildaWindAff;
    int hildaWaterAff;
    int hildaDarkAff;
    int hildaGravityAff;
    int hildaDrainAff;
    //item list
    ArrayList<String> hildaItemList = new ArrayList<String>();
    ArrayList<int> hildaItemListQuantity = new ArrayList<int>();
    hildaItemList.add("Potion");
    hildaItemListQuantity.add(5);
    hildaItemList.add("Elixir");
    hildaItemListQuantity.add(3);
    hildaItemList.add("Hi-Potion");
    hildaItemListQuantity.add(1);
    //magic list
    ArrayList<String> hildaMagicList = new ArrayList<String>();
    ArrayList<String> hildaMagicListType = new ArrayList<String>();
    hildaMagicList.add("Lindworm");
    hildaMagicListType.add("Fire");
    hildaMagicList.add("Greela");
    hildaMagicListType.add("Ice");
    hildaMagicList.add("Kraken");
    hildaMagicListType.add("Water");
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
    //ATTACKS
    public void hildaAttack(Enemy enemy, Random battle_hit_limit) {
        System.out.println(hildaName + " attacks!");
        int maybe_hit = battle_hit_limit.nextInt(101);
        if (maybe_hit <= hildaAccuracy) {
            enemy.enemyTakeAttack(hildaStrength/2 + 5, battle_hit_limit);
        }
        else {
            System.out.println(hildaName + " misses! \n");
        }
    }
    public void hildaTakeAttack(int HPtaken, Random battle_hit_limit) {
        int maybe_miss = battle_hit_limit.nextInt(101);
        if (maybe_miss <= hildaEvasion) {
            hildaHP -= HPtaken;
            System.out.println(hildaName + " loses " + HPtaken + " health points! \n");
        }
        else {
            System.out.println(hildaName + " dodges! \n");
        }
    }
    
    //MAGIC
    public void hildaMagicAttack(String summon, Enemy enemy, Random battle_hit_limit) {
        Boolean found_summon = false;
        while (found_summon == false) {
            if(hildaMagicList.contains(summon)) {
                System.out.println(hildaName + " calls out to " + summon + "!");
                String magic_type = hildaMagicListType.get(hildaMagicList.index(summon));
                int maybe_hit = battle_hit_limit.nextInt(101);
                if (maybe_hit <= hildaAccuracy) {
                    enemy.enemyTakeMagicAttack(magic_type, hildaStrength/2 + 5, battle_hit_limit);
                }
                else {
                    System.out.println(hildaName + " & " + summon + " miss! \n");
                }
            }
            else {
                System.out.println("Hilda doesn't know who you're looking for, but they're not here. ");
            }
        }
    }
    public void hildaTakeMagicAttack(String magic_type, int HPtaken, Random battle_hit_limit) {
        int maybe_miss = battle_hit_limit.nextInt(101);
        int magic_affinity;
        //find magic_affinity factor
        if(magic_type.equals("Fire")) {
            magic_affinity = hildaFireAff;
        }
        else if(magic_type.equals("Water")) {
            magic_affinity = hildaWaterAff;
        }
        else if(magic_type.equals("Ice")) {
            magic_affinity = hildaFireAff;
        }
        else {
            System.out.println("Error.");
        }
        //actual damage
        if (maybe_miss <= hildaEvasion) {
            enemyHP -= ((HPtaken * magic_affinity)/100);
            System.out.println("The " + name_type + " loses " + HPtaken + " health points! \n");
        }
        else {
            System.out.println("The " + name_type + " dodges! \n");
        }
    }
    
    //ITEMS
    public boolean hildaItems(Scanner item_navi_input) {
        for (int i = 0; i < hildaItemList.size(); i++) {
            System.out.println(hildaItemList.get(i) + " :  " + hildaItemListQuantity.get(i));
        }
        System.out.println("\n" + "What item would you like to use? ");
        String item_input = item_navi_input.nextLine();
        if (item_input.equals(""))
    }
    //FLEE
    public boolean hildaFlee(Random battle_flee_limit) {
        System.out.println(hildaName + " tries to run for it!");
        int maybe_flee = battle_flee_limit.nextInt(hildaLevel + 16);
        if (hildaLuck >= maybe_flee) {
            System.out.println(hildaName + " was able to escape!");
            return true;
        }
        else {
            System.out.println(hildaName + " was not able to escape. \n");
            return false;
        }
    }
}
