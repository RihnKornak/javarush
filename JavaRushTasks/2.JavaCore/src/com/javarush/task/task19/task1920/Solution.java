package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        Map<String, Double> map = new TreeMap<>();

        while (reader.ready()) {
            String line = reader.readLine();
            String[] s = line.split(" ");
            Double vrem = 0d;
            if (map.get(s[0]) != null) {
                vrem = map.get(s[0]) + Double.parseDouble(s[1]);

            } else vrem = Double.parseDouble(s[1]);
            map.put(s[0], vrem);
        }
            Double max = -4.9e-324;
        Iterator<Map.Entry<String, Double>> iterator = map.entrySet().iterator();
            while (iterator.hasNext())
            {
                Map.Entry<String, Double> pair = iterator.next();
                String key = pair.getKey();
                Double value = pair.getValue();
                if (max > value)
                {
                    iterator.remove();
                }else
                {
                    max = value;

                }

            }
            for (Map.Entry<String, Double> result : map.entrySet())
            {
                System.out.println(result.getKey());
            }


        reader.close();

    }
}
