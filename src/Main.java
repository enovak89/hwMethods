import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        taskAdd1();
        taskAdd6();
    }

    public static void task1() {
        System.out.println("task1");
        checkYear(2020);
    }

    public static void checkYear(int year) {
        if (year % 4 == 0) {
            System.out.println("Year is leap");
        } else {
            System.out.println("Year is not leap");
        }
    }

    public static void task2() {
        System.out.println("task2");
        checkOS(true, 2023);
    }

    public static void checkOS(boolean typeOS, int year) {
        if (typeOS == true && year < LocalDate.now().getYear()) {
            System.out.println("Установите облегченную версию для Android");
        } else if (typeOS == true && year >= LocalDate.now().getYear()) {
            System.out.println("Установите нормальную версию для Android");
        }
        if (typeOS == false && year < LocalDate.now().getYear()) {
            System.out.println("Установите облегченную версию для iOS");
        } else if (typeOS == false && year >= LocalDate.now().getYear()) {
            System.out.println("Установите нормальную версию для iOS");
        }
    }

    public static void task3() {
        System.out.println("task3");
        System.out.println("Количество дней доставки - " + checkDelivery(95));
    }

    public static int checkDelivery(int distance) {
        int daysOfDelivery = 1;
        if (distance > 20) {
            daysOfDelivery++;
        }
        if (distance > 60) {
            daysOfDelivery++;
        }
        if (distance > 100) {
            daysOfDelivery = 0;
        }
        return daysOfDelivery;
    }


    public static void taskAdd1() {
        System.out.println("taskAdd6");
        getMin(8, 4);
    }

    public static int getMin(int a, int b) {
        System.out.println(Math.min(a, b));
        return Math.min(a, b);
    }


    public static void taskAdd6() {
        System.out.println("taskAdd6");
        int[] array = {5, 4, 3, 2, 1};
        sortArr(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sortArr(int[] arr) {
        Arrays.sort(arr);
    }
}

