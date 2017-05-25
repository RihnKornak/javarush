package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;

/* 
Что внутри папки?
*/
public class Solution {
   static int countDir = 0;
   static int countFiles = 0;
   static long dirSize = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        Path path = Paths.get(fileName);

        if (!Files.isDirectory(path)) {
            System.out.println(path.toAbsolutePath() + " - не папка");
            return;
        } else {
            Files.walkFileTree(path, new myFileVisitor());
            System.out.println("Всего папок - " + (countDir - 1));
            System.out.println("Всего файлов - " + countFiles);
            System.out.println("Общий размер - " + dirSize);
        }
    }
    static class myFileVisitor extends SimpleFileVisitor<Path>
    {
        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            if(Files.isDirectory(dir)){ countDir++;}
            return FileVisitResult.CONTINUE;
        }
        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            if(!Files.isDirectory(file)){countFiles++;dirSize += Files.size(file);}
            return FileVisitResult.CONTINUE;
        }
    }
    }

