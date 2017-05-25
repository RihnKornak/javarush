package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        int d = Integer.parseInt(reader.readLine());
        int max1, max2, max;
        if (a > b){
            max1 = a;
        }else{
            max1 = b;
        }
        if (c > d){
            max2 = c;
        }else {
            max2 = d;
        }
        if (max1 > max2){
            max = max1;
        }else {
            max = max2;
        }
        System.out.println(max);
        //напишите тут ваш код

    }
}
