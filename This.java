public class This {
  public static void main(String[] args) {
    Student2 s = new Student2();
    s.display();
  }
}

class Student2 {
  int num = 5;
  static String college = "Hopper";
  void display() {
    System.out.println("My college is: " + college);
  }

}