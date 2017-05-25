package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        if (args.length > 0){
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
            int count = 0;

            while (reader.ready()){
                String line = reader.readLine();
                char[] stroka = line.toCharArray();

                for (int i = 0; i < stroka.length; i++){

                    if ((stroka[i] >= 65) && (stroka[i] < 91)){count++;}
                    if ((stroka[i] >= 97) && (stroka[i] < 123)){count++;}
                }

            }
            System.out.println(count);
            reader.close();
        }


    }
}
