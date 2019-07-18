public class ADAPHero extends ADHero {
    String name = "ADAP英雄";

    public void getName(){
        System.out.println(this.name);
    }

    public void getName2(){
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        ADAPHero h = new ADAPHero();
        h.getName();
        h.getName2();
    }
}