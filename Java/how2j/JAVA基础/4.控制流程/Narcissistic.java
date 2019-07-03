public class Narcissistic {
    public static void main(String[] args) {
        int hundred, decade, unit, summ;
        for(int i=100;i<1000;i++) {
            hundred = (int)i / 100;
            decade = (int)(i / 10) % 10;
            unit = i % 10;

            summ = (int)(Math.pow(unit, 3) + Math.pow(decade, 3) + Math.pow(hundred, 3));
            if(summ == i)
                System.out.println(summ);
        }
    }
}