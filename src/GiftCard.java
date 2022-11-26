/**
 * GiftCard.java
 * CSS142
 *
 * Skeleton file for a basic giftcard class; useful to set, report, and
 * manage deductions
 *
 *
 */

public class GiftCard {
    //todo: class-level instance variables go here
    private double balance;

    // Constructor
    public GiftCard(double... bal) {
        if(bal.length == 1.0){
            balance = bal[0];
        } else if (bal.length != 0) {
            System.out.println("GiftCard obj created with incorrect number of params");
        } else {
            balance = 0;
        }
    }

    //an example method that needs instance data to be declared first
    public void resetToZero() {
        balance = 0;
        System.out.println("resetter to zero: " + balance + "\n");
    }

    //sets balance to specified parameter
    public void setBalance(double num){
        if(num < 0){
            System.out.println("You cannot go into debt!");
        } else {
            balance = num;
            System.out.println("Balance has been set to: " + balance);
        }
    }

    //subtracts specified amount from the balance
    public void deduct(double num){
        if(num < 0){
            System.out.println("Cannot deduct negative amount of money!");
        } else if ((balance - num) < 0){
            System.out.println("Amount to deduct is greater than account balance!");
        } else {
            balance -= num;
        }
    }

    //prints out current balance
    public void report(){
        System.out.println(balance);
    }

    public static void main(String[] args) {
        GiftCard card1 = new GiftCard();

        card1.setBalance(50);

        System.out.print("card1 value is :");
        card1.report();

        GiftCard card2 = new GiftCard();

        card2.setBalance(100);
        System.out.print("card2 value is :");
        card2.report();

        card2.deduct(101);
        System.out.println(" After attempting to deduct $101, card2's new balance is :");
        card2.report();

        card1.deduct(12.50);
        System.out.println(" After attempting to deduct $12.50, card1's new balance is :");
        card1.report();

        card1.resetToZero();
        card1.report();
        card2.resetToZero();
        card2.report();

        // User defined constructor
        GiftCard card3 = new GiftCard(5000);
        System.out.println("\nSetting the new balance to 7500.99 ");
        card3.setBalance(7500.99);
    }

}
