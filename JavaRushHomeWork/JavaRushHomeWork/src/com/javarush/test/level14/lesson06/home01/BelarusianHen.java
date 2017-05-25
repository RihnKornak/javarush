package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Maxxx on 06.07.2016.
 */
public class BelarusianHen extends Hen
{
    int N = 9999;
    String Sssss = Country.BELARUS;
    public int getCountOfEggsPerMonth(){return 9999999;}
    public String getDescription(){
        String s =  super.getDescription() + " Моя страна - " + Sssss + ". Я несу " + N + " яиц в месяц.";
        return s;}
}