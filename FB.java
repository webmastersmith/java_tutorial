import java.util.Scanner;

public class FB {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number: ");
    int num = sc.nextInt();
    if (num % 3 == 0 && num % 5 == 0) {
      System.out.println("FizzBuzz");
    } else if (num % 5 == 0) {
      System.out.println("Fizz");
    } else if (num % 3 == 0) {
      System.out.println("Buzz");
    } else {
      System.out.println("No fizz or buzz: " + num);
    }
    sc.close();
  }
}
