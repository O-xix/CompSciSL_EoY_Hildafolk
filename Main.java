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
        Maze maze = new Maze();
        navigation(maze);
    }
    public static void navigation(Maze maze) {
        System.out.println("Navigate the maze and reach the end. (Controls: UP, DOWN, LEFT, RIGHT) ");
        maze.setupRandomMaze(maze.maze_layout);
        maze.visualizeMaze(maze.maze_layout, maze.maze);
        maze.visualizePlayerSpace(maze.maze);
        Hilda hilda = new Hilda();
        hilda.hildaItemsGive();
        Enemy troll = new Enemy();
        Scanner navigation_input = new Scanner(System.in);
        Random navi_random = new Random();
        while (true) {
            String navi_input = navigation_input.nextLine();
            maze.visualizeMaze(maze.maze_layout, maze.maze);
            maze.changePlayerPosition(navi_input, maze.maze_layout);
            maze.visualizePlayerSpace(maze.maze);
            if (navi_random.nextInt(3) == 1) {
                maze.maze.setVisible(false);
                battle(hilda, troll);
                maze.maze.setVisible(true);
            }
            else {
                continue;
            }
        }        
    }
    public static void battle(Hilda hilda, Enemy enemy) {
        Scanner battle_input = new Scanner(System.in);
        Random battle_random = new Random();
        String escape_menu = "";
        String game_over = "";
        DrawingPanel battle = new DrawingPanel(1440, 810);
        System.out.println("\n\n\n\n\n________________________");
        System.out.println("The " + enemy.name_type + " nearly stepped on you! \n");
        boolean fleed = false;
        while (enemy.enemyHP > 0 && fleed == false) {
            hilda.hildaSpriteRefresh(battle, hilda.hildaXpos, hilda.hildaYpos);
            enemy.enemySpriteRefresh(battle, enemy.enemyXpos, enemy.enemyYpos);
            //Player attack
            System.out.println("What will you do?");
            System.out.println("    FIGHT   MAGIC");
            System.out.println("    ITEMS   FLEE \n\n");
            String battle_command = battle_input.nextLine();
            System.out.println("\n\n");
            if(battle_command.equals("FIGHT")) {
                for (int i = 0; i < 300; i++) {
                    hilda.hildaSpriteWhiteRefresh(battle, hilda.hildaXpos, hilda.hildaYpos);
                    hilda.hildaXpos -= 3;
                    hilda.hildaSpriteRefresh(battle, hilda.hildaXpos, hilda.hildaYpos);
                    enemy.enemySpriteRefresh(battle, enemy.enemyXpos, enemy.enemyYpos);
                    battle.sleep(2);
                }
                
                hilda.hildaAttack(enemy, battle_random);
                
                for (int i = 0; i < 300; i++) {
                    hilda.hildaSpriteWhiteRefresh(battle, hilda.hildaXpos, hilda.hildaYpos);
                    hilda.hildaXpos += 3;
                    hilda.hildaSpriteRefresh(battle, hilda.hildaXpos, hilda.hildaYpos);
                    enemy.enemySpriteRefresh(battle, enemy.enemyXpos, enemy.enemyYpos);
                    battle.sleep(2);
                }
                
            }
            else if(battle_command.equals("MAGIC")) {
                for (int i = 0; i < hilda.hildaMagicList.size(); i++) {
                    System.out.println(hilda.hildaMagicList.get(i) + " :  " + hilda.hildaMagicListType.get(i));
                }
                System.out.println("\n" + "Who would you like to call on? ");
                String summon_input = battle_input.nextLine();
                System.out.println("\n\n\n\n\n");
                hilda.hildaMagicAttack(summon_input, enemy, battle_random);
                if (escape_menu.equals("ESCAPE")) {
                    continue;
                }
            }
            else if(battle_command.equals("ITEMS")) {
                escape_menu = hilda.hildaItems(battle_input);
                if (escape_menu.equals("ESCAPE")) {
                    continue;
                }
            }
            else if(battle_command.equals("FLEE")) {
                fleed = hilda.hildaFlee(battle_random);
                if (fleed == true) {
                    break;
                }
                else {
                    //continue;
                }
            }
            else {
                if (battle_command.equals("ADMIN ESC")) {
                    fleed = true;
                    break;
                }
                System.out.println("Error.");
                continue;
            }
            //Enemy attack
            
            for (int i = 0; i < 300; i++) {
                enemy.enemySpriteWhiteRefresh(battle, enemy.enemyXpos, enemy.enemyYpos);
                enemy.enemyXpos += 3;
                hilda.hildaSpriteRefresh(battle, hilda.hildaXpos, hilda.hildaYpos);
                enemy.enemySpriteRefresh(battle, enemy.enemyXpos, enemy.enemyYpos);
                battle.sleep(2);
            }
            
            enemy.enemyAttack(hilda, battle_random);
            
            for (int i = 0; i < 300; i++) {
                enemy.enemySpriteWhiteRefresh(battle, enemy.enemyXpos, enemy.enemyYpos);
                enemy.enemyXpos -= 3;
                hilda.hildaSpriteRefresh(battle, hilda.hildaXpos, hilda.hildaYpos);
                enemy.enemySpriteRefresh(battle, enemy.enemyXpos, enemy.enemyYpos);
                battle.sleep(2);
            }
            
        }
        //close window
        battle.setVisible(false);
    }
}
