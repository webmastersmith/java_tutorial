public class BankPractice {
  public static void main(String[] args) {
    SBI1 sbi = new SBI1();
    PNB1 pnb = new PNB1();

    sbi.getRateOfInterest();
    pnb.getRateOfInterest();
  }
}

abstract class Bank3 {
  abstract void getRateOfInterest();
}

class SBI1 extends Bank3 {
  public void getRateOfInterest() {
    System.out.println("7%");
  }
}
class PNB1 extends Bank3 {
 public void getRateOfInterest() {
    System.out.println("5%");
  }
}