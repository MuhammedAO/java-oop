public class Main {
  //    a static method is a method that belongs to a class rather than an instance of a class.
  public static void main(String[] args) {
    int age = 34;
    String[] names = {
      "hello world", "Welcome",
    };
    String testStr = "Benson";
    //        System.out.println( name[0]);
//    System.out.println(testStr);

//    for (String name : names) {
//      System.out.println(name);
//    }

    Car carOne = new Car("toyota", "2018", false);
//    Singleton.Singleton sing = Singleton.Singleton.getInstance();
//    Singleton.Singleton sing1 = Singleton.Singleton.getInstance();
//    Singleton.Singleton sing2 = Singleton.Singleton.getInstance();
//    System.out.println(sing.name);
//    System.out.println(sing1.name);
//    System.out.println(sing2.name);
  }


  static class Car {
    String maker;
    String yearOfMaker;
    boolean isConvertible;

    private Car(String maker, String yearOfMaker, boolean isConvertible) {
      this.maker = maker;
      this.yearOfMaker = yearOfMaker;
      this.isConvertible = isConvertible;
    }
  }

}
