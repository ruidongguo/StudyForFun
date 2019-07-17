public class Armor extends Item {
    int level;

    public static void main(String[] args) {
        Armor clothArmor = new Armor();
        clothArmor.level = 15;
        clothArmor.name = "布甲";
        clothArmor.price = 300;

        Armor hauberk = new Armor();
        hauberk.level = 40;
        hauberk.name = "锁子甲";
        hauberk.price = 500;
    }
}