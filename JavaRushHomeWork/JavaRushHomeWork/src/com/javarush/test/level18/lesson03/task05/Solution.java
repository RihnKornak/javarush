package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.TreeSet;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        int data, dataFinal;
        ArrayList<Object> nabor = new ArrayList<Object>();
        ArrayList<Object> controlniy = new ArrayList<Object>();
        FileInputStream inputStream = new FileInputStream(fileName);
        mark:
        while (inputStream.available() > 0)
        {

            data = inputStream.read();
            for (int i = 0; i < nabor.size(); i++)
            {
                if (nabor.get(i).equals(data))
                {
                    continue mark;
                }
            }
            nabor.add(data);

        }
        inputStream.close();
        TreeSet<Integer> spisok = new TreeSet<Integer>();
        for (int i = 0; i < nabor.size(); i++){
            spisok.add((Integer) nabor.get(i));
        }
        for (int arr : spisok)
        {
            System.out.print(arr + " ");

        }
    }
}
//   D:/222.txt
//49 50 51 52 53 54 55 56 57 48 13 10