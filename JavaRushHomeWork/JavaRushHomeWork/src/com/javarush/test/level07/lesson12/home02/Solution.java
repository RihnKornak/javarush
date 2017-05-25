package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        List<String> list = new ArrayList<String>();
            for (int i = 0; i < N; i++){
                String text = reader.readLine();
                list.add(text);

            }
        for (int i = 0; i < M; i++){
            list.add(list.get(0));
            list.remove(0);
        }
        for (String text : list){
            System.out.println(text);
        }

        //напишите тут ваш код
    }
}
