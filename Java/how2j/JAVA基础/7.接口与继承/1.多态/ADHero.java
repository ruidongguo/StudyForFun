public class ADHero extends Hero implements Mortal{
    String name;
    public void die() {
        System.err.println(name+"is died!");
    }
}