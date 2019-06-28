import java.util.Scanner;

public class Bmi {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入你的身高(m):");
        float height = s.nextFloat();

        System.out.println("请输入你的体重(kg):");
        float weight = s.nextFloat();

        float bmi = weight / (height * height);
        String status;

        if (bmi<18.5)
            status = "体重过轻";
        else if (bmi<24)
            status = "正常范围";
        else if (bmi<27)
            status = "体重过重";
        else if (bmi<30)
            status = "轻度肥胖";
        else if (bmi<35)
            status = "中度肥胖";
        else
            status = "重度肥胖";

        System.out.println("当前的BMI是："+bmi);
        System.out.println("身体状态是:"+status);
    }
}