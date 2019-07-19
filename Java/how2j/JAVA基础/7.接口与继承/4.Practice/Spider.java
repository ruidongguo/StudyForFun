public class Spider extends Animal {
    public Spider(int legs) {
        super(legs);
    }

    @Override
    public void eat() {
        System.out.println("Spider正在进食");
    }

    public static void main(String[] args) {
        Spider spider1 = new Spider(8);
        spider1.eat();
    }
}