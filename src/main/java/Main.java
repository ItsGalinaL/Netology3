public class Main {

    public static void main(String[] args) {
        int totalAmount = 100; // Деньги на счёте клиента
        int amount = 500; // На сколько клиент пополняет счёт
        int minSum = 1000; // Сумма, после которой начисляются бонусы
        int bonus = 100; // За сколько рублей начисляется бонусный рубль

        totalAmount = totalAmount + amount; // Прибавляем сумму пополнения

        if (amount > minSum) { // Если сумма пополнения больше 1000
            totalAmount = totalAmount + (amount / bonus); // Начисляем бонусы
        }

        System.out.println("Количество рублей на счету: " + totalAmount);
    }
}
