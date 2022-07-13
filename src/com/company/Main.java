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

        int grPerKg = 1000;
        float totalWeightProductsGram = totalWeightBananas + totalWeightMilk + totalWeightIceCreame + totalWeightEggs;
        float totalWeightProductsKilogram = totalWeightProductsGram / grPerKg;
        System.out.println("Task 3. Вес спорт-завтрака " + totalWeightProductsKilogram + " кг");
        System.out.println();

        // Task 4
        float needToLoseKg = 7f;
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

        // Task 5
        float coefficent = 1.1f;
        int monthCount = 12;

        float mashaCurrentSalary = 67760f;
        float mashaCurrentYearIncome = mashaCurrentSalary * monthCount;
        float mashaNewSalary = mashaCurrentSalary * coefficent;
        float mashaNewYearIncome = mashaNewSalary * monthCount;
        float mashaYearIncomeDifference = mashaNewYearIncome - mashaCurrentYearIncome;
        System.out.println("Task 5. Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaYearIncomeDifference + " рублей");

        float denisCurrentSalary = 83690f;
        float denisCurrentYearIncome = denisCurrentSalary * monthCount;
        float denisNewSalary = denisCurrentSalary * coefficent;
        float denisNewYearIncome = denisNewSalary * monthCount;
        float denisYearIncomeDifference = denisNewYearIncome - denisCurrentYearIncome;
        System.out.println("Task 5. Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisYearIncomeDifference + " рублей");

        float kristinaCurrentSalary = 76230f;
        float kristinaCurrentYearIncome = kristinaCurrentSalary * monthCount;
        float kristinaNewSalary = kristinaCurrentSalary * coefficent;
        float kristinaNewYearIncome = kristinaNewSalary * monthCount;
        float kristinaYearIncomeDifference = kristinaNewYearIncome - kristinaCurrentYearIncome;
        System.out.println("Task 5. Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaYearIncomeDifference + " рублей");














    }
}
