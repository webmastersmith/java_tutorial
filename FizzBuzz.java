import java.util.Scanner;

public class FizzBuzz {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number: ");
    int num = sc.nextInt(10);
    if (num % 3 == 0 && num % 5 == 0)
      System.out.println("FizzBuzz");
    else if (num % 5 == 0)
      System.out.println("Fizz");
    else if (num % 3 == 0)
      System.out.println("Buzz");
    else
      System.out.println(num);
  }

}
