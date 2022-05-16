
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
        Enemy troll = new Enemy();
        battle(hilda, troll);
        //hilda chara1 = pafie;
        //pafie.hildaSpriteRefresh(panel, posXpos, posYpos);
    }
    public static void battle(Hilda hilda, Enemy enemy) {
        Scanner battle_input = new Scanner(System.in);
        Random battle_hit_limit = new Random();
        System.out.println("The " + enemy.name_type + " nearly stepped on you!");
        while (enemy.enemyHP > 0) {
            //Player attack
            System.out.println("What will you do?");
            System.out.println("    FIGHT (only working one)   MAGIC");
            System.out.println("    ITEMS   FLEE \n\n");
            
            String battle_command = battle_input.nextLine();
            if (battle_command == "FIGHT") {
                System.out.print("Hello!");
                hilda.hildaAttack(enemy, battle_hit_limit);
            }
            else {
                continue;
            }
            
            //Enemy attack
            enemy.enemyAttack(hilda, battle_hit_limit);
        }
    }
}
