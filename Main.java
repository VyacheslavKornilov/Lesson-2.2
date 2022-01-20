public class Main {
    public static void main(String[] args) {
        int score =100;
        int deposit =1100;
        int bonus;

        if (deposit > 1000) {
            bonus = deposit / 100;
        }
        else {
            bonus = 0;
        }

        int balance = score + deposit + bonus;
        System.out.println("Ваш баланс: " + balance + " руб. Ваш бонус: " + bonus + " руб.");
    }
}
