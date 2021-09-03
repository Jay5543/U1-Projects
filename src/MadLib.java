import java.util.Scanner;
public class MadLib {

    /*Create your own MadLibs. (https://www.madtakes.com/) You may use a story or example from the
    website if you don't wish to make up your own. This program must run entirely in the console.
     */


    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Please enter a Noun");
        String noun1 = word.nextLine();

        System.out.println("Please enter a Noun(Plural)");
        String nounPlural = word.nextLine();

        System.out.println("Please enter a Noun");
        String noun2 = word.nextLine();

        System.out.println("Please enter a Place");
        String place = word.nextLine();

        System.out.println("Please enter a Adjective");
        String adjective = word.nextLine();

        System.out.println("Please enter a Noun");
        String noun3 = word.nextLine();

        System.out.println("Your story said's");
        System.out.println("Be kind to your " + noun1 + " footed " + nounPlural + ". ");
        System.out.println("For a duck be somebody's " + noun2 + ",");
        System.out.println("Be kind to your " + nounPlural + " in " + place);
        System.out.println("Where the weather is always " + adjective);
        System.out.println("You may think that this is the " + noun3);
        System.out.println("Well it is");





    }
}