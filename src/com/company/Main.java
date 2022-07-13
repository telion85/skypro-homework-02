package com.company;

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
        var variableValue = 12; // наверно это излишне )
        byte byteValue = 10;
        short shortValue = 230;
        int integerValue = 9230;
        long longValue = 220_000_230L;

        float floatValue = 12.38f;
        double doubleValue = -1000.999999999;

        boolean booleanValue = true;
        char charValue = 'a';
        System.out.println();
    }

    public static void task2() {
        float weightFirstBoxer = 78.2f;
        float weightSecondBoxer = 82.7f;

        float sumWeightBoxers = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Task 2. Общий вес двух бойцов " + sumWeightBoxers + " кг");

        float differenceWeight = Math.abs(weightFirstBoxer - weightSecondBoxer);
        System.out.println("Task 2. Разница между весами бойцов " + differenceWeight + " кг");
        System.out.println();
    }

    public static void task3() {
        float weightBanana = 80f;
        float countBanana = 5f;
        float weightMilk = 105f;
        float countMilk = 2f;
        float weightIceCreame = 100f;
        float countIceCreame = 2f;
        float weightEgg = 70f;
        float countEgg = 4f;

        float totalWeightBananas = weightBanana * countBanana;
        float totalWeightMilk = weightMilk * countMilk;
        float totalWeightIceCreame = weightIceCreame * countIceCreame;
        float totalWeightEggs = weightEgg * countEgg;

        int grPerKg = 1000;
        float totalWeightProductsGram = totalWeightBananas + totalWeightMilk + totalWeightIceCreame + totalWeightEggs;
        float totalWeightProductsKilogram = totalWeightProductsGram / grPerKg;
        System.out.println("Task 3. Вес спорт-завтрака " + totalWeightProductsKilogram + " кг");
        System.out.println();
    }

    public static void task4() {
        float needToLoseKg = 7f;
        int grPerKg = 1000;
        float needToLoseGr = needToLoseKg * grPerKg;

        float minLosePerDayGr = 250f;
        float maxLosePerDayGr = 500f;

        int maxTerm = (int) Math.ceil(needToLoseGr / minLosePerDayGr);
        System.out.println("Task 4. Максимальный срок похудения " + maxTerm + " дней");

        int minTerm = (int) Math.ceil(needToLoseGr / maxLosePerDayGr);
        System.out.println("Task 4. Минимальный срок похудения " + minTerm + " дней");

        int avgTerm = (int) Math.ceil((maxTerm + minTerm) / 2.0);
        System.out.println("Task 4. Средний срок похудения " + avgTerm + " дней");
        System.out.println();
    }

    public static void task5() {
        float coefficient = 1.1f;
        int monthCount = 12;

        float mashaCurrentSalary = 67_760f;
        float mashaCurrentYearIncome = mashaCurrentSalary * monthCount;
        float mashaNewSalary = mashaCurrentSalary * coefficient;
        float mashaNewYearIncome = mashaNewSalary * monthCount;
        float mashaYearIncomeDifference = mashaNewYearIncome - mashaCurrentYearIncome;
        System.out.println("Task 5. Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaYearIncomeDifference + " рублей");

        float denisCurrentSalary = 83_690f;
        float denisCurrentYearIncome = denisCurrentSalary * monthCount;
        float denisNewSalary = denisCurrentSalary * coefficient;
        float denisNewYearIncome = denisNewSalary * monthCount;
        float denisYearIncomeDifference = denisNewYearIncome - denisCurrentYearIncome;
        System.out.println("Task 5. Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisYearIncomeDifference + " рублей");

        float kristinaCurrentSalary = 76_230f;
        float kristinaCurrentYearIncome = kristinaCurrentSalary * monthCount;
        float kristinaNewSalary = kristinaCurrentSalary * coefficient;
        float kristinaNewYearIncome = kristinaNewSalary * monthCount;
        float kristinaYearIncomeDifference = kristinaNewYearIncome - kristinaCurrentYearIncome;
        System.out.println("Task 5. Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaYearIncomeDifference + " рублей");
        System.out.println();
    }

    public static void task6() {
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;

        int result = a * (b + (c - d * e));
        int resultInvert = -result;

        System.out.println("Task6*. " + resultInvert);
        System.out.println();
    }

    public static void task7() {
        int a = 5;
        int b = 7;

        b = b - a;
        a = a + b;
        b = a - b;

        System.out.println("Task 7*. a = " + a + ", b = " + b);
        System.out.println();
    }

    public static void task8() {
        int a = 256;
        int b = (a / 10) % 10;

        System.out.println("Task 8*. a = " + a + ", b = " + b);
        System.out.println();
    }
}
