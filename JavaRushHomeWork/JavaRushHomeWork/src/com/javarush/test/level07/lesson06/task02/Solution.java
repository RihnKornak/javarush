package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        List<String> list = new LinkedList<String>();
        List<String> maxItem = new LinkedList<String>();
        maxItem.add("");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5 ; i++){
            list.add(reader.readLine());

        }
        for (int i = 0; i < list.size()-1; i++){
            int j = i+1;
            if (list.get(i).length() > maxItem.get(0).length()){
                maxItem.set(0,list.get(i));
            }
        }
                for (String x : list){
                    if (x.length() == maxItem.get(0).length()) {
                        maxItem.add(x);
                    }
                }
        maxItem.remove(0);
                        for (String x : maxItem){
                            System.out.println(x);
                        }
    }
}
