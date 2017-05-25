package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[1]);
        FileOutputStream outputStream = new FileOutputStream(args[2]);
        ArrayList<Byte> list = new ArrayList<>();
        String[] array;
       // byte[] buffer = new byte[1024];
        if (args[0].equals("-e")){
            while (inputStream.available() > 0){
               // int count = inputStream.read(buffer);
                int data = inputStream.read();
                if (data%2 == 0) data +=25;
                else data += 55;
                outputStream.write(data);
            }
        }
        if (args[0].equals("-d")){
            while (inputStream.available() > 0){
                int data = inputStream.read();
                if (data%2 != 0) data -= 25;
                else data -= 55;
                outputStream.write(data);
            }
        }
    inputStream.close();
        outputStream.close();
    }

}
