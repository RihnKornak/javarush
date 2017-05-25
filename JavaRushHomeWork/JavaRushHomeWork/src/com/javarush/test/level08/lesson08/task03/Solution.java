package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String,String> map = new HashMap<String, String>();
        for (int i = 0; i < 10; i++){
            String lastName = "Фамилия" + i;
            String name = "Имя" + i;
            map.put(lastName, name);

        }
        //напишите тут ваш код
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int countName = 0;

        for (Map.Entry<String, String> pair : map.entrySet()){
            String value = pair.getValue();
            if (value.equals(name)){
                countName += 1;
            }

        }
        return countName;
        //напишите тут ваш код

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int countLastName = 0;

        for (Map.Entry<String, String> pair : map.entrySet()){
            String key = pair.getKey();
            if (key.equals(lastName)){
                countLastName += 1;
            }

        }
        return countLastName;
        //напишите тут ваш код

    }

    /* public static void main(String[] args)
    {
       HashMap<String,String> map = createMap();
        System.out.println(getCountTheSameFirstName(map,"Имя4"));
        System.out.println(getCountTheSameLastName(map,"Фамилия3"));
    }
    */
}
