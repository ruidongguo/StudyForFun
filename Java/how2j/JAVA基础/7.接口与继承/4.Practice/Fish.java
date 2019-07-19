public class Fish extends Animal implements Pet {
    String name;

    public Fish(String name) {
        super(0);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Cat正在进食");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void play() {
        System.out.println("Fish"+name+"正在玩耍");
    }

    @Override
    public void walk() {
        System.out.println("鱼不能走且没有腿");
    }

    public static void main(String[] args) {
        Fish fish1 = new Fish("smallfishhhhh");
        fish1.walk();
    }

}