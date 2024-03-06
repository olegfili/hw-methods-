//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        task1(2021);
        task2(0, 2015);
        task3(95, 1);
        }


    public static void task1 (int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 )) {
            System.out.println(year + " год - високостный");
        } else {
            System.out.println(year + " год - не високостный");
        }
    }
    public static void task2(int theOperatingSystem , int clientDeviceYear) {
        if (theOperatingSystem == 0 && clientDeviceYear < 2015)  {
            System.out.println("Установите облегченную версию приложения для iOS");
        } else if (theOperatingSystem == 0 ) {
            System.out.println("Установите обычну версию приложения для iOS");
        } else if (theOperatingSystem == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android");
        } else if (theOperatingSystem == 1 ) {
            System.out.println("Установите обычну версию приложения для Android");
        } else {
            System.out.println("Данной операционной системы не существует");
        }
    }
    public static void task3 (int deliveryDistance, int deliveryTime) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + deliveryTime + " для доставки");
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней " + (deliveryTime + 1) +  " для доставки");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней " + (deliveryTime + 2 )+  " для доставки");
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }
}