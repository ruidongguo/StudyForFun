public class test {
     public static void main(String[] args) {
            HeroType heroType = HeroType.TANK;

            switch (heroType) {
            case TANK:
                System.out.println("坦克");
                break;
            case WIZARD:
                System.out.println("法师");
                break;
            case ASSIST:
                System.out.println("刺客");
                break;
            case PUSH:
                System.out.println("推进");
                break;
            }
        }
}
