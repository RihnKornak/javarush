package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Maxxx on 06.07.2016.
 */
public class MoldovanHen extends Hen
{
    int N = 12600;
    String Sssss = Country.MOLDOVA;
    public int getCountOfEggsPerMonth(){return 100;}
   public String getDescription(){
        String s =  super.getDescription() + " Моя страна - " + Sssss + ". Я несу " + N + " яиц в месяц.";
        return s;}
}