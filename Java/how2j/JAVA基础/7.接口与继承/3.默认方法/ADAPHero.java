public class ADAPHero implements AD, AP {
    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }

    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    @Override
    public void attack() {
        AD.super.attack();
        AP.super.attack();
    }

    public static void main(String[] args) {
        ADAPHero adap = new ADAPHero();
        adap.attack();
    }
}