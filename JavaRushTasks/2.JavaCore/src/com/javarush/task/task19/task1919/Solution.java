package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        Map<String, Double> map = new TreeMap<>();
        while (reader.ready())
        {
            String line = reader.readLine();
            String[] massive = line.split(" ");
            String name = massive[0];
            Double num = Double.parseDouble(massive[1]);

            if (!map.containsKey(name))
            {
                map.put(name, num);

            }else
            {

                {
                    Iterator<Map.Entry<String, Double>> iterator = map.entrySet().iterator();
                    while (iterator.hasNext())
                    {
                        Map.Entry<String, Double> pair = iterator.next();
                        String key = pair.getKey();
                        Double val = pair.getValue();
                        if (key.equals(name))
                        {
                            map.replace(key, val + num);
                        }

                    }
                }
            }
        }
        reader.close();

            for (Map.Entry<String, Double> xxx : map.entrySet())
            {
                String key = xxx.getKey();
                Double v = xxx.getValue();
                System.out.println(key + " " + v);
            }

    }
}
