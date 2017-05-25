package com.javarush.task.task31.task3109;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/* 
Читаем конфиги
*/
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Properties properties = solution.getProperties("src/com/javarush/task/task31/task3109/properties.xml");
        properties.list(System.out);

        properties = solution.getProperties("src/com/javarush/task/task31/task3109/properties.txt");
        properties.list(System.out);

        properties = solution.getProperties("src/com/javarush/task/task31/task3109/notExists");
        properties.list(System.out);
    }

    public Properties getProperties(String fileName) {
        try {
        File file = new File(fileName);
            Properties properties = new Properties();
        if (file.exists()){



                if (file.getName().toString().contains(".xml")) {
                    InputStream inputStream = new FileInputStream(file);
                    properties.loadFromXML(inputStream);
                }else {
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    properties.load(reader);

                }

        }
        return properties;
        } catch (Exception e) {
            return new Nullution().getProperties(fileName);

        }




    }

    public class Nullution extends Solution{
        public Properties getProperties(String fileName){
            return new Properties();
        }
    }
}
