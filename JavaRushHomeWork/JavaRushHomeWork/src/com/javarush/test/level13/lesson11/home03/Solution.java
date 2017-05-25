package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameOfFile = null;
        try
        {
            nameOfFile = reader.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        FileInputStream inputStream = null;
        try
        {
            inputStream = new FileInputStream(nameOfFile);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        try
        {
            while (inputStream.available() > 0){
               System.out.print((char) inputStream.read());






            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            inputStream.close();
        }


//
//
// D:/222.txt
        //add your code here
    }
}
