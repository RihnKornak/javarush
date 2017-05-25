package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = "";
        while (true){
            try {
                word = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (word.equals("exit")) break;
            new ReadThread(word).start();
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public static class ReadThread extends Thread {
        FileInputStream inputStream;
        int counter = 0;
        int maxValue = 0;
        int setValue = 0;
        String fileName;
        ArrayList<Byte> arrayList = new ArrayList<>();
        public ReadThread(String fileName) {
            try {
                this.inputStream = new FileInputStream(fileName);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            this.fileName = fileName;
           // this.start();
            //implement constructor body
        }

        public void run() {
            try {
                while (inputStream.available() > 0){
                    int data = inputStream.read();
                    arrayList.add((byte)data);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 128; i++){
                for (int j = 0; j < arrayList.size(); j++){
                    if (arrayList.get(j) == i){
                        counter++;
                    }


                }
                if (maxValue < counter){
                    maxValue = counter;
                    setValue = i;
                }
                counter = 0;
            }
            resultMap.put(fileName, setValue);
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // implement file reading here - реализуйте чтение из файла тут  D:\JAVA\test.txt
    }
}
