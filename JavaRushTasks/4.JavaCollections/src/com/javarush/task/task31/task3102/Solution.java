package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.*;

/* 
Находим все файлы
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
       File rootDir = new File(root);
       ArrayList<String> result = new ArrayList<>();
       Queue<File> queue = new PriorityQueue<>();
        Collections.addAll(queue, rootDir.listFiles());
       while (!queue.isEmpty())
       {
           File current = queue.remove();

           if (current.isDirectory())
           {
                Collections.addAll(queue, current.listFiles());
           }else result.add(current.getAbsolutePath());

       }

        return result;

    }

    public static void main(String[] args) {
        
    }
}
