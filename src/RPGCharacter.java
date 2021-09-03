import java.util.Scanner;


public class RPGCharacter {

    /*Create a program that calculates an RPG Character's battle stats based on the character's physical stats.
    The physical and battle stat can be anything you wish provided it meets these criteria:

        The physical stats (Strength, Dexterity, Spirit etc ...) will be entered by the user
        The battle stats (damage, armor, mana capacity, spell strength ...) will be calculated based on the physical stats.

     We will continue to expand on this program throughout the year, so give it some thought. There should be some complexity.

     The program should run using dialog boxes and the output should show ALL the character's stats including a name.
     */

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);


        int strength;
        int dexterity;
        int charisma;
        int intelligence;
        int constitution;
        int wisdom;
        String charcter;

        System.out.println("Pick you skill numbers between 1-20.");

        //Name
        System.out.println("Type your character's name");
        charcter = read.next();

        //Strength states
        System.out.println("Type your strength state");
        strength = read.nextInt();

        //Dexterity states
        System.out.println("Type your dexterity state");
        dexterity = read.nextInt();

        //Charisma states
        System.out.println("Type your charisma state");
        charisma = read.nextInt();

        //Intelligence states
        System.out.println("Type your intelligence state");
        intelligence = read.nextInt();

        //Constitution states
        System.out.println("Type your constitution state");
        constitution = read.nextInt();

        //Wisdom states
        System.out.println("Type your wisdom state");
        wisdom = read.nextInt();


        System.out.println("Hello "  + charcter + " you have chosen:");
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Charisma: " + charisma);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Constitution: " + constitution);
        System.out.println("Wisdom: " + wisdom);
    }
}
