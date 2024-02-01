import java.util.Scanner;

public class FirstCase {
    public static void main(String[] args) {
        System.out.println("请输入购买苹果的数量");
        Scanner sca = new Scanner(System.in);
        int appleWeight = sca.nextInt();
        System.out.println("请输入购买草莓数量");
        int strawberryWeight = sca.nextInt();
        double applePrice = 8;
        double strawberryPrice = 13;
        double money = 0.0;
        money = applePrice * appleWeight + strawberryPrice * strawberryWeight;
        System.out.println("商品的总价为" + money);
    }
}
