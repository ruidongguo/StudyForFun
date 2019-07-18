public class Hero {
    String name;
    public void kill(Mortal m) {
        System.out.println(name+"放了R技能！");
        m.die();
    }
    public static void main(String[] args) {
        Hero garlen=new Hero();
        garlen.name="盖伦";
        ADHero Vn=new ADHero();
        Vn.name="薇恩";
        APHero Lux=new APHero();
        Lux.name="拉克丝";
        ADAPHero EZ=new ADAPHero();
        EZ.name="伊泽瑞尔";
        garlen.kill(Vn);
        garlen.kill(EZ);
        garlen.kill(Lux);
    }
}