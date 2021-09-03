import javax.swing.JOptionPane;
import java.util.Scanner;

public class Sales {

    /*Write a program, using dialog boxes, which prompts the user to enter a quantity, price, discount(as an integer) and sales tax(as an integer).
    The program should output the subtotal, tax total and total cost. Output should have proper currency format and proper rounding.

    Hint: You can use \n inside a String literal to make a new line, helpful for the dialog box output.

    Example:

    What is the sale price?: 4.99
    What is the discount?: 10
    How many are you buying?: 5
    What is the sales tax?: 7

    Subtotal: $22.46
    Tax Total: $1.57
    Total Cost: $24.03
     */
    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);

        String priceBox = JOptionPane.showInputDialog("Please enter the price");
        double price = Double.parseDouble(priceBox);

        String discountBox = JOptionPane.showInputDialog("What is the amount of the discount (Dont add %)");
        double discount = Double.parseDouble(discountBox);

        String amountBox = JOptionPane.showInputDialog("How many are you getting?");
        int amount = Integer.parseInt(amountBox);

        String taxBox = JOptionPane.showInputDialog("What is your states sales Tax(enter as a whole number, no % or Decimals)");
        double tax = Double.parseDouble(taxBox);

        // magic number is so it changes to a decimal ezly(Please dont hurt me)
        double discountDeci = discount * .01;
        double taxDeci = tax * .01;
        double priceAfterDis = price * discountDeci;
        double subTotal = priceAfterDis * amount;
        double taxTotal = taxDeci * subTotal;
        double total = subTotal + taxTotal;
        JOptionPane.showMessageDialog(null, "Subtotal: " + subTotal +"\n" + "Tax total: " + taxTotal + "\n" + "Total: " + total);




    }
}
