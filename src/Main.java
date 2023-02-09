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
        oneStudent = list / (student1 + student2 + student3);
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
    public static void task6() {
        System.out.println("Задача 6");
        int bananWeight = 5 * 80;
        float milkWeight = 200 * 1.05f;
        int eggWeight = 2 * 100;
        int iceWeight = 4 * 70;
        float weightGramm = bananWeight + milkWeight + eggWeight + iceWeight;
        float weightKilogram = (bananWeight + milkWeight + eggWeight + iceWeight) / 1000;
        System.out.println("Вес спортзавтрака в граммах - " + weightGramm + " г");
        System.out.println("Вес спортзавтрака в кГ - " + weightKilogram + " кГ");
    }
    public static void task7() {
        System.out.println("Задача 7");
        int Weight = 7;
        float weight1 = 250 * 0.001f;
        float weight2 = 500 * 0.001f;
        float Dau250 = Weight / weight1;
        float Dau500 = Weight / weight2;
        float averageDau = (Dau250 + Dau500) / 2;
        System.out.println("Количество дней для похудения при потере 250г составляет " + Dau250);
        System.out.println("Количество дней для похудения при потере 500г составляет " + Dau500);
        System.out.println("Среднее количество дней для похудения составляет " + averageDau);
    }
    public static void task8() {
        System.out.println("Задача 8");
        int Salary1 = 67760;
        int Salary2 = 83690;
        int Salary3 = 76230;
        float percent = (100 + 10) / 100f;
        float SalarySum1 = Salary1 * percent;
        float SalarySum2 = Salary2 * percent;
        float SalarySum3 = Salary3 * percent;
        float difference1 = (SalarySum1 - Salary1) * 12;
        float difference2 = (SalarySum2 - Salary2) * 12;
        float difference3 = (SalarySum3 - Salary3) * 12;
        System.out.println("Маша теперь получает " + SalarySum1 + ".Годовой доход вырос на " + difference1);
        System.out.println("Денис теперь получает " + SalarySum2 + ".Годовой доход вырос на " + difference2);
        System.out.println("Кристина теперь получает " + SalarySum3 + ".Годовой доход вырос на " + difference3);
    }



}