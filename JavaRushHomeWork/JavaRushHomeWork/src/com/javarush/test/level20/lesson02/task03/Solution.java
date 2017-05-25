package com.javarush.test.level20.lesson02.task03;

import java.io.*;
import java.util.*;

/* Знакомство с properties
В методе fillInPropertiesMap считайте имя файла с консоли и заполните карту properties данными из файла.
Про .properties почитать тут - http://ru.wikipedia.org/wiki/.properties
Реализуйте логику записи в файл и чтения из файла для карты properties.
*/
/* public class Solution {

    public static Map<String, String> properties = new HashMap<>();
    //static
   // {
    //    properties.put("Jaba", "Jaba... Super Jaba!");
    //    properties.put("Riba", "Eto pro#sto riba");
    //    properties.put("Raz", "Razz = razz dva");
    //    properties.put("Eshe raz", "Razz = ra:zz dva: tri : 4");
    //}

    public void fillInPropertiesMap() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
       // properties.clear();
        load(fileInputStream);
        reader.close();
        fileInputStream.close();
            //implement this method - реализуйте этот метод
    }

    public void save(OutputStream outputStream) throws Exception {
        PrintWriter writer = new PrintWriter(outputStream);
        for (Map.Entry<String, String> map : properties.entrySet()){
            String key = map.getKey();
            key = key.replaceAll("\\s", "\\\\ ");
            key += " = ";
            String value = map.getValue();
            value = value.replaceAll("#", "\\\\#");
            value = value.replaceAll("!", "\\\\!");
            value = value.replaceAll("=", "\\\\=");
            value = value.replaceAll(":", "\\\\:");
            value = value.replaceAll("\\s", "\\\\ ");
            writer.println(key + value);
        }
        writer.flush();
        writer.close();
        //implement this method - реализуйте этот метод
    }

    public void load(InputStream inputStream) throws Exception {
        BufferedReader reader= new BufferedReader(new InputStreamReader(inputStream));
        while (reader.ready()){
            String line = reader.readLine();
            line = line.replace("\\s+=\\s+", "=");
            line = line.replace("\\s+:\\s+", "=");
            line = line.replace("(^\\\\s)", "=");
            line = line.replace("\\ ", " ");
            String[] lines = line.split("=", 2);
            lines[1] = lines[1].replaceAll("\\\\#", "#");
            lines[1] = lines[1].replaceAll("\\\\!", "!");
            lines[1] = lines[1].replaceAll("\\\\=", "=");
            lines[1] = lines[1].replaceAll("\\\\:", ":");
            lines[1] = lines[1].replaceAll("\\\\ ", " ");
            properties.put(lines[0].trim(), lines[1].trim());
        }
        //implement this method - реализуйте этот метод
        reader.close();
    }

    public static void main(String[] args) throws Exception
    {
        Solution solution = new Solution();


        OutputStream outputStream = new FileOutputStream("D:/file.properties");
        solution.save(outputStream);
        Solution prov = new Solution();
       // InputStream inputStream = new FileInputStream("D:/file.properties");
        //prov.properties.clear();
        prov.fillInPropertiesMap();
        for (Map.Entry<String, String> map : properties.entrySet()){
            String key = map.getKey();
            String value = map.getValue();
            System.out.println(key + "=" + value);
        }


    }
} */

public class Solution {
    public static Map<String, String> properties = new HashMap<>();

   // static
    // {
    //    properties.put("Jaba", "Jaba... Super Jaba!");
    //    properties.put("Riba", "Eto pro#sto riba");
     //   properties.put("Raz", "Razz = razz dva");
     //   properties.put("Eshe raz", "Razz = ra:zz dva: tri : 4");
    //}

    public static Properties prop = new Properties();
    public void fillInPropertiesMap() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        reader.close();

        load(fileInputStream);
        fileInputStream.close();

    }
    public void save(OutputStream outputStream) throws Exception
    {
        for (Map.Entry<String, String> map : properties.entrySet()){
            prop.setProperty(map.getKey(), map.getValue());
        }
        prop.store(outputStream, null);
    }
    public void load(InputStream inputStream) throws Exception
    {
        prop.load(inputStream);
        Enumeration a = prop.propertyNames();

        while (a.hasMoreElements()){
            String key = (String)a.nextElement();
            properties.put(key, prop.getProperty(key));

        }

    }


   /* public static void main(String[] args) throws Exception
    {
        Solution solution = new Solution();
        OutputStream outputStream = new FileOutputStream("D:/file.properties");
        solution.save(outputStream);
        Solution prov = new Solution();
        // InputStream inputStream = new FileInputStream("D:/file.properties");
        //prov.properties.clear();
        prov.fillInPropertiesMap();
       // for (Map.Entry<String, String> map : properties.entrySet())
       // {
       //     String key = map.getKey();
       //     String value = map.getValue();
        //    System.out.println(key + "=" + value);
        //}
        Enumeration a = prop.propertyNames();
        while (a.hasMoreElements()){
            String key = (String)a.nextElement();
            System.out.println(key + "=" + prop.getProperty(key));}
    } */
}
