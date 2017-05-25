package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String s1 = "";
                    char[] vr = s.toCharArray();
            for (int i = 0; i < vr.length; i++)
            {
                vr[0] = Character.toUpperCase(vr[0]);
                if (vr[i] == ' ')
                {
                    vr[i+1] = Character.toUpperCase(vr[i+1]);
                }

                s = new String(vr);
            }


        System.out.println(s);
        //напишите тут ваш код
    }


}
