package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1989"));
        map.put("Arnoldy", new Date("JUNE 12 1990"));
        map.put("Tallony", new Date("OCTOBER 1 1999"));
        map.put("Makarone", new Date("JUNE 1 1999"));
        map.put("Duche", new Date("JUNE 11 1999"));
        map.put("Capone", new Date("JULY 12 1990"));
        map.put("Capone1", new Date("JUNE 13 1990"));
        map.put("Capone2", new Date("JUNE 21 1990"));
        map.put("Capone3", new Date("DECEMBER 22 1990"));
        map.put("Capone4", new Date("JUNE 3 1990"));
        return map;

        //напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String,Date>>iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
        Map.Entry<String, Date> pair = iterator.next();
        String key = pair.getKey();
        int value = pair.getValue().getMonth();
        if (value >= 5 & value <=7)
        {
            iterator.remove();
        }

          }

        //напишите тут ваш код

    }

    public static void main(String[] args)
    {
        System.out.println(createMap());
        removeAllSummerPeople(createMap());

    }
}
