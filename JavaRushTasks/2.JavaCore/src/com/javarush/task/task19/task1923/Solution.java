package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        String result = "";
        if (args.length != 0)
        {
            BufferedReader fr = new BufferedReader(new FileReader(args[0]));
        BufferedWriter fw = new BufferedWriter(new FileWriter(args[1]));
        Pattern pattern = Pattern.compile("\\d+");
        while (fr.ready()) {
            String line = fr.readLine();
            String[] s = line.split(" ");
            for (int i = 0; i < s.length; i++) {
                Matcher m = pattern.matcher(s[i]);
                if (m.find()) {
                    result += s[i] + " ";
                }
            }
        }
        result = result.trim();
        fw.write(result);


        fr.close();
        fw.flush();
        fw.close();
    }
    }
}
// D:/JAVA/1.txt