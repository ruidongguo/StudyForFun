public class APHero extends Hero implements Mortal{
    String name;
    public void die() {
        System.out.println(name+"is died");
    }
}