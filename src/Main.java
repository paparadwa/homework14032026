public class Main {
    public static void main(String[] args) {
        //task 1
        byte clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //task 2
        short clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        //task 3
        short year = 2021;
        if (year > 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println("Год является високосным");
            } else {
                System.out.println("Год не является високосным");
            }
        } else {
            System.out.println("Понятие високосного года ввели только в 1584 году");
        }
        //task 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
        //task 5
        byte monthNumber = 2;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц принадлежит к зиме");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц принадлежит к весне");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц принадлежит к лету");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц принадлежит к осени");
                break;
            default:
                System.out.println("Ошибка!");
                break;
        }
    }
}