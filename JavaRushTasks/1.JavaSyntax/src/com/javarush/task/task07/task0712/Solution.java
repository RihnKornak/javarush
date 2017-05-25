package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        int min = 0;
        int max = 0;


        for (int i = 0; i < 10; i++){
            String s = reader.readLine();
            list.add(s);

        }
        int minLength = list.get(0).length();
        int maxLength = list.get(0).length();
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).length() < minLength){
                minLength = list.get(i).length();
                min = i;
            }
            if (list.get(i).length() > maxLength){
                maxLength = list.get(i).length();
                max = i;
            }
        }
        if (min < max) System.out.println(list.get(min));
        else if (max < min) System.out.println(list.get(max));
        //напишите тут ваш код
    }
}
