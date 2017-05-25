package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        Map<String, Integer> calend = new HashMap<String, Integer>();
        calend.put("January",1);
        calend.put("February",2);
        calend.put("March",3);
        calend.put("April",4);
        calend.put("May",5);
        calend.put("June",6);
        calend.put("July",7);
        calend.put("August",8);
        calend.put("September",9);
        calend.put("October",10);
        calend.put("November",11);
        calend.put("December",12);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        for (Map.Entry<String,Integer> pair : calend.entrySet()){
            String key = pair.getKey();
            int value = pair.getValue();
            if (key.equals(month)){
                System.out.println(month + " is " + value + " month");
            }
        }

        //напишите тут ваш код
    }

}
