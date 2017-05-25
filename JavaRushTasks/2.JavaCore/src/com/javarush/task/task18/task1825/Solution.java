package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import javafx.collections.transformation.SortedList;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String fileName = "";
        String path = "";
        String file1 = "";
 //       String[] array;
        while (true){
            fileName = reader.readLine();
            if (fileName.equals("end")) break;
           String[] array = fileName.split("\\.");
            path = array[0];
            file1 = array[1];
            list.add(array[2]);
        }

        Collections.sort(list); // D:/JAVA/test.txt.part1
        String outputFileName = path + "." + file1;
        FileOutputStream outputStream = new FileOutputStream(outputFileName);
        for (int i = 0; i < list.size(); i++){
            String fullPathName = path + "." + file1 + "." + list.get(i);
            FileInputStream inputStream = new FileInputStream(fullPathName);
            byte[] buffer = new byte[1024];
            while (inputStream.available() > 0){
                int count = inputStream.read(buffer);
                outputStream.write(buffer,0,count);
            }
            inputStream.close();
        }
    outputStream.close();

    }
}
