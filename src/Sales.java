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

        int amount = 5;
        double price = 4.99;
        final double discount = 10.00;
        final double truediscount = discount / 100.00;
        final double tax = 7.0;
        final double taxrate = tax / 100.00;


        double subtotal = price * amount;
        double realpr = subtotal * truediscount;
        double total = realpr + taxrate;



        /*double subtotal = price * amount;
        double ttotal = subtotal / truediscount;
        double tototal =  subtotal - truediscount;
        double Tax = subtotal * taxrate;
        double total = tototal * (1 + taxrate);*/

        System.out.println(subtotal);
        System.out.println(taxrate);
        System.out.println(total);
    }
}
