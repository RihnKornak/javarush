package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int middle = 0;

        if ((a > b & a < c) | (a > c & a < b)){
            middle = a;
        }
        if ((b > a & b < c) | (b > c & b < a)){
            middle = b;
        }
        if ((c > a & c < b) | (c > b & c < a)){
            middle = c;
        }
        System.out.println(middle);

        //напишите тут ваш код
    }
}
