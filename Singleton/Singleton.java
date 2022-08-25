package Singleton;

public class Singleton {
   String name;
    private  Singleton(String name) {
        this.name = name;
    }

    public static Singleton instance;

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton("toyota");
        }
        return instance;
    }
}
