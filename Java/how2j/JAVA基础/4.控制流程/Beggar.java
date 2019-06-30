public class Beggar {
    public static void main(String[] args) {
        int money_day, money_all = 0;

        for(int day=1;day<=10;day++) {
            money_day = (int)Math.pow(2, day-1);
            money_all += money_day;
            System.out.println("今天是第"+day+"天:赚了"+money_day+"，总共赚了"+money_all);
        }
    }
}