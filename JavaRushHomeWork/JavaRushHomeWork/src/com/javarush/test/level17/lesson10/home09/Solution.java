package com.javarush.test.level17.lesson10.home09;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Транзакционность
Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла
2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines
4. Если список allLines НЕ содержит каких-либо строк, которые есть в forRemoveLines, то
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            String file1 = reader.readLine();
            String file2 = reader.readLine();
            BufferedReader file1Reader = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
            BufferedReader file2Reader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
            String data1File;
            String data2File;
            while ((data1File = file1Reader.readLine()) != null){
                allLines.add(data1File);
            }
            while ((data2File = file2Reader.readLine()) != null){
                forRemoveLines.add(data2File);
            }

            reader.close();
            file1Reader.close();
            file2Reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


        Solution solution = new Solution();
        try
        {
            solution.joinData();
        }
        catch (CorruptedDataException e)
        {
            e.printStackTrace();
        }

    }

    public void joinData () throws CorruptedDataException {
       if (allLines.containsAll(forRemoveLines))
       {
           allLines.removeAll(forRemoveLines);
       }else
        {
            allLines.clear();
            throw new CorruptedDataException();
        }
        }

    }

