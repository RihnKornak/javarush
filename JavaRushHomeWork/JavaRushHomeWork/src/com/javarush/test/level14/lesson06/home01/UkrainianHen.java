package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Maxxx on 06.07.2016.
 */
public class UkrainianHen extends Hen
{

        int N = 0;
        String Sssss = Country.UKRAINE;
    public  int getCountOfEggsPerMonth(){return 0;}
   public String getDescription(){
        String s =  super.getDescription() + " Моя страна - " + Sssss + ". Я несу " + N + " яиц в месяц.";
        return s;}

}
