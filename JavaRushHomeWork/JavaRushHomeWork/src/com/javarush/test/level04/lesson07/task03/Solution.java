package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());//напишите тут ваш код
        int num3 = Integer.parseInt(reader.readLine());
        int a = 0;
        if (num1 > 0){
            a +=1;
        }
        if (num2 > 0){
            a +=1;
        }
        if (num3 > 0){
            a +=1;
        }
        System.out.println(a);
    } // конец  метода
}
