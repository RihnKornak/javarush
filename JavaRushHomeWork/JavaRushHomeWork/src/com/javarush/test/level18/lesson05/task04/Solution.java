package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream = new FileInputStream(reader.readLine());
        OutputStream outputStream = new FileOutputStream(reader.readLine());
        reader.close();
        if (inputStream.available() > 0){
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            byte vrem = 0;
            for (int i = 0; i < buffer.length/2; i++){
                vrem = buffer[i];
                buffer[i] = buffer[buffer.length - 1 - i];
                buffer[buffer.length - 1 - i] = vrem;
            } // end of loop
            outputStream.write(buffer, 0, count);
        }
    inputStream.close();
        outputStream.close();
    } // end of main-method
}  // D:/file1.txt
