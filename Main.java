import java.awt.*;
import java.io.*;
import java.lang.*;
import java.net.*;
import java.util.*;
import javax.imageio.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("");
        //DrawingPanel panel = new DrawingPanel(960, 540);
        int posXpos = 0;
        int posYpos = 0;
        Hilda hilda = new Hilda();
        hilda.hildaItemsGive();
        Enemy troll = new Enemy();
        battle(hilda, troll);
        //hilda chara1 = pafie;
        //pafie.hildaSpriteRefresh(panel, posXpos, posYpos);
    }
    public static void battle(Hilda hilda, Enemy enemy) {
        Scanner battle_input = new Scanner(System.in);
        Random battle_random = new Random();
        String escape_menu = "";
        System.out.println("The " + enemy.name_type + " nearly stepped on you! \n");
        boolean fleed = false;
        while (enemy.enemyHP > 0 && fleed == false) {
            //Player attack
            System.out.println("What will you do?");
            System.out.println("    FIGHT (only working one)   MAGIC");
            System.out.println("    ITEMS   FLEE \n\n");

            String battle_command = battle_input.nextLine();
            System.out.println("\n\n");
            if(battle_command.equals("FIGHT")) {
                hilda.hildaAttack(enemy, battle_random);
            }
            else if(battle_command.equals("MAGIC")) {
                for (int i = 0; i < hilda.hildaMagicList.size(); i++) {
                    System.out.println(hilda.hildaMagicList.get(i) + " :  " + hilda.hildaMagicListType.get(i));
                }
                System.out.println("\n" + "Who would you like to call on? ");
                String item_input = item_navi_input.nextLine();
                hilda.hildaMagicAttack(item_input, enemy, battle_random);
            }
            else if(battle_command.equals("ITEMS")) {
                escape_menu = hilda.hildaItems(battle_input);
                if (escape_menu.equals("ESCAPE")) {
                    continue;
                }
            }
            else if(battle_command.equals("FLEE")) {
                fleed = hilda.hildaFlee(battle_random);
                if (fleed = true) {
                    break;
                }
                else {
                    continue;
                }
            }
            else {
                System.out.println("Error.");
                continue;
            }
            //Enemy attack
            enemy.enemyAttack(hilda, battle_random);
        }
    }
}
