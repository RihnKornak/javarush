package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int m1=0, m2=0, m3=0;
        if (a >b & a < c)
        {
            m1 = c;
            m2 = a;
            m3 = b;
        }
        if (a < b & a > c){
            m1 = b;
            m2 = a;
            m3 = c;
        }
        if (a > b & a > c & b > c){
            m1 = a;
            m2 = b;
            m3 = c;
        }
            if(a > b & a > c & b < c){
                m1 = a;
                m2 = c;
                m3 = b;
            }
            if (a < b & a < c & b < c){
                m1 = c;
                m2 = b;
                m3 = a;
            }
            if (a < b & a < c & b > c){
                m1 = c;
                m2 = a;
                m3 = b;
            }
            System.out.println( m1 + " " + m2 + " " + m3);


        //напишите тут ваш код

    }
}
