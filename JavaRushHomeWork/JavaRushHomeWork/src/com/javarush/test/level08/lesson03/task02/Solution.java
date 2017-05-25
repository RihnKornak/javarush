package com.javarush.test.level08.lesson03.task02;

/* HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт, дыня - овощ, ежевика - куст, жень-шень - корень, земляника - ягода, ирис - цветок, картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель - клубень
*/

import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashMap<String,String> meal = new HashMap<String, String>();
        meal.put("арбуз", "ягода");
        meal.put("банан","трава");
        meal.put("вишня","ягода");
        meal.put("груша","фрукт");
        meal.put("дыня","овощ");
        meal.put("ежевика","куст");
        meal.put("жень-шень","корень");
        meal.put("земляника","ягода");
        meal.put("ирис","цветок");
        meal.put("картофель","клубень");
        for (Map.Entry<String,String> text : meal.entrySet()){
            String key = text.getKey();
            String value = text.getValue();
            System.out.println(key + " - " + value);
        }



        //напишите тут ваш код

    }
}
