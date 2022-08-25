package abstractJava;

import accessModifiers.Modifiers;

public abstract class Human {
    public abstract String getName(String name);

    public abstract  boolean isHuman(boolean human);

  public static void main(String[] args) {
    Mo muhammed = new Mo();

//      Modifiers newMode = new Modifiers();
//      System.out.println(newMode.publicReturnName("Mhd"));

    System.out.println(muhammed.getName("Mhd444"));
    System.out.println(muhammed.isHuman(true));
  }


}



