package intrfc;


import java.util.Arrays;

abstract class HumanBeing implements Human  {
    @Override
 public String getName(String name){
      return name;
  }

    @Override
    public Integer getAge(int age) {
        return age;
    }

    @Override
    public String getNationality(String nationality) {
        return null;
    }

    @Override
    public String[] habits(String[] habits) {
        return habits;
    }

    @Override
    public String favTrait(String favTrait) {
        return favTrait;
    }
}

class Muhammed extends HumanBeing {

    String motherMaidenName(String mmName) {
        return mmName;
    }
  public static void main(String[] args) {
    Muhammed mo = new Muhammed();
    String[] h = {"likes to party", "loves to read"};
//    System.out.println(Arrays.toString(h));
    System.out.println(Arrays.toString(mo.habits(h)));
//    System.out.println(mo.motherMaidenName("Adebimpe"));
  }
}

class H {

}
