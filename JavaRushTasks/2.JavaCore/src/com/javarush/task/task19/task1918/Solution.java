package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> tegs = new ArrayList<>();
        //String openTeg ="";
       // String closeTeg = "";
        String a;
        String lineInOne ="";
        int start = -1;
        int finish = 0;
        int countStart = 0;
        int countFinish = 0;
        int closingLength = 0;

        ArrayList<Integer> s = new ArrayList<>();
        ArrayList<Integer> f = new ArrayList<>();

        BufferedReader reader1 = new BufferedReader(new FileReader(fileName));
        while (reader1.ready()) {
            String line = reader1.readLine();
            lineInOne += line;
        }

        String tegOpen = "<" + args[0] + ".*>";
        String tegClose = "</" + args[0] + ">";
        Pattern pattern = Pattern.compile(tegOpen + ".*" + tegClose);
        Matcher matcher = pattern.matcher(lineInOne);




      //  for (int index = 0; index < list.size(); index++)
      //  {
        //System.out.println();

        reader1.close();
   // for (String x : xxx) {
    //    System.out.println(x);
    //}
   //     //Pattern pattern = Pattern.compile(openTeg);

        //Pattern pattern = Pattern.compile("(<[A-Za-z]+>).+(</[A-Za-z]+>)")
    }
}

// D:/JAVA/1.txt