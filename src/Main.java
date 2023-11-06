public class Main {
    public static void main(String[] args) {
        task10();
    }

    public static void task1() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void task3() {
        for (int i = 0; i <= 17; ) {
            System.out.println(i);
            i = i + 2;
        }
    }

    public static void task4() {
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    public static void task5() {
        for (int i = 1904; i <= 2096; ) {
            System.out.println(i);
            i = i + 4;
        }
    }

    public static void task6() {
        for (int i = 1; i <= 14; i++) {
            System.out.println(7 * i);
        }
    }

    public static void task7() {
        int result = 1;

        for (int i = 0; i <= 9; i++) {
            //System.out.println(Math.pow(2, i));
            System.out.println(result);
            result = result * 2;
        }
    }

    public static void task8() {
        int moneyForSave = 29000;
        int capital = 0;

        for (int i = 1; i <= 12; i++) {
            capital = capital + moneyForSave;

            System.out.println("Месяц " + i + ", сумма накоплений равна " + capital + " рублей");
        }
    }

    public static void task9() {
        int moneyForSave = 29000;
        double capital = 0;

        for (int i = 1; i <= 12; i++) {
            capital = (capital + moneyForSave) * 1.01;

            System.out.println("Месяц " + i + ", сумма накоплений равна " + capital + " рублей");
        }
    }

    public static void task10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }
    }
}