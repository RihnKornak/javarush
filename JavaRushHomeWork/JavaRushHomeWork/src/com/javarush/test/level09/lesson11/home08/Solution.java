package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        int[] list1 = new int[5];
        int[] list2 = new int[2];
        int[] list3 = new int[4];
        int[] list4 = new int[7];
        int[] list5 = new int[0];
        for (int i = 0; i < list1.length; i++){
            list1[i] = i*(i+1);
        }
        for (int i = 0; i < list2.length; i++){
            list2[i] = i*(i+1);
        }
        for (int i = 0; i < list3.length; i++){
            list3[i] = i*(i+1);
        }
        for (int i = 0; i < list4.length; i++){
            list4[i] = (i-1)*(i+1);
        }
        for (int i = 0; i < list5.length; i++){
            list5[i] = i*(i+1);
        }
        ArrayList<int[]> list = new ArrayList<int[]>();
            list.add(list1);
            list.add(list2);
        list.add(list3);
        list.add(list4);
        list.add(list5);
        return list;

        //напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
