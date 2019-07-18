public class Test {
    public static void main(String[] args) {
        Hero hero = Hero.getinstance();
        hero.print();

        Item item = Item.getinstance();
        item.print();
    }
}