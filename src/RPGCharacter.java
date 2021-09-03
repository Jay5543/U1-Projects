import java.sql.SQLOutput;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class RPGCharacter {

    /*Create a program that calculates an RPG Character's battle stats based on the character's physical stats.
    The physical and battle stat can be anything you wish provided it meets these criteria:

        The physical stats (Strength, Dexterity, Spirit etc ...) will be entered by the user
        The battle stats (damage, armor, mana capacity, spell strength ...) will be calculated based on the physical stats.

     We will continue to expand on this program throughout the year, so give it some thought. There should be some complexity.

     The program should run using dialog boxes and the output should show ALL the character's stats including a name.
     */

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String playersName;
        String playersRace;


        JOptionPane.showMessageDialog(null, "Welcome to your very own RPG character creator");
        JOptionPane.showMessageDialog(null,"Here you will do everything from making your own Stats to creating your own back story");
        JOptionPane.showMessageDialog(null, "This program is still under construction back story creator is not ready. COMING SOON \n");

        JOptionPane.showMessageDialog(null, "Firstly lets start of with our names. My name is Kami. Whats yours \n");
        playersName = JOptionPane.showInputDialog("Please enter your name:)");
        JOptionPane.showMessageDialog(null, "Hello " + playersName + " now what is your desired race (Please pick something from a fantasy world) press ok to move on");
        playersRace = JOptionPane.showInputDialog("Please enter your race");
        /*if (playersRace == "Human") {
            System.out.println("So your " + playersName + " and is a " + playersRace);
            System.out.println("Your stats are");
            System.out.println("STR = 10");
            System.out.println("INT = 20");
            System.out.println("VIT = 100");
            System.out.println("AGI = 15");
            System.out.println("DEX = 10");

        }else{
            System.out.println("So your " + playersName + " and is a " + playersRace);
            System.out.println("Your stats are");
            System.out.println("STR = 15");
            System.out.println("INT = 25");
            System.out.println("VIT = 500");
            System.out.println("AGI = 10");
            System.out.println("DEX = 50");
        }*/

        JOptionPane.showMessageDialog(null, "So your " + playersName + " your a " + playersRace + "\n");
        JOptionPane.showMessageDialog(null, "Your stats are\n" + "STR = 10\n" + "INT = 20\n" + "VIT = 100\n" + "AGI = 15\n" + "AGI = 15\n");

        JOptionPane.showMessageDialog(null, "Your a " + playersRace + ". We only have human weapons right now so if you like them...Nice...If not then boo hoo:(\n");
        JOptionPane.showMessageDialog(null, "Armor\n" + "+10\n " + "\n" + "Boots\n" + "+5 AGI" + "\n" + "Sword\n" + "+10 STR\n" + "\n" + "Thats all I have for you no go and do...\n" + "What ever you want I guess" );







    }
}
