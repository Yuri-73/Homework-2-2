public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int a = 2146483647;
        byte b = 126;
        short c = 32765;
        long d = 2147483646;
        float e = 1.2034571F;
        double f = 5.23456578985689;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
    }

    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
        System.out.println("Значение переменной a с типом float равно " + a);
        System.out.println("Значение переменной b с типом long равно " + b);
        System.out.println("Значение переменной c с типом double равно " + c);
        System.out.println("Значение переменной d с типом short равно " + d);
        System.out.println("Значение переменной e с типом short равно " + e);
        System.out.println("Значение переменной f с типом int равно " + f);
        System.out.println("Значение переменной g с типом byte равно " + g);
    }
    public static void task3() {
        System.out.println("Задача 3");
        int student1 = 23;
        int student2 = 27;
        int student3 = 30;
        int list = 480;
        int oneStudent;
        oneStudent = 480 / (student1 + student2 + student3);
        System.out.println("На каждого ученика рассчитано по " + oneStudent + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        int taimMin1 = 2;
        int taimMin2 = 20;
        int taimDau1 = 1;
        int taimDau2 = 3;
        int month = 1;
        int butle = 16;
        int botlesMin_20 = (butle / taimMin1) * taimMin2;
        int botlesDau_1 = (butle / taimMin1) * taimDau1 * 24 * 60;
        int botlesDau_2 = (butle / taimMin1) * taimDau2 * 24 * 60;
        int botlesMonth = (butle / taimMin1) * month * 30 * 24 * 60;
        System.out.println("За 20 минут машина произвела " + botlesMin_20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + botlesDau_1 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + botlesDau_2 + " штук бутылок");
        System.out.println("За месяц машина произвела " + botlesMonth + " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
        int jar = 120;
        int jarWhite = 2;
        int jarBrown = 4;
        int Class = jar / (jarWhite + jarBrown);
        int white = Class * jarWhite;
        int Brown = Class * jarBrown;
        System.out.println("В школе, где " + Class + " классов, нужно " + white + " банок белой краски и " + Brown + " банок коричневой краски");
    }
}