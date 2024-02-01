import java.util.Scanner;

//购物满 100 减 10 块
public class FourthCase {
    public static void main(String[] args) {
        System.out.println("请输入购买苹果的数量");
        Scanner sca = new Scanner(System.in);
        int appleWeight = sca.nextInt();
        System.out.println("请输入购买草莓数量");
        int strawberryWeight = sca.nextInt();
        System.out.println("请输入购买芒果数量");
        int mangoWeight = sca.nextInt();
        double applePrice = 8;
        int strawberryPrice = 13;
        double strawberryDiscoundPrice = 13*0.8;//草莓打八折
        double mangoPrice = 13;
        double money = 0.0;
        money = applePrice * appleWeight + strawberryDiscoundPrice * strawberryWeight + mangoPrice*mangoWeight;
        //购物满 100 减 10 块
        if (money>=100){
            money = money -10;
        }
        System.out.println("商品的总价为" + money);
    }
}
