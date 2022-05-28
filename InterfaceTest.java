public class InterfaceTest implements Animal {

  public void eat() {
    System.out.println("yum!");
  }
  public void travel() {
    System.out.println("chug, chug!");
  }
  public static void main(String[] args) {
    InterfaceTest i = new InterfaceTest();
    i.eat();
    i.travel();
    System.out.println(Animal.num);
  }
}

interface Animal {
  final int num = 5;
  void eat();
  void travel();

}
