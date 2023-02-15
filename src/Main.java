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
        byte aByte = 114;
        short aShort = 30228;
        int aInt = 2124593475;
        long aLong = 9118264947144862476L;
        float aFloat = 3.4E+38F;
        double aDouble = 1.7E+308;
        System.out.println ("Значение переменной aByte с типом byte равно " + aByte);
        System.out.println ("Значение переменной aShort с типом short равно " + aShort);
        System.out.println ("Значение переменной aInt с типом int равно " + aInt);
        System.out.println ("Значение переменной aLong с типом long равно " + aLong);
        System.out.println ("Значение переменной aFloat с типом float равно " + aFloat);
        System.out.println ("Значение переменной aDouble с типом double равно " + aDouble);
    }

    public static void task2() {
        System.out.println("Задача 2");
        byte a = 67;
        short b1 = 569;
        short b2 = -159;
        short b3 = 27897;
        long c = 987678965549L;
        float d1 = 27.12F;
        float d2 = 2.786F;
        System.out.println ("Значение переменной a с типом byte равно " + a);
        System.out.println ("Значение переменной b1 с типом short равно " + b1);
        System.out.println ("Значение переменной b2 с типом short равно " + b2);
        System.out.println ("Значение переменной b3 с типом short равно " + b3);
        System.out.println ("Значение переменной c с типом long равно " + c);
        System.out.println ("Значение переменной d1 с типом float равно " + d1);
        System.out.println ("Значение переменной d2 с типом float равно " + d2);
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte classA = 23;
        byte classB = 27;
        byte classV = 30;
        short list = 480;
        int students = classA + classB + classV;
        int listsChild = list/students;
        System.out.println ("На каждого ученика рассчитано " + listsChild + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte bottles = 16;
        byte time = 2;
        int bottlesInTime = bottles/time;
        int time1 = 20;
        int bInTime1 = bottlesInTime * time1;
        int time2 = 1440;
        int bInTime2 = bottlesInTime * time2;
        int time3 = 4320;
        int bInTime3 = bottlesInTime * time3;
        int time4 = 44640;
        int bInTime4 = bottlesInTime * time4;
        System.out.println ("За " + time1 + " минут машина произвела " + bInTime1 + " штук бутылок");
        System.out.println ("За сутки машина произвела " + bInTime2 + " штук бутылок");
        System.out.println ("За 3 дня машина произвела " + bInTime3 + " штук бутылок");
        System.out.println ("За месяц машина произвела " + bInTime4 + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte banok = 120;
        byte white = 2;
        byte brown = 4;
        int banokNaClass = white + brown;
        int classov = banok/banokNaClass;
        int white1 = classov * white;
        int brown2 = classov * brown;
        System.out.println ("В школе, где " + classov + " классов, нужно " + white1 + " банок белой краски и " + brown2 + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");
        byte bananos = 5;
        byte gBananos = 80;
        int gB = bananos * gBananos;
        int milk = 200;
        byte gMilk = 105;
        int gM = milk * gMilk;
        byte plombir = 2;
        byte gPlombir = 100;
        int gP = plombir * gPlombir;
        byte eggs = 4;
        byte gEggs = 70;
        int gE = eggs * gEggs;
        int vesG = gB + gE + gP + gM;
        int vesKG = vesG / 1000;
        System.out.println ("Вес спортзавтрака в " + vesG + " граммах");
        System.out.println ("Вес спортзавтрака в " + vesKG + " килограммах");
    }

    public static void task7() {
        System.out.println("Задача 7");
        int ves = 7000;
        int ves1 = 250;
        int ves2 = 500;
        int dV1 = ves/ves1;
        int dV2 = ves/ves2;
        int dVsego = dV1+dV2;
        int dSredne = dVsego/2;
        System.out.println (dV1 + " дней, если употреблять по 250 грамм");
        System.out.println (dV2 + " дней, если употреблять по 500 грамм");
        System.out.println (dSredne + " день в среднем");
    }

    public static void task8() {
        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int kris = 76230;
        int masha2 = masha + masha/10;
        int denis2 = denis + denis/10;
        int kris2 = kris + kris/10;
        int mGod = masha2*12 - masha*12;
        int dGod = denis2*12 - denis*12;
        int kGod = kris2*12 - kris*12;
        System.out.println ("Маша теперь получает " +masha2+ " рублей. Годовой доход вырос на "+ mGod+ " рублей");
        System.out.println ("Денис теперь получает " +denis2+ " рублей. Годовой доход вырос на "+ dGod+ " рублей");
        System.out.println ("Кристина теперь получает " +kris2+ " рублей. Годовой доход вырос на "+ kGod+ " рублей");
    }



}