package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
       String sa1 = reader.readLine();
        String sa2 = reader.readLine();
        String sa3 = reader.readLine();
        int na1 = Integer.parseInt(sa1);
        int na2 = Integer.parseInt(sa2);
        int na3 = Integer.parseInt(sa3);

        if ((na1==na2)&&(na1==na3)&&(na3==na2))
            System.out.println(na1+" "+na2+" "+na3);
        else if ((na1==na2)&&(na3!=na1)&&(na3!=na2))
            System.out.println(na1+" "+na2);
        else if ((na1==na3)&&(na2 != na3)&&(na1 != na2))
            System.out.println(na1+" "+na3);
        else if ((na2 == na3)&&(na1 !=na2)&&(na1 !=na3))
            System.out.println(na2+" "+na3);

        //напишите тут ваш код

    }
}