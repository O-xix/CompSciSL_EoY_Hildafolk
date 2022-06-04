
import java.awt.*;
import java.io.*;
import java.lang.*;
import java.net.*;
import java.util.*;
import javax.imageio.*;
import javax.swing.*;
/**
 * Write a description of class Hilda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hilda {
    //Stats and other variables:
    String hildaName = "Hilda";
    int hildaXpos = 1000;
    int hildaYpos = 405;
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
    int hildaIceAff = 100;
    int hildaLightningAff;
    int hildaEarthAff;
    int hildaWindAff;
    int hildaWaterAff = 100;
    int hildaDarkAff;
    int hildaGravityAff;
    int hildaDrainAff;
    //lists:
    ArrayList<String> hildaItemList = new ArrayList<String>(); 
    ArrayList<Integer> hildaItemListQuantity = new ArrayList<Integer>();
    ArrayList<String> hildaMagicList = new ArrayList<String>();
    ArrayList<String> hildaMagicListType = new ArrayList<String>();
    //set item list and magic list
    public void hildaSpriteRefresh(DrawingPanel panel, int hildaXPos, int hildaYPos) {
        Graphics hilda = panel.getGraphics();
        //Making the sprite:
        //g.setColor(new Color(0, 0, 0)); RGB Coloring
        //g.fillRect(x, y, width, height);
        //hilda.setColor(new Color(255, 255, 255));
        //hilda.fillRect(720, 405, 1440, 810);
            //Black portion of the sprite:
        hilda.setColor(new Color(0, 0, 0));
                //Column 0 of Sprite (x = 0)
        hilda.fillRect(0 + hildaXPos, 70 + hildaYPos, 5, 5);
        hilda.fillRect(0 + hildaXPos, 75 + hildaYPos, 5, 5);
                //Column 1 of Sprite (x = 5)
        hilda.fillRect(5 + hildaXPos, 10 + hildaYPos, 5, 5);
        hilda.fillRect(5 + hildaXPos, 15 + hildaYPos, 5, 5);
        hilda.fillRect(5 + hildaXPos, 20 + hildaYPos, 5, 5);
        hilda.fillRect(5 + hildaXPos, 50 + hildaYPos, 5, 5);
        hilda.fillRect(5 + hildaXPos, 65 + hildaYPos, 5, 5);
        hilda.fillRect(5 + hildaXPos, 80 + hildaYPos, 5, 5);
                //Column 2 of Sprite (x = 10)
        hilda.fillRect(10 + hildaXPos, 5 + hildaYPos, 5, 5);
        hilda.fillRect(10 + hildaXPos, 25 + hildaYPos, 5, 5);
        hilda.fillRect(10 + hildaXPos, 30 + hildaYPos, 5, 5);
        hilda.fillRect(10 + hildaXPos, 35 + hildaYPos, 5, 5);
        hilda.fillRect(10 + hildaXPos, 40 + hildaYPos, 5, 5);
        hilda.fillRect(10 + hildaXPos, 45 + hildaYPos, 5, 5);
        hilda.fillRect(10 + hildaXPos, 55 + hildaYPos, 5, 5);
        hilda.fillRect(10 + hildaXPos, 60 + hildaYPos, 5, 5);
        hilda.fillRect(10 + hildaXPos, 65 + hildaYPos, 5, 5);
        hilda.fillRect(10 + hildaXPos, 80 + hildaYPos, 5, 5);
                //Column 3 of Sprite (x = 15)
        hilda.fillRect(15 + hildaXPos, 5 + hildaYPos, 5, 5);
        hilda.fillRect(15 + hildaXPos, 50 + hildaYPos, 5, 5);
        hilda.fillRect(15 + hildaXPos, 70 + hildaYPos, 5, 5);
        hilda.fillRect(15 + hildaXPos, 75 + hildaYPos, 5, 5);
        hilda.fillRect(15 + hildaXPos, 80 + hildaYPos, 5, 5);
        hilda.fillRect(15 + hildaXPos, 85 + hildaYPos, 5, 5);
        hilda.fillRect(15 + hildaXPos, 90 + hildaYPos, 5, 5);
        hilda.fillRect(15 + hildaXPos, 105 + hildaYPos, 5, 5);
        hilda.fillRect(15 + hildaXPos, 110 + hildaYPos, 5, 5);
                //Column 4 of Sprite (x = 20)
        hilda.fillRect(20 + hildaXPos, 0 + hildaYPos, 5, 5);
        hilda.fillRect(20 + hildaXPos, 25 + hildaYPos, 5, 5);
        hilda.fillRect(20 + hildaXPos, 55 + hildaYPos, 5, 5);
        hilda.fillRect(20 + hildaXPos, 95 + hildaYPos, 5, 5);
        hilda.fillRect(20 + hildaXPos, 100 + hildaYPos, 5, 5);
        hilda.fillRect(20 + hildaXPos, 110 + hildaYPos, 5, 5);
                //Column 5 of Sprite (x = 25)
        hilda.fillRect(25 + hildaXPos, 0 + hildaYPos, 5, 5);
        hilda.fillRect(25 + hildaXPos, 30 + hildaYPos, 5, 5);
        hilda.fillRect(25 + hildaXPos, 95 + hildaYPos, 5, 5);
        hilda.fillRect(25 + hildaXPos, 110 + hildaYPos, 5, 5);
        hilda.fillRect(25 + hildaXPos, 115 + hildaYPos, 5, 5);
                //Column 6 of Sprite (x = 30)
        hilda.fillRect(30 + hildaXPos, 0 + hildaYPos, 5, 5);
        hilda.fillRect(30 + hildaXPos, 70 + hildaYPos, 5, 5);
        hilda.fillRect(30 + hildaXPos, 75 + hildaYPos, 5, 5);
        hilda.fillRect(30 + hildaXPos, 95 + hildaYPos, 5, 5);
        hilda.fillRect(30 + hildaXPos, 100 + hildaYPos, 5, 5);
        hilda.fillRect(30 + hildaXPos, 105 + hildaYPos, 5, 5);
        hilda.fillRect(30 + hildaXPos, 115 + hildaYPos, 5, 5);
                //Column 7 of Sprite (x = 35)
        hilda.fillRect(35 + hildaXPos, 0 + hildaYPos, 5, 5);
        hilda.fillRect(35 + hildaXPos, 35 + hildaYPos, 5, 5);
        hilda.fillRect(35 + hildaXPos, 50 + hildaYPos, 5, 5);
        hilda.fillRect(35 + hildaXPos, 65 + hildaYPos, 5, 5);
        hilda.fillRect(35 + hildaXPos, 80 + hildaYPos, 5, 5);
        hilda.fillRect(35 + hildaXPos, 95 + hildaYPos, 5, 5);
        hilda.fillRect(35 + hildaXPos, 115 + hildaYPos, 5, 5);
                //Column 8 of Sprite (x = 40)
        hilda.fillRect(40 + hildaXPos, 0 + hildaYPos, 5, 5);
        hilda.fillRect(40 + hildaXPos, 40 + hildaYPos, 5, 5);
        hilda.fillRect(40 + hildaXPos, 45 + hildaYPos, 5, 5);
        hilda.fillRect(40 + hildaXPos, 65 + hildaYPos, 5, 5);
        hilda.fillRect(40 + hildaXPos, 80 + hildaYPos, 5, 5);
        hilda.fillRect(40 + hildaXPos, 115 + hildaYPos, 5, 5);
                //Column 9 of Sprite (x = 45)
        hilda.fillRect(45 + hildaXPos, 0 + hildaYPos, 5, 5);
        hilda.fillRect(45 + hildaXPos, 45 + hildaYPos, 5, 5);
        hilda.fillRect(45 + hildaXPos, 50 + hildaYPos, 5, 5);
        hilda.fillRect(45 + hildaXPos, 70 + hildaYPos, 5, 5);
        hilda.fillRect(45 + hildaXPos, 80 + hildaYPos, 5, 5);
        hilda.fillRect(45 + hildaXPos, 95 + hildaYPos, 5, 5);
        hilda.fillRect(45 + hildaXPos, 115 + hildaYPos, 5, 5);
                //Column 10 of Sprite (x = 50)
        hilda.fillRect(50 + hildaXPos, 5 + hildaYPos, 5, 5);
        hilda.fillRect(50 + hildaXPos, 50 + hildaYPos, 5, 5);
        hilda.fillRect(50 + hildaXPos, 80 + hildaYPos, 5, 5);
        hilda.fillRect(50 + hildaXPos, 95 + hildaYPos, 5, 5);
        hilda.fillRect(50 + hildaXPos, 115 + hildaYPos, 5, 5);
                //Column 11 of Sprite (x = 55)
        hilda.fillRect(55 + hildaXPos, 10 + hildaYPos, 5, 5);
        hilda.fillRect(55 + hildaXPos, 15 + hildaYPos, 5, 5);
        hilda.fillRect(55 + hildaXPos, 40 + hildaYPos, 5, 5);
        hilda.fillRect(55 + hildaXPos, 55 + hildaYPos, 5, 5);
        hilda.fillRect(55 + hildaXPos, 75 + hildaYPos, 5, 5);
        hilda.fillRect(55 + hildaXPos, 85 + hildaYPos, 5, 5);
        hilda.fillRect(55 + hildaXPos, 90 + hildaYPos, 5, 5);
        hilda.fillRect(55 + hildaXPos, 100 + hildaYPos, 5, 5);
        hilda.fillRect(55 + hildaXPos, 105 + hildaYPos, 5, 5);
        hilda.fillRect(55 + hildaXPos, 110 + hildaYPos, 5, 5);
        hilda.fillRect(55 + hildaXPos, 115 + hildaYPos, 5, 5);
                //Column 12 of Sprite (x = 60)
        hilda.fillRect(60 + hildaXPos, 20 + hildaYPos, 5, 5);
        hilda.fillRect(60 + hildaXPos, 25 + hildaYPos, 5, 5);
        hilda.fillRect(60 + hildaXPos, 30 + hildaYPos, 5, 5);
        hilda.fillRect(60 + hildaXPos, 40 + hildaYPos, 5, 5);
        hilda.fillRect(60 + hildaXPos, 55 + hildaYPos, 5, 5);
        hilda.fillRect(60 + hildaXPos, 60 + hildaYPos, 5, 5);
        hilda.fillRect(60 + hildaXPos, 65 + hildaYPos, 5, 5);
        hilda.fillRect(60 + hildaXPos, 70 + hildaYPos, 5, 5);
                //Column 13 & 14 of Sprite (x = 65 & x = 70)
        hilda.fillRect(65 + hildaXPos, 35 + hildaYPos, 5, 5);
        hilda.fillRect(65 + hildaXPos, 50 + hildaYPos, 5, 5);
        hilda.fillRect(70 + hildaXPos, 45 + hildaYPos, 5, 5);
            //Light yellow, by column
        hilda.setColor(new Color(253, 236, 166));
        hilda.fillRect(5 + hildaXPos, 70 + hildaYPos, 5, 5);
        hilda.fillRect(5 + hildaXPos, 75 + hildaYPos, 5, 5);
        hilda.fillRect(10 + hildaXPos, 70 + hildaYPos, 5, 5);
        hilda.fillRect(15 + hildaXPos, 25 + hildaYPos, 5, 5);
        hilda.fillRect(15 + hildaXPos, 30 + hildaYPos, 5, 5);
        hilda.fillRect(15 + hildaXPos, 35 + hildaYPos, 5, 5);
        hilda.fillRect(15 + hildaXPos, 40 + hildaYPos, 5, 5);
        hilda.fillRect(15 + hildaXPos, 45 + hildaYPos, 5, 5);
        hilda.fillRect(20 + hildaXPos, 45 + hildaYPos, 5, 5);
        hilda.fillRect(20 + hildaXPos, 50 + hildaYPos, 5, 5);
        hilda.fillRect(25 + hildaXPos, 45 + hildaYPos, 5, 5);
        hilda.fillRect(35 + hildaXPos, 40 + hildaYPos, 5, 5);
        hilda.fillRect(35 + hildaXPos, 70 + hildaYPos, 5, 5);
        hilda.fillRect(35 + hildaXPos, 75 + hildaYPos, 5, 5);
        hilda.fillRect(40 + hildaXPos, 70 + hildaYPos, 5, 5);
        hilda.fillRect(50 + hildaXPos, 65 + hildaYPos, 5, 5);
        hilda.fillRect(50 + hildaXPos, 70 + hildaYPos, 5, 5);
        hilda.fillRect(55 + hildaXPos, 65 + hildaYPos, 5, 5);
            //Light-grey yellow, by column
        hilda.setColor(new Color(245, 231, 173));
        hilda.fillRect(10 + hildaXPos, 75 + hildaYPos, 5, 5);
        hilda.fillRect(25 + hildaXPos, 50 + hildaYPos, 5, 5);
        hilda.fillRect(25 + hildaXPos, 55 + hildaYPos, 5, 5);
        hilda.fillRect(30 + hildaXPos, 50 + hildaYPos, 5, 5);
        hilda.fillRect(30 + hildaXPos, 55 + hildaYPos, 5, 5);
        hilda.fillRect(35 + hildaXPos, 45 + hildaYPos, 5, 5);
        hilda.fillRect(40 + hildaXPos, 75 + hildaYPos, 5, 5);
        hilda.fillRect(45 + hildaXPos, 65 + hildaYPos, 5, 5);
        hilda.fillRect(45 + hildaXPos, 75 + hildaYPos, 5, 5);
        hilda.fillRect(50 + hildaXPos, 75 + hildaYPos, 5, 5);
        hilda.fillRect(55 + hildaXPos, 70 + hildaYPos, 5, 5);
            //Red 1, by column
        hilda.setColor(new Color(236, 28, 36));
        hilda.fillRect(15 + hildaXPos, 60 + hildaYPos, 5, 5);
        hilda.fillRect(20 + hildaXPos, 65 + hildaYPos, 5, 5);
        hilda.fillRect(20 + hildaXPos, 85 + hildaYPos, 5, 5);
        hilda.fillRect(20 + hildaXPos, 105 + hildaYPos, 5, 5);
        hilda.fillRect(25 + hildaXPos, 60 + hildaYPos, 5, 5);
        hilda.fillRect(25 + hildaXPos, 70 + hildaYPos, 5, 5);
        hilda.fillRect(30 + hildaXPos, 65 + hildaYPos, 5, 5);
        hilda.fillRect(30 + hildaXPos, 110 + hildaYPos, 5, 5);
        hilda.fillRect(35 + hildaXPos, 60 + hildaYPos, 5, 5);
        hilda.fillRect(35 + hildaXPos, 100 + hildaYPos, 5, 5);
        hilda.fillRect(35 + hildaXPos, 110 + hildaYPos, 5, 5);
        hilda.fillRect(40 + hildaXPos, 55 + hildaYPos, 5, 5);
        hilda.fillRect(35 + hildaXPos, 85 + hildaYPos, 5, 5);
        hilda.fillRect(40 + hildaXPos, 100 + hildaYPos, 5, 5);
        hilda.fillRect(40 + hildaXPos, 110 + hildaYPos, 5, 5);
        hilda.fillRect(45 + hildaXPos, 85 + hildaYPos, 5, 5);
        hilda.fillRect(45 + hildaXPos, 100 + hildaYPos, 5, 5);
        hilda.fillRect(45 + hildaXPos, 105 + hildaYPos, 5, 5);
        hilda.fillRect(45 + hildaXPos, 110 + hildaYPos, 5, 5);
        hilda.fillRect(50 + hildaXPos, 110 + hildaYPos, 5, 5);
            //Red 2, by column
        hilda.setColor(new Color(136, 0, 27));
        hilda.fillRect(15 + hildaXPos, 55 + hildaYPos, 5, 5);
        hilda.fillRect(20 + hildaXPos, 60 + hildaYPos, 5, 5);
        hilda.fillRect(20 + hildaXPos, 70 + hildaYPos, 5, 5);
        hilda.fillRect(20 + hildaXPos, 80 + hildaYPos, 5, 5);
        hilda.fillRect(20 + hildaXPos, 90 + hildaYPos, 5, 5);
        hilda.fillRect(25 + hildaXPos, 65 + hildaYPos, 5, 5);
        hilda.fillRect(30 + hildaXPos, 60 + hildaYPos, 5, 5);
        hilda.fillRect(30 + hildaXPos, 80 + hildaYPos, 5, 5);
        hilda.fillRect(40 + hildaXPos, 90 + hildaYPos, 5, 5);
        hilda.fillRect(45 + hildaXPos, 60 + hildaYPos, 5, 5);
        hilda.fillRect(35 + hildaXPos, 100 + hildaYPos, 5, 5);
        hilda.fillRect(35 + hildaXPos, 110 + hildaYPos, 5, 5);
        hilda.fillRect(40 + hildaXPos, 55 + hildaYPos, 5, 5);
        hilda.fillRect(35 + hildaXPos, 85 + hildaYPos, 5, 5);
        hilda.fillRect(40 + hildaXPos, 100 + hildaYPos, 5, 5);
        hilda.fillRect(40 + hildaXPos, 110 + hildaYPos, 5, 5);
        hilda.fillRect(45 + hildaXPos, 85 + hildaYPos, 5, 5);
        hilda.fillRect(45 + hildaXPos, 100 + hildaYPos, 5, 5);
        hilda.fillRect(45 + hildaXPos, 105 + hildaYPos, 5, 5);
        hilda.fillRect(45 + hildaXPos, 110 + hildaYPos, 5, 5);
        hilda.fillRect(50 + hildaXPos, 110 + hildaYPos, 5, 5);
        hilda.fillRect(35 + hildaXPos, 55 + hildaYPos, 5, 5);
        hilda.fillRect(40 + hildaXPos, 50 + hildaYPos, 5, 5);
        hilda.fillRect(40 + hildaXPos, 90 + hildaYPos, 5, 5);
        hilda.fillRect(45 + hildaXPos, 90 + hildaYPos, 5, 5);
        hilda.fillRect(50 + hildaXPos, 85 + hildaYPos, 5, 5);
        hilda.fillRect(50 + hildaXPos, 90 + hildaYPos, 5, 5);
            //Red 3, by column
        hilda.setColor(new Color(243, 104, 109));
        hilda.fillRect(15 + hildaXPos, 65 + hildaYPos, 5, 5);
        hilda.fillRect(20 + hildaXPos, 75 + hildaYPos, 5, 5);
        hilda.fillRect(25 + hildaXPos, 75 + hildaYPos, 5, 5);
        hilda.fillRect(25 + hildaXPos, 85 + hildaYPos, 5, 5);
        hilda.fillRect(30 + hildaXPos, 85 + hildaYPos, 5, 5);
        hilda.fillRect(35 + hildaXPos, 85 + hildaYPos, 5, 5);
        hilda.fillRect(40 + hildaXPos, 60 + hildaYPos, 5, 5);
        hilda.fillRect(45 + hildaXPos, 60 + hildaYPos, 5, 5);
        hilda.fillRect(50 + hildaXPos, 55 + hildaYPos, 5, 5);
        hilda.fillRect(55 + hildaXPos, 60 + hildaYPos, 5, 5);
            //Red 4, by column
        hilda.setColor(new Color(169, 14, 19));
        hilda.fillRect(25 + hildaXPos, 90 + hildaYPos, 5, 5);
        hilda.fillRect(25 + hildaXPos, 100 + hildaYPos, 5, 5);
        hilda.fillRect(25 + hildaXPos, 105 + hildaYPos, 5, 5);
        hilda.fillRect(30 + hildaXPos, 90 + hildaYPos, 5, 5);
        hilda.fillRect(35 + hildaXPos, 90 + hildaYPos, 5, 5);
        hilda.fillRect(35 + hildaXPos, 105 + hildaYPos, 5, 5);
        hilda.fillRect(35 + hildaXPos, 105 + hildaYPos, 5, 5);
        hilda.fillRect(50 + hildaXPos, 100 + hildaYPos, 5, 5);
        hilda.fillRect(50 + hildaXPos, 105 + hildaYPos, 5, 5);
            //Red 4, by column
        hilda.setColor(new Color(255, 174, 200));
        hilda.fillRect(25 + hildaXPos, 80 + hildaYPos, 5, 5);
        hilda.fillRect(45 + hildaXPos, 55 + hildaYPos, 5, 5);
        hilda.fillRect(50 + hildaXPos, 60 + hildaYPos, 5, 5);
            //Gray, by column
        hilda.setColor(new Color(88, 88, 88));
        hilda.fillRect(20 + hildaXPos, 30 + hildaYPos, 5, 5);
        hilda.fillRect(20 + hildaXPos, 35 + hildaYPos, 5, 5);
        hilda.fillRect(20 + hildaXPos, 40 + hildaYPos, 5, 5);
            //Dark blue, by column
        hilda.setColor(new Color(63, 72, 204));
        hilda.fillRect(10 + hildaXPos, 10 + hildaYPos, 5, 5);
        hilda.fillRect(10 + hildaXPos, 20 + hildaYPos, 5, 5);
        hilda.fillRect(10 + hildaXPos, 50 + hildaYPos, 5, 5);
        hilda.fillRect(15 + hildaXPos, 15 + hildaYPos, 5, 5);
        hilda.fillRect(20 + hildaXPos, 5 + hildaYPos, 5, 5);
        hilda.fillRect(20 + hildaXPos, 20 + hildaYPos, 5, 5);
        hilda.fillRect(25 + hildaXPos, 5 + hildaYPos, 5, 5);
        hilda.fillRect(25 + hildaXPos, 25 + hildaYPos, 5, 5);
        hilda.fillRect(30 + hildaXPos, 10 + hildaYPos, 5, 5);
        hilda.fillRect(30 + hildaXPos, 40 + hildaYPos, 5, 5);
        hilda.fillRect(30 + hildaXPos, 45 + hildaYPos, 5, 5);
        hilda.fillRect(35 + hildaXPos, 15 + hildaYPos, 5, 5);
        hilda.fillRect(35 + hildaXPos, 20 + hildaYPos, 5, 5);
        hilda.fillRect(35 + hildaXPos, 30 + hildaYPos, 5, 5);
        hilda.fillRect(40 + hildaXPos, 25 + hildaYPos, 5, 5);
        hilda.fillRect(40 + hildaXPos, 30 + hildaYPos, 5, 5);
        hilda.fillRect(40 + hildaXPos, 35 + hildaYPos, 5, 5);
        hilda.fillRect(45 + hildaXPos, 20 + hildaYPos, 5, 5);
        hilda.fillRect(45 + hildaXPos, 25 + hildaYPos, 5, 5);
        hilda.fillRect(45 + hildaXPos, 40 + hildaYPos, 5, 5);
        hilda.fillRect(50 + hildaXPos, 30 + hildaYPos, 5, 5);
        hilda.fillRect(50 + hildaXPos, 35 + hildaYPos, 5, 5);
        hilda.fillRect(50 + hildaXPos, 45 + hildaYPos, 5, 5);
        hilda.fillRect(55 + hildaXPos, 20 + hildaYPos, 5, 5);
        hilda.fillRect(55 + hildaXPos, 35 + hildaYPos, 5, 5);
        hilda.fillRect(55 + hildaXPos, 50 + hildaYPos, 5, 5);
        hilda.fillRect(60 + hildaXPos, 35 + hildaYPos, 5, 5);
        hilda.fillRect(60 + hildaXPos, 50 + hildaYPos, 5, 5);
        hilda.fillRect(65 + hildaXPos, 45 + hildaYPos, 5, 5);
            //Turquiose, by column
        hilda.setColor(new Color(0, 168, 243));
        hilda.fillRect(10 + hildaXPos, 15 + hildaYPos, 5, 5);
        hilda.fillRect(15 + hildaXPos, 10 + hildaYPos, 5, 5);
        hilda.fillRect(15 + hildaXPos, 20 + hildaYPos, 5, 5);
        hilda.fillRect(20 + hildaXPos, 10 + hildaYPos, 5, 5);
        hilda.fillRect(20 + hildaXPos, 15 + hildaYPos, 5, 5);
        hilda.fillRect(25 + hildaXPos, 10 + hildaYPos, 5, 5);
        hilda.fillRect(25 + hildaXPos, 20 + hildaYPos, 5, 5);
        hilda.fillRect(30 + hildaXPos, 5 + hildaYPos, 5, 5);
        hilda.fillRect(30 + hildaXPos, 15 + hildaYPos, 5, 5);
        hilda.fillRect(30 + hildaXPos, 30 + hildaYPos, 5, 5);
        hilda.fillRect(30 + hildaXPos, 35 + hildaYPos, 5, 5);
        hilda.fillRect(35 + hildaXPos, 5 + hildaYPos, 5, 5);
        hilda.fillRect(35 + hildaXPos, 10 + hildaYPos, 5, 5);
        hilda.fillRect(35 + hildaXPos, 25 + hildaYPos, 5, 5);
        hilda.fillRect(40 + hildaXPos, 5 + hildaYPos, 5, 5);
        hilda.fillRect(40 + hildaXPos, 10 + hildaYPos, 5, 5);
        hilda.fillRect(40 + hildaXPos, 15 + hildaYPos, 5, 5);
        hilda.fillRect(40 + hildaXPos, 20 + hildaYPos, 5, 5);
        hilda.fillRect(45 + hildaXPos, 15 + hildaYPos, 5, 5);
        hilda.fillRect(45 + hildaXPos, 30 + hildaYPos, 5, 5);
        hilda.fillRect(45 + hildaXPos, 35 + hildaYPos, 5, 5);
        hilda.fillRect(50 + hildaXPos, 10 + hildaYPos, 5, 5);
        hilda.fillRect(50 + hildaXPos, 25 + hildaYPos, 5, 5);
        hilda.fillRect(50 + hildaXPos, 40 + hildaYPos, 5, 5);
        hilda.fillRect(55 + hildaXPos, 25 + hildaYPos, 5, 5);
        hilda.fillRect(55 + hildaXPos, 30 + hildaYPos, 5, 5);
        hilda.fillRect(55 + hildaXPos, 45 + hildaYPos, 5, 5);
        hilda.fillRect(60 + hildaXPos, 45 + hildaYPos, 5, 5);
            //Light blue, by column
        hilda.setColor(new Color(140, 255, 251));
        hilda.fillRect(25 + hildaXPos, 15 + hildaYPos, 5, 5);
        hilda.fillRect(30 + hildaXPos, 20 + hildaYPos, 5, 5);
        hilda.fillRect(30 + hildaXPos, 25 + hildaYPos, 5, 5);
        hilda.fillRect(45 + hildaXPos, 10 + hildaYPos, 5, 5);
        hilda.fillRect(50 + hildaXPos, 15 + hildaYPos, 5, 5);
        hilda.fillRect(50 + hildaXPos, 20 + hildaYPos, 5, 5);
    }
    public void hildaItemsGive() {
        //item list give
        hildaItemList.add(0, "Potion");
        hildaItemListQuantity.add(0, 5);
        hildaItemList.add(1, "Elixir");
        hildaItemListQuantity.add(1, 3);
        hildaItemList.add(2, "Hi-Potion");
        hildaItemListQuantity.add(2, 1);
        //magic list give
        hildaMagicList.add(0, "Lindworm");
        hildaMagicListType.add(0, "Fire");
        hildaMagicList.add(1, "Greela");
        hildaMagicListType.add(1, "Ice");
        hildaMagicList.add(2, "Kraken");
        hildaMagicListType.add(2, "Water");
    }
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
            if (hildaHP == 0) {
                System.out.println(hildaName + " lost her soul.");
                System.out.println(hildaName + "'s game is over.");
                System.exit(0);
            }
            else {
                //do nothing
            }
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
                found_summon = true;
                System.out.println(hildaName + " calls out to " + summon + "!");
                String magic_type = hildaMagicListType.get(hildaMagicList.indexOf(summon));
                int maybe_hit = battle_hit_limit.nextInt(101);
                if (maybe_hit <= hildaAccuracy) {
                    enemy.enemyTakeMagicAttack(magic_type, hildaStrength/2 + 5, battle_hit_limit, 0);
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
        int magic_affinity = 0;
        //find magic_affinity factor
        if(magic_type.equals("Fire")) {
            magic_affinity = hildaFireAff;
        }
        else if(magic_type.equals("Water")) {
            magic_affinity = hildaWaterAff;
        }
        else if(magic_type.equals("Ice")) {
            magic_affinity = hildaIceAff;
        }
        else {
            System.out.println("Error.");
        }
        //actual damage
        if (maybe_miss <= hildaEvasion) {
            hildaHP -= ((HPtaken * magic_affinity)/100);
            System.out.println("The " + hildaName + " loses " + ((HPtaken * magic_affinity)/100) + " health points! \n");
            if (hildaHP == 0) {
                System.out.println(hildaName + " lost her soul.");
                System.out.println(hildaName + "'s game is over.");
                System.exit(0);
            }
            else {
                //do nothing
            }
        }
        else {
            System.out.println("The " + hildaName + " dodges! \n");
        }
    }
    
    //ITEMS
    public String hildaItems(Scanner item_navi_input) {
        for (int i = 0; i < hildaItemList.size(); i++) {
            System.out.println(hildaItemList.get(i) + " :  " + hildaItemListQuantity.get(i));
        }
        System.out.println("\n" + "What item would you like to use? ");
        String item_input = item_navi_input.nextLine();
        int restoration_excess;
        if (item_input.equals("ESCAPE")) {
            return item_input;
        }
        else {
            for (int i = 0; i < hildaItemList.size(); i++) {
                if (hildaItemList.get(i).equals(item_input)) {
                    if(item_input.equals("Potion") && hildaItemListQuantity.get(i) > 0) {
                        restoration_excess = hildaHP + 75 - hildaMaxHP;
                        if (restoration_excess < 0) {
                            hildaHP += 75;
                            System.out.println(hildaName + " used a potion, and restored 75 health points.");
                        }
                        else {
                            hildaHP += (75 - restoration_excess);
                            System.out.println(hildaName + " used a potion, and restored " + (75 - restoration_excess) + " health points.");
                        }
                    }
                    else if(item_input.equals("Hi-Potion") && hildaItemListQuantity.get(i) > 0) {
                        restoration_excess = hildaHP + 125 - hildaMaxHP;
                        if (restoration_excess < 0) {
                            hildaHP += 125;
                            System.out.println(hildaName + " used a hi-potion, and restored 125 health points.");
                        }
                        else {
                            hildaHP += (125 - restoration_excess);
                            System.out.println(hildaName + " used a hi-potion, and restored " + (125 - restoration_excess) + " health points.");
                        }
                    }
                    else if(item_input.equals("Elixir") && hildaItemListQuantity.get(i) > 0) {
                        restoration_excess = hildaHP + 75 - hildaMaxHP;
                        if (restoration_excess < 0) {
                            hildaHP += 75;
                            System.out.println(hildaName + " used a elixir, and restored 150 health points.");
                        }
                        else {
                            hildaHP += (75 - restoration_excess);
                            System.out.println(hildaName + " used a elixir, and restored " + (150 - restoration_excess) + " health points.");
                        }
                    }
                    else {
                        System.out.println(hildaName + " couldn't find " + item_input + ".");
                    }
                }
            }
        }
        return "";
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
