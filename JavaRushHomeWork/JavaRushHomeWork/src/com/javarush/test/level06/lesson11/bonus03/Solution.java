package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        for (int i = 0; i < 5; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array)
        {
            System.out.println(x);
        }

        }

    public static void sort(int[] array)
    {
        for (int k = 0; k < 5; k++){
            for (int i = 0, j = 1; i < 4; i++, j++)
            {
                int vrem;
                if (array[i] > array[j])
                {
                    vrem = array[i];
                    array[i] = array[j];
                    array[j] = vrem;
                }
            }
        }

        //напишите тут ваш код
    }
}
