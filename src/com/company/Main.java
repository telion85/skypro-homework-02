package com.company;

public class Main {

    public static void main(String[] args) {

        // Task 1
        var variableValue = 12; // наверно это излишне )
        byte byteValue = 10;
        short shortValue = 230;
        int integerValue = 9230;
        long longValue = 220_000_230L;

        float floatValue = 12.38f;
        double doubleValue = -1000.999999999;
        System.out.println();

        // Task 2
        float weightFirstBoxer = 78.2f;
        float weightSecondBoxer = 82.7f;
        float sumWeightBoxers = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Task 2. Общий вес двух бойцов " + sumWeightBoxers + " кг");
        float differenceWeight = Math.abs(weightFirstBoxer - weightSecondBoxer);
        System.out.println("Task 2. Разница между весами бойцов " + differenceWeight + " кг");
        System.out.println();

        // Task 3
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

        float totalWeightProductsGram = totalWeightBananas + totalWeightMilk + totalWeightIceCreame + totalWeightEggs;
        float totalWeightProductsKilogram = totalWeightProductsGram / 1000;
        System.out.println("Task 3. Вес спорт-завтрака " + totalWeightProductsKilogram + " кг");
        System.out.println();

        // Task 4
        float needToLoseKg = 7f;
        float needToLoseGr = needToLoseKg * 1000;
        float minLosePerDayGr = 250f;
        float maxLosePerDayGr = 500f;
        float maxTerm = needToLoseGr / minLosePerDayGr;
        System.out.println("Task 4. Максимальный срок похудения " + maxTerm + " дней");
        float minTerm = needToLoseGr / maxLosePerDayGr;
        System.out.println("Task 4. Минимальный срок похудения " + minTerm + " дней");
        float avgTerm = (maxTerm + minTerm) / 2;
        System.out.println("Task 4. Средний срок похудения " + avgTerm + " дней");
        System.out.println();

        // Task 5




    }
}
