package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(r.readLine());
        if ((a < 0) & (a != 0)){
            a += 1;
        }
        if ((a > 0) & (a != 0)){
            a = a*2;
        }
        System.out.println(a);

        //напишите тут ваш код

    } // конец метода

}