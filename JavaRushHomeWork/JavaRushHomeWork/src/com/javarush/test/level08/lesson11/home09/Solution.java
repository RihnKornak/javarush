package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        isDateOdd("MAY 1 2013");

    }

    public static boolean isDateOdd(String date)
    {

        Date today = new Date(date);
        Date yearbegin = new Date();
        yearbegin.setSeconds(0);
        yearbegin.setMinutes(0);
        yearbegin.setHours(0);
        yearbegin.setDate(1);
        yearbegin.setMonth(0);
        long msDays = today.getTime() - yearbegin.getTime();
        int days = (int)(msDays/86400000);
               return (days%2 != 0);

    }
}
