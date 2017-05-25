package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        String[] s;
        String newLine = "";

        while (reader.ready())
        {
            String line = reader.readLine();
            s = line.split(" ");
            for (int index = 0; index < s.length; index++)
            {
                if (s[index].length() > 6)
                {
                    newLine += s[index] + ",";
                }
            }
        }
        newLine =newLine.substring(0, newLine.length() - 1);
        writer.write(newLine);

        writer.close();
        reader.close();

    }
}
