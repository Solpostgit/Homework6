public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();/*
        task10();*/
    }

    public static void task1() {
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Task 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Task 3");
        for (int i = 2; i < 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Task 4");
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Task 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.printf("%d год является високосным \n", i);
        }
        System.out.println();
    }

    public static void task6() {
        System.out.println("Task 6");
        for (int i = 7; i < 99; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task7() {
        System.out.println();
        System.out.println("Task 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task8() {
        System.out.println();
        System.out.println("Task 8");
        int amountSavings = 0;
        for (int i = 1; i <= 12; i++) {
            amountSavings = amountSavings + 29000;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей \n", i, amountSavings);
        }
    }

    public static void task9() {
        System.out.println();
        System.out.println("Task 9");
        int bankDeposit = 29000;
        float total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + bankDeposit;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей \n", i, total);
        }
    }

}