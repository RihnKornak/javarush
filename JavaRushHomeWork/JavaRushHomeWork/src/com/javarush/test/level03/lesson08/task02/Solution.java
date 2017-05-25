package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sbablo = reader.readLine();
        String stime = reader.readLine();
        int nbablo = Integer.parseInt(sbablo);
        int ntime = Integer.parseInt(stime);
        System.out.println(name + " получает " + nbablo + " через " + ntime + " лет.");

    }
}