public class Hero {
    String name;

    private Hero() {
        name = "英雄";
    }

    private static Hero instance = new Hero();

    public static Hero getinstance() {
        return instance;
    }

    public void print() {
        System.out.println("name:" + name);
    }
}