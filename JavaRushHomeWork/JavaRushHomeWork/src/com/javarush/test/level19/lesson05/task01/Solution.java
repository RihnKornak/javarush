package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException, FileNotFoundException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine(); // D:/file1.txt
        String file2 = reader.readLine(); // D:/file2.txt
        InputStream inputStream = new FileInputStream(file1);
        OutputStream outputStream = new FileOutputStream(file2);
        reader.close();
        int count = 0;
        while (inputStream.available() > 0){
            int data = inputStream.read();
            count += 1;
            if ((count != 0)& (count%2 == 0)){
                outputStream.write(data);
            }else {
                continue;
            }
        } // end of while-loop
    }
}
