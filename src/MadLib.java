import java.util.Scanner;


public class MadLib {

    /*Create your own MadLibs. (https://www.madtakes.com/) You may use a story or example from the
    website if you don't wish to make up your own. This program must run entirely in the console.
     */

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
    String adjective;
    String noun;
    String animal;
    String noise;

        System.out.println("Type an adjective");
        adjective = read.next();

        System.out.println("Type a noun");
        noun = read.next();

        System.out.println("Type an animal name");
        animal = read.next();

        System.out.println("Type a noise");
        noise = read.next();

        System.out.println( adjective + "Macdonald had a " + noun + ", E-I-E-I-O and on that " + noun + " he had an " + animal + ", E-I-E-I-O with a " + noise + " " + noise + " here and a  + noise " + noise + " " + noise + " there, here a " + noise + ", there a " + noise + ", everywhere a " + noise + " " + noise + ", " +adjective + " Macdonald had a " + noun + ", E-I-E-I-O. ");
    }
}