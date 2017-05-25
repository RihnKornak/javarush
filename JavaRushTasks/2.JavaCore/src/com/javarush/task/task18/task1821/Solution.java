package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws IOException {

       // BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
        FileInputStream inputStream = new FileInputStream(args[0]);
        ArrayList<Byte> arrayList = new ArrayList<>();
        int[] result = new int[128];
        while (inputStream.available() > 0){
            int counter = inputStream.read();
            arrayList.add((byte)counter);

        }
        int counter = 0;
        for (int i = 0; i < 128; i++){
            for (int j = 0; j < arrayList.size(); j++){
                if (arrayList.get(j) == i) counter++;

            }
            //result[i]= counter;
            char num = (char)i;
           if (counter > 0) System.out.println(num + " " + counter);
            counter = 0;
        }


        inputStream.close();
        //reader.close();
    }
}
