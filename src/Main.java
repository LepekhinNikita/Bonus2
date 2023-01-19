public class Main {
    public static void main(String[] args) {

        int amount = 100; // сумма на счету клиента
        int cash = 1590; // сумма пополнения счета
        int bonus; // сумма бонусов

        if (cash > 1000) {
            bonus = (cash / 100);
        } else {
            bonus = 0;
        }
        System.out.println("Сумма бонусов = " + bonus);
        System.out.println("Итоговая сумма = " + (amount + cash + bonus));
    }
}