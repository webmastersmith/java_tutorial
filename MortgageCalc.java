import java.text.NumberFormat;
import java.util.Scanner;

// Simple Mortgage calc. Returns monthly payment.
public class MortgageCalc {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    final byte MONTH_IN_YEAR = 12;
    final byte PERCENT = 100;

    int principal = 0;
    float monthlyInterestRate = 0;
    byte years = 0;
    int numberOfPayments = 0;

    while (true) {
      System.out.print("Principal (1k - 1M): ");
      principal = sc.nextInt();
      if (principal >= 1000 && principal <= 1_000_000)
        break;
      System.out.println("Please enter a number between 1,000 and 1,000,000");
    }

    while (true) {
      System.out.print("Annual Interest Rate: ");
      float annualInterest = sc.nextFloat();
      if (annualInterest > 0 && annualInterest <= 30) {
        monthlyInterestRate = annualInterest / PERCENT / MONTH_IN_YEAR;
        break;
      }
      System.out.println("Enter a value greater than 0 and less than 30");

    }

    while (true) {
      System.out.print("Period (Years): ");
      years = sc.nextByte();
      if (years > 0 && years <= 30) {
        numberOfPayments = years * MONTH_IN_YEAR;
        break;
      } else {
        System.out.println("Enter number greater than 0 and less than 30");
      }
    }

    double mortgage = principal 
        * (monthlyInterestRate * Math.pow((1 + monthlyInterestRate), numberOfPayments))
        / (Math.pow((1 + monthlyInterestRate), numberOfPayments) - 1);

    System.out.println("Mortgage Payment is: " + NumberFormat.getCurrencyInstance().format(mortgage));
  }
}
