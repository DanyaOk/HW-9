public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] sold = new int[5];
        sold[0] = 12254;
        sold[1] = 9468;
        sold[2] = 11879;
        sold[3] = 10465;
        sold[4] = 8546;
        int sum = 0;
        for (int element : sold) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Задача 2");
        int[] sold1 = new int[5];
        sold1[0] = 15465;
        sold1[1] = 9465;
        sold1[2] = 22448;
        sold1[3] = 32548;
        sold1[4] = 7894;
        int maxSold = -1;
        int minSold = 1000000000;
        for (int i = 0; i < sold1.length ; i++) {
            if (sold1[i] > maxSold) {
                maxSold = sold1[i];

            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " +maxSold+ " рублей");
        for (int i = 0; i < sold1.length ; i++) {
            if (sold1[i] < minSold) {
                minSold = sold1[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " +minSold+ " рублей");
        System.out.println("Задача 3");

        int[] sold2 = new int[5];
        sold2[0] = 12546;
        sold2[1] = 32456;
        sold2[2] = 45843;
        sold2[3] = 10546;
        sold2[4] = 14668;
        double sum1 = 0;
        double regularSum = 0;
        for (int element : sold2) {
            sum1 += element;
            regularSum = sum1 / 5;
        }
        System.out.println("Средняя сумма трат за месяц составила " + regularSum + " рублей");
        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--){
        System.out.print(reverseFullName[i]);}

    }
}