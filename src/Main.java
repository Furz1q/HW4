public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        System.out.println("Задание 2");

        for (int b = 10; b > 0; b--){
            System.out.println(b);
        }

        System.out.println("Задание 3");

        for (int a = 0; a < 17; a = a + 2){
            System.out.println(a);
        }

        System.out.println("Задание 4");

        for (int c = 10; c >= -10; c--){
            System.out.println(c);
        }

        System.out.println("Задание 5");

        for (int d = 1904; d <= 2096; d = d + 4){
            System.out.println(d + " год является високосным");
        }

        System.out.println("Задание 6");

        for (int r = 7; r <= 98; r = r + 7){
            System.out.println(r);
        }

        System.out.println("Задание 7");

        for (int y = 1; y <= 512; y = y * 2){
            System.out.println(y);
        }

        System.out.println("Задание 8");

        int money = 29_000;
        int jar = 0;
        for (int month = 0; month < 12; month++){
            jar = jar + money;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + jar + " рублей");
        }

        System.out.println("Задание 9");

        int money1 = 29_000;
        int bank = 0;
        for (int month1 = 0; month1 < 12; month1++){
            bank = bank + bank/100;
            bank = bank + money1;
            System.out.println("Месяц " + month1 + " , сумма накоплений равна " + bank + " рублей");
        }

        System.out.println("Задание 10");

        int mult = 2;
        for (int t = 1; t <= 10; t++){
            mult = 2 * t;
            System.out.println("2*" + t + "=" + mult);
        }
    }
}