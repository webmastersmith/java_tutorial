import java.text.NumberFormat;
import java.util.Scanner;

// Simple Mortgage calc. Returns monthly payment.
public class MortgageCalc {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    final byte MONTH_IN_YEAR = 12;
    final byte PERCENT = 100;

    System.out.print("What is your Principal? ");
    int principal = sc.nextInt();

    System.out.print("What is your Annual Interest Rate? ");
    float annualInterest = sc.nextFloat();
    float monthlyInterestRate = annualInterest / PERCENT / MONTH_IN_YEAR;

    System.out.print("Period Years? ");
    byte years = sc.nextByte();
    int numberOfPayments = years * MONTH_IN_YEAR;

    double mortgage = principal * (monthlyInterestRate * Math.pow((1 + monthlyInterestRate), numberOfPayments))
        / (Math.pow((1 + monthlyInterestRate), numberOfPayments) - 1);

    System.out.println("Mortgage Payment is: " + NumberFormat.getCurrencyInstance().format(mortgage));
  }
}
