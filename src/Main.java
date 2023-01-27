public class Main {
    public static void main(String[] args) {
        task1();
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
}
