/**
 * TestBank
 */
public class TestBank {
  public static void main(String[] args) {
    SBI sbi = new SBI();
    System.out.println(sbi.getRateOfInterest());

    PNB pnb = new PNB();
    System.out.println(pnb.getRateOfInterest());
  }
}

abstract class Bank {
  public abstract float getRateOfInterest();
}

/**
 * SBI
 */
class SBI extends Bank {

  public float getRateOfInterest() {
    // System.out.println(0.07F);
    return 0.07F;
  }
}

/**
 * PNB
 */
class PNB extends Bank {

  public float getRateOfInterest() {
    // System.out.println(0.05F);
    return 0.05F;
  }
}
