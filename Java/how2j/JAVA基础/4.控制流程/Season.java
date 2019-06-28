import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        System.out.println("请输入月份:");
        Scanner s = new Scanner(System.in);

        int month = s.nextInt();
        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("当前月份是春天");
            case 4:
            case 5:
            case 6:
                System.out.println("当前月份是夏天");
            case 7:
            case 8:
            case 9:
                System.out.println("当前月份是秋天");
            case 10:
            case 11:
            case 12:
                System.out.println("当前月份是冬天");
        }
    }
}