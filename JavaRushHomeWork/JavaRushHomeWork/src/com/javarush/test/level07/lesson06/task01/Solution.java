package com.javarush.test.level07.lesson06.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        list.add("Kuku");
        list.add("Epta");
        list.add("Gusi");
        list.add("Huyusi");
        list.add("Bleat");
        System.out.println(list.size());
        for (String x : list){
            System.out.println(x);
        }

        //напишите тут ваш код

    }
}