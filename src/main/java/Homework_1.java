public class Homework_1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSigh();
        printColor(200);
        compareNumbers();
        numberLikeCondition(2, 4);
        System.out.println(положительноеИлиОтрицательное(-4));
        System.out.println(isPositive2(7));
        repeatText(6, "Лера");
        System.out.println(goodYear(2024));
        numberMassive();
        longArray();
        arrayNew();
        arrayString();
        arrayReturn(4, 6);
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSigh() {
        int a = -10;
        int b = 5;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 | value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зелный");
        }
    }

    static void compareNumbers() {
        int a = 6;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        }
        if (a <= b) {
            System.out.println("a < b");
        }
    }

    static void numberLikeCondition(int a, int b) {
        System.out.println(a + b >= 10 && a + b <= 20);
    }

    static String положительноеИлиОтрицательное(int a) {
        return a >= 0 ? "положительное" : "отрицательное";
    }

    static boolean isPositive2(int a) {
        return a >= 0;
    }

    static void repeatText(int n, String a) {
        for (int i = 0; i < n; i++) {
            System.out.println(a);
        }
    }

    static boolean goodYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    static void numberMassive() {
        int[] array = {1, 0, 0, 0, 1, 1, 1, 0};
        for (int i = 0; i < 8; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            System.out.println(array[i]);
        }
    }

    static void longArray() {
        int[] array = new int[101];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            {
                System.out.println(array[i]);
            }
        }
    }

    static void arrayNew() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (i < 6) {
                array[i] = array[i] * 2;
            }
            System.out.println(array[i]);
        }
    }

    static void arrayString() {
        System.out.println();
        int[][] array = new int[6][6];
        for (int i = 0; i < array.length; i++) {
            array[i][i] = i;
            System.out.println(array[i][i]);
        }
    }

    static void arrayReturn(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
            System.out.println(array[i]);
        }

    }
}
