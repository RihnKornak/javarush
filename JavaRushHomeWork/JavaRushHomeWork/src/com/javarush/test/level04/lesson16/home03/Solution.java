package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {


            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int sum1 = 0;
        int b = 0;

            while (b != -1)
            {
                int a = Integer.parseInt(reader.readLine());
                sum1 += a;
                b = a;

            }
            System.out.println(sum1);
        }
        }



        //напишите тут ваш код
