package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        ArrayList<String> spisok = new ArrayList<String>();
        spisok.add("Jojo");
        spisok.add("Kuku");
        spisok.add("Ruku");
        ArrayList<String> spisok2 = new ArrayList<String>();
        spisok2.add(("jabaaa"));
        ArrayList<String>[] newData = new ArrayList[2];
        newData[0] = spisok;
        newData[1] = spisok2;

        //напишите тут ваш код

        return newData;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}