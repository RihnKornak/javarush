package com.javarush.test.level04.lesson13.task01;

/* Четные числа
Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Через пробел либо с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       int m = 1;
        for (int i = 0; i < 100; i++){
            m += 1;
            if (m%2 != 0){
                continue;
            }
            System.out.print(m + " ");
        }





        //напишите тут ваш код

    }
}
