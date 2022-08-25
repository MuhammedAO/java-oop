package accessModifiers;

public class Modifiers {
     private int age;
     private String name;

     String defReturnName(String name){
         return name;
     }

    public String publicReturnName(String name){
        return name;
    }

    private String privReturnName(String name){
        return name;
    }

    public int getAge(int age) {
        return age;
    }

    public String getName(String name) {
        return privReturnName("Muhammed");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String setName(String name) {
        return this.name = privReturnName(name);
    }

    protected String procReturnName(String name){
        return  name;
    }

//    public Modifiers(int age, String name){
//        this.age = age;
//        this.name = name;
//    }

}
