public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

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
}