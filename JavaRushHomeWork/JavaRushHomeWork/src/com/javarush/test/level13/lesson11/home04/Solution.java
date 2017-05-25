package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
       // OutputStream outputStream =new FileOutputStream(fileName);
        //Writer writer = new FileWriter(fileName);

        String strokaVFile;
        PrintWriter print = new PrintWriter(fileName);

        while (true){

            strokaVFile = reader.readLine();
            print.println(strokaVFile);
            if (strokaVFile.equals("exit")) {

                break;
            }

            // strokaVFile += "\r\n";
           // byte[] perevod = strokaVFile.getBytes();


            //writer.write(strokaVFile);
          //  writer.write("\r\n");
            //writer.append('\n');
            //writer.append('E');
          //  writer.flush();

          // outputStream.write(perevod);

        }
        print.close();


    }

   // D:/111.txt
}/*Жопа
как витрина магазина продовольственного
был бы у меня хуй с километр
я б доставил ей удовольствие
это был Маяковский и проверка кода по задаче)
5.10.2016
exit */
