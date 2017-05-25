package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Maxxx on 06.07.2016.
 */
public class RussianHen extends Hen
{
    int N = 126;
    String Sssss = Country.RUSSIA;

    public int getCountOfEggsPerMonth()
    {
        return 500;
    }

    public String getDescription()
    {
        String s = super.getDescription() + " Моя страна - " + Sssss + ". Я несу " + N + " яиц в месяц.";
        return s;
    }
}