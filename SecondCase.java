import java.util.Scanner;

//增加了一种水果芒果
public class SecondCase {
    public static void main(String[] args) {
        System.out.println("请输入购买苹果的数量");
        Scanner sca = new Scanner(System.in);
        int appleWeight = sca.nextInt();
        System.out.println("请输入购买草莓数量");
        int strawberryWeight = sca.nextInt();
        //增加了一种水果芒果
        System.out.println("请输入购买芒果数量");
        int mangoWeight = sca.nextInt();
        double applePrice = 8;
        double strawberryPrice = 13;
        double mangoPrice = 13;
        double money = 0.0;
        money = applePrice * appleWeight + strawberryPrice * strawberryWeight + mangoPrice*mangoWeight;
        System.out.println("商品的总价为" + money);
    }
}
