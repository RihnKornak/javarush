package com.javarush.test.level11.lesson11.home01;

/* Адам и Ева
Написать два класса Adam(Адам) и Eve(Ева).
Унаследовать Еву от Адама.
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    //Адам
    public class Adam
    {
        String race = "white";
        public String name = "Adam";

    }

    //Ева
    public class Eve extends Adam
    {
    public String name = "Eve";
    }
}
