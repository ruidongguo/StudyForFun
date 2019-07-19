public class Cat extends Animal implements Pet {
    String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        this("");
    }

    @Override
    public void eat() {
        System.out.println("Cat正在进食");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    };

    @Override
    public String getName() {
        return name;
    };

    @Override
    public void play() {
        System.out.println("Cat"+name+"正在玩耍");
    };

    public static void main(String[] args) {
        Cat cat1 = new Cat("小白");
        cat1.play();
    }
}