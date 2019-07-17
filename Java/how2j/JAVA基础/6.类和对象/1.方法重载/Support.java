public class Support extends Hero {
    public void heal() {
        System.out.println(name + "释放一次群体治疗");
    }

    public void heal(Hero h) {
        System.out.println(name + "为"+ h.name + "加了一次血");
    }

    public void heal(Hero h, int hp) {
        System.out.println(name + "为" + h.name + "加了" + hp + "血");
    }

    public static void main(String[] args) {
        Support xiaoHei = new Support();
        xiaoHei.name = "黑暗游侠";

        Support houzi = new Support();
        houzi.name = "幻影长矛手";

        houzi.heal();
        houzi.heal(xiaoHei);
        houzi.heal(xiaoHei, 100);
    }
}