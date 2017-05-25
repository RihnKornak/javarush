package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) list.add(reader.readLine());
        boolean trigger = false;
        int index = 0;
        for (int i = 1; i < list.size(); i++){
            if (!(list.get(i).length() > list.get(i - 1).length())){
                trigger = true;
                index = i;
                break;
            }

    }
        if (trigger) System.out.println(index);
        reader.close();
        //напишите тут ваш код
    }
}

