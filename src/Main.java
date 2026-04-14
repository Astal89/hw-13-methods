import java.time.LocalDate;

class Homework {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        checkLeapYear(2010);

        System.out.println("Задание 2");
        checkUserDevice(0, 2025);

        System.out.println("Задание 3");
        int deliveryDays = getDeliveryDays(95);
        if (deliveryDays != -1) {
            System.out.println("Потребуется дней " + deliveryDays);
        } else {
            System.out.println("Доставка не выполняется");
        }
    }

    public static void checkLeapYear(int year) {
        if (year <= 1584) {
            System.out.println(year + " - год невисокосный.");
        } else if (year % 400 == 0) {
            System.out.println(year + " - год високосный.");
        } else if (year % 100 == 0) {
            System.out.println(year + " - год невисокосный.");
        } else if (year % 4 == 0) {
            System.out.println(year + " - год високосный.");
        } else {
            System.out.println(year + " - год невисокосный.");
        }
    }

    public static void checkUserDevice(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Не удалось определить версию ОС.");
        }
    }

    public static int getDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance > 20 && distance <= 60) {
            return 2;
        } else if (distance > 60 && distance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
}
