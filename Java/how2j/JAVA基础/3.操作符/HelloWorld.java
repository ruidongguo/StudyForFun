import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        System.out.println("整数为"+a);

        float b = s.nextFloat();
        System.out.println("浮点数为"+b);

        /*
        如果在通过nextInt()读取了整数后，
        再接着读取字符串，
        读出来的是回车换行:"\r\n",
        因为nextInt仅仅读取数字信息，
        而不会读取回车换行"\r\n".
        */
        String rn = s.nextLine();
        String c = s.nextLine();
        System.out.println("字符串为"+c);
    }
}