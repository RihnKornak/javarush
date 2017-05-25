package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        while (reader.ready())
        {
            String line = reader.readLine();
            String name = "";
            Date birthday;
            String[] s = line.split(" ");
            for (int index = 0; index < s.length - 3; index++)
            {
               name += s[index] + " ";
            }
           name = name.trim();
            birthday = new Date(Integer.parseInt(s[s.length - 1]) - 1900, Integer.parseInt(s[s.length - 2]) - 1, Integer.parseInt(s[s.length - 3]));
            //birthday = cal.getTime();
            PEOPLE.add(new Person(name, birthday));
        }
        reader.close();


    }
}
