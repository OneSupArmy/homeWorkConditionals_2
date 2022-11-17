import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        Scanner sc1 = new Scanner(System.in);
        byte clientOS = sc1.nextByte();
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("");

        //Задача 2
        short clientDeviceYear = sc1.nextShort();
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("");

        //Задача 3
        short year = sc1.nextShort();
        if (year % 400 == 0) {
            System.out.println("Этот год високосный");
        } else if (year % 4 == 0 && !(year % 100 == 0)) {
            System.out.println("Этот год високосный");
        } else {
            System.out.println("Этот год не високосный");
        }
        System.out.println("");

        //Задача 3
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance >= 20 && deliveryDistance < 40) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >= 40 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 3");
        } else if (deliveryDistance >= 60 && deliveryDistance < 80) {
            System.out.println("Потребуется дней: 4");
        } else if (deliveryDistance >= 80 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 5");
        }

        //Задача 3 (чисто для себя)
        for (int i = 0; i <= 100; i = i + 20) {
            if (deliveryDistance > i && deliveryDistance < (i + 20)){
                System.out.println("Потребуется дней: " + (i/20 + 1));
            }
        }

        //Задача 4
        byte monthNumber = sc1.nextByte();
        switch(monthNumber){
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Это не номер месяца");
                break;

        }
    }
}