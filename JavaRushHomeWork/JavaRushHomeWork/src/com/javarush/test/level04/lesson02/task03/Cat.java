package com.javarush.test.level04.lesson02.task03;

/* Реализовать метод setCatsCount
Реализовать метод setCatsCount так, чтобы с его помощью можно было устанавливать значение переменной catsCount равное переданному параметру.
*/
public class Solution
{
    public static void main(String[] args){}


    public class Cat
    {
        private static int catsCount = 0;

        public static void setCatsCount(int catsCount)
        {

            Cat cat = new Cat();
            catsCount = catsCount + 1;
        }

    }
}