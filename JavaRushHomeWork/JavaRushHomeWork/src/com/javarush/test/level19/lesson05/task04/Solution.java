package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        String line = "";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        BufferedReader fileInput = new BufferedReader(new FileReader(file1));
        BufferedWriter fileOutput = new BufferedWriter(new FileWriter(file2));
        while (fileInput.ready()){
            line = fileInput.readLine();
            line = line.replaceAll("\\." , "!");
            fileOutput.write(line);
        }

        fileInput.close();
        fileOutput.close();
    } // end of main method
} // D:/file1.txt
