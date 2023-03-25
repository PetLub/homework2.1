public class Main {
    public static void main(String[] args) {
        int ticketPrice = 15000; // стоимость блета
        int amount = 20; // минимальная сумма для начисления бонуса

        int bonus = ticketPrice / amount; // количество бонусов

        System.out.println("Ваши бонусы:" + bonus);
    }
}