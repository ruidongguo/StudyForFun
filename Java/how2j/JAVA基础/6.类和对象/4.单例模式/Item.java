public class Item {
    String name;
    int price;

    private Item() {
        name = "物品";
        price = 10;
    }

    private static Item instance = new Item();

    public static Item getinstance() {
        return instance;
    }

    public void print() {
        System.out.println("name:" + name + ", price:" + price);
    }
}