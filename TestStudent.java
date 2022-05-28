public class TestStudent {
  public static void main(String[] args) {
    Student student = new Student();
    student.setStudentName("Bryon Smith");
    System.out.println(student.getStudentName());

    student.setStudentId(1);
    System.out.println(student.getStudentId());

    student.setCollegeName("Austin College");
    System.out.println(student.getCollegeName());

    student.setAddress("500 American Lane, Austin, TX 75933");
    System.out.println(student.getAddress());
  }
}

class Student {
  private String studentName, collegeName, address;
  private int studentId;
  

  public void setStudentId(int id) {
    this.studentId = id;
  }
  public int getStudentId() {
    return studentId;
  }

  public void setStudentName(String name) {
    this.studentName = name;
  }
  public String getStudentName() {
    return this.studentName;
  }

  public void setCollegeName(String college) {
    this.collegeName = college;
  }
  public String getCollegeName() {
    return collegeName;
  }

  public void setAddress(String address) {
    this.address = address;
  }
  public String getAddress() {
    return address;
  }
}


