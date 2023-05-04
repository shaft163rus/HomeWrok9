public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }



    public static void task1() {
        int[ ] arr = generateRandomArray();
        int sum = 0;
         for (int element: arr) {
             sum += element;
         }

        System.out.printf("Сумма трат за месяц составила %d рублей", sum);

    }

    public static void task2() {
        int[ ] arr = generateRandomArray();
        int max = 0;
        int min = arr[0];
        for (int element: arr) {
            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }
        }
        System.out.println();
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей", min, max);

    }

    public static void task3() {
        int[ ] arr = generateRandomArray();
        double sum = 0;
        for (int element: arr) {
            sum += element;
        }
        System.out.println();
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", sum / 30);

    }

    public static void task4() {
        System.out.println();
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1 ; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

}