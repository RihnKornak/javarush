package com.javarush.test.level07.lesson06.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        List<String> list = new LinkedList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < 5; i++){
                list.add(reader.readLine());
            }
            for (int i = 0; i < 13; i++){
                String k = list.get(4);
                list.remove(4);
                list.add(0,k) ;


             }
        for (String x : list){
            System.out.println(x);
        }


        //напишите тут ваш код

    }
}
