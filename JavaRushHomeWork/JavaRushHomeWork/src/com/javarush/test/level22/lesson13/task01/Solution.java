package com.javarush.test.level22.lesson13.task01;

import java.util.StringTokenizer;

/* StringTokenizer
Используя StringTokenizer разделить query на части по разделителю delimiter.
Пример,
getTokens("level22.lesson13.task01", ".") == {"level22", "lesson13", "task01"}
*/
public class Solution {
    //public static void main(String[] args)
    //{
    //    String[] x = getTokens("level22.lesson13.task01", ".");
    //    for (String a : x){System.out.println(a); }
    //}
    public static String [] getTokens(String query, String delimiter)
    {
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        String[] array = new String[tokenizer.countTokens()];
        int i = 0;
        //if (query == null){return  null;}
            while (tokenizer.hasMoreTokens())
            {
                array[i] = tokenizer.nextToken();
                i++;
            }

        return array;
    }
}
