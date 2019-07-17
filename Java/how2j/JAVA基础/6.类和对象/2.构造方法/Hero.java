public class Hero {
    public String name;
    protected float hp;
    public int armor;
    public int moveSpeed;

    public Hero(String heroname,float herohp,int heroarmor,int heromovespeed){
        name = heroname;
        hp = herohp;
        armor= heroarmor;
        moveSpeed =heromovespeed;
    }

    public static void main(String[] args) {
        Hero a = new Hero("garen",400,50,300);
    }
}
