package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        String fileName = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            FileInputStream inputStream;
            try {
                fileName = reader.readLine();
                inputStream = new FileInputStream(fileName);
            }catch (FileNotFoundException e){
                System.out.println(fileName);
               // inputStream.close();
                break;

            }
            inputStream.close();
        }

        reader.close();
    }

}
