 package com.javarush.task.task31.task3101;

import javafx.collections.transformation.SortedList;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//import import com.javarush.task.task31.task3101.FileUtils;

import java.util.List;

/*
Проход по дереву файлов
*/


public class Solution {
   private static ArrayList<File> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {


        File resultFileAbsolutePath = new File(args[1]);
        File allFilesContent = new File(resultFileAbsolutePath.getParent()+"/allFilesContent.txt");
        FileUtils.renameFile(resultFileAbsolutePath, allFilesContent);
        try (FileOutputStream outputStream = new FileOutputStream(allFilesContent))
        {
            String dirName = args[0];
            File dir = new File(dirName);
            for (File file : dir.listFiles())
            {
                if (file.isFile())
                {
                    if (file.length() > 50)FileUtils.deleteFile(file);
                    else list.add(file);
                }
                if (file.isDirectory()) fileIsDirectory(file);
            }
            Collections.sort(list, new Comparator<File>() {
                public int compare(File o1, File o2) {
                    return o1.getName().compareTo(o2.getName());
                }});


            for (File file : list)
            {
                FileInputStream inputStream = new FileInputStream(file);
                while (inputStream.available() > 0) {
                    int data = inputStream.read();
                    outputStream.write(data);
                }
                inputStream.close();
            }
        }

    }
    public static void deleteFile(File file) {

            if (!file.delete()) System.out.println("Can not delete file with name " + file.getName());
    }
public static void fileIsDirectory(File f){
        //System.out.println("!!! " + f.getName());
        if(f.isDirectory()){
            for(File ff: f.listFiles()){
                fileIsDirectory(ff);
            }
        }
        else if(f.isFile()){
            if(f.length() > 50)
                FileUtils.deleteFile(f);
            else
                list.add(f);
        }
    }

  //  public static void fileIsDirectory(File file){

       //     for (File subfile : file.listFiles())
        //    {
        //        if (subfile.isDirectory()) fileIsDirectory(subfile);
       //         if (subfile.isFile()) {
         //          if (subfile.length() > 50)FileUtils.deleteFile(subfile);
         //          else list.add(subfile);
         //       }

          // }


    //}


}
/*
package com.javarush.task.task31.task3101;
import java.io.*;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
/*
Проход по дереву файлов
*/
/*
public class Solution {
    public static TreeSet<File> Lower50 = new TreeSet<>();
    public static void main(String[] args) throws IOException {

        File path = new File(args[0]); //Путь к директории
        File resultFileAbsolutePath = new File(args[1]); //Файл с контекстом всех файлом <50
        File allFilesContent = new File(resultFileAbsolutePath.getParent() + "/allFilesContent.txt");
        FileUtils.renameFile(resultFileAbsolutePath, allFilesContent);
        //хз верно ли указывать в конструкторе "allFilesContent", а не "resultFileAbsolutePath"
        //но валидатор принимает, а во втором варианте - нет
        try (FileOutputStream fos = new FileOutputStream(allFilesContent);) {


        deepSearch(path);
        TreeMap<String, File> fileAndPath = new TreeMap<>();
        for (File f : Lower50)
            fileAndPath.put(f.getName(), f);
        for (Map.Entry<String, File> pair : fileAndPath.entrySet()) {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pair.getValue()));
            String s = "";
            while ((s = bufferedReader.readLine()) != null)
                fos.write((s + "\n").getBytes());
            // fos.write("\n".getBytes());
            bufferedReader.close();
        }
    }
       // fos.close();
    }
    public static void deleteFile(File file) {
        if (!file.delete()) System.out.println("Can not delete file with name " + file.getName());
    }
    public static void deepSearch(File f){
        System.out.println("!!! " + f.getName());
        if(f.isDirectory()){
            for(File ff: f.listFiles()){
                deepSearch(ff);
            }
        }
        else if(f.isFile()){
            if(f.length() > 50)
                FileUtils.deleteFile(f);
            else
                Lower50.add(f);
        }
    }
}
*/