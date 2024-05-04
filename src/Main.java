public class Main {
    public static void main(String[] args) {
        // Задача 1
        int total = 0;
        int i = 0;
        while (total < 2459000) {
            total = total + 15000;
            i++;
        }
        System.out.println(total);
        System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        System.out.println();
        System.out.println();
        System.out.println();


        // Задача 2
        int s = 0;
        while (s < 10) {
            s++;
            System.out.print(s + " ");
        }
        System.out.println();
        for (int a = 10; a > 0; a = a - 1) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println();


        // Задача 3
        int population = 12000000;
        int dead = 8;
        int birthRate = 17;
        for (int year = 1; year < 10; year++) {
            population += population * (birthRate - dead) / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        System.out.println();
        System.out.println();
        System.out.println();


        // Задача 4
        {
            int start = 15000;
            double percent = 0.07;
            int month = 0;
            while (start <= 12000000) {
                month++;
                start = (int) (start + (start * percent));
                System.out.println("За " + month + " месяц накоплений сумма вклада составила " + start);
            }
            System.out.println("Василию потребуется такое количество месяцев - " + month + " - для сбора нужной суммы");
        }

        System.out.println();
        System.out.println();
        System.out.println();


        // Задача 5
        {
            int start = 15000;
            double percent = 0.07;
            int month = 1;
            for (; start <= 12000000; month++) {
                start = (int) (start + (start * percent));
                if (month % 6 == 0) {
                    System.out.println("За " + month + " месяц накоплений сумма вклада составила " + start);
                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();

        // Задача 6
        int start = 15000;
        double percent = 0.07;
        int month = 1;          // В итоге нормально так и не придумал как прописать переменную year чтобы все работало, поэтому оставил как есть
        for (; month <= 108; month++) {
            start = (int) (start + (start * percent));
            if (month % 6 == 0) {
                System.out.println("За " + month + " месяц накоплений сумма вклада составила " + start);
            }
        }
        System.out.println("За 9 лет сумма накоплений равна " + start);
        System.out.println();
        System.out.println();
        System.out.println();

        // Задача 7
        for (int day = 2; day < 31; day += 7){
            System.out.println("сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }
        System.out.println();
        System.out.println();
        System.out.println();

        // Задача 8
        for (int year = 2024 - 200; year < 2024 + 100; year++){
            if (year % 79 == 0){
                System.out.println(year);
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }
}