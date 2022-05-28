public class Bank {
public float getInterestRate() {
  return 0.08F;
}
  public static void main(String[] args) {
    Bank bank = new Bank();
    System.out.println(bank.getInterestRate());
    SBI sbi = new SBI();
    System.out.println(sbi.getInterestRate());
    ICICI icici = new ICICI();
    System.out.println(icici.getInterestRate());
  }
}
/**
 * SBI
 */
class SBI extends Bank {

  public float getInterestRate() {
    return 0.07F;
  }
}

/**
 * ICICI
 */
class ICICI extends Bank {

  public float getInterestRate() {
    return 0.09F;
  }
}

