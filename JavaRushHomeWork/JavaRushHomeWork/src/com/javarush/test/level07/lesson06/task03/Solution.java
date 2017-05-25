package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        List<String> list = new LinkedList<String>();
        List<String> min = new LinkedList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++){
            list.add(reader.readLine());
        }
        min.add(0,list.get(0));
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).length() < min.get(0).length()){
                min.set(0,list.get(i));
            }
    }

                    for (String x : list){
                        if (x.length() == min.get(0).length()){
                            min.add(x);
                        }
                    }
        min.remove(0);
                            for (String x : min){
                                System.out.println(x);
                            }
        //напишите тут ваш код

    }
}
