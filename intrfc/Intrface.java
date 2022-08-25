package intrfc;

interface Human extends Habits, FavoriteTraits {

    String getName(String name);
    Integer getAge(int age);
    String getNationality(String nationality);

    default void testDefaultCall(){

    }
    //static methods in an interface must have a body
    static void st() {

    }
}
