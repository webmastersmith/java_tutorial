


public class CheckVariableInheritance {
  public static void main(String[] args) {
    Num num = new Num();
    num.showNum();
    NumCheck numcheck = new NumCheck();
    numcheck.showNum();

  }
}

class Num extends CheckVariableInheritance {
  public int num = 4;
  public void showNum() {
    System.out.println(num);
  }
  
}

class NumCheck extends Num {
  public int num = 8;
public void showNum() {
  System.out.println(num);
}
}


