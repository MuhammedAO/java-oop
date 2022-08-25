package inheritance;

public class Inheritance {

  public static void main(String[] args) {
    Child newChild = new Child(34, "nigerian", "2021-90-0", "mhd", true);
    GgChild newGGChild = new GgChild(34, "nigerian", "2021-90-0", "mhd", true, "ogunsanyas");
    System.out.println(newChild.name);
  }

  static class Human {
    int age;
    String nationality;
    String dob;

    Human(int age, String nationality, String dob) {
      this.age = age;
      this.nationality = nationality;
      this.dob = dob;
    }
  }

  static class Child extends Human {
    String name;
    boolean isHuman;

    Child(int age, String nationality, String dob, String name, boolean isHuman) {
      super(age, nationality, dob);
      this.name = name;
      this.isHuman = isHuman;
    }
  }

  static class GgChild extends Child {
    String nameOfParent;

    GgChild(
        int age,
        String nationality,
        String dob,
        String name,
        boolean isHuman,
        String nameOfParent) {
      super(age, nationality, dob, name, isHuman);
      this.nameOfParent = nameOfParent;
    }
  }
}
