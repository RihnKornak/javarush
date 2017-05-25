package com.javarush.test.level10.lesson11.home04;

/* Большая зарплата
Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.
Образец:
Я не хочу изучать Java, я хочу большую зарплату
 не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
е хочу изучать Java, я хочу большую зарплату
 хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
…
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        char[] stroka = s.toCharArray();
        ArrayList<Character> strochka = new ArrayList<Character>();

        for (int i = 0; i < stroka.length; i++){
            strochka.add(stroka[i]);

        }

        for (int i = 0; i < 80; i+=2){
            String sss = "";
            for (int j = 0; j < strochka.size(); j++)
            {
                sss += strochka.get(j);
            }
            System.out.println(sss);
            strochka.remove(0);



    }

        //напишите тут ваш код
    }

}
