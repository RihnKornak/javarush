package com.javarush.task.task31.task3112;

import java.io.*;
import java.net.URL;
import java.nio.file.*;

/* 
Загрузчик файлов
*/
public class Solution {
//"https://www.amigo.com/ship/secretPassword.txt"
    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://www.amigo.com/ship/secretPassword.txt", Paths.get("D:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        URL url=new URL(urlString);
        InputStream inputStream=url.openStream();
        Path tmp=Files.createTempFile("temp-",".tmp");
        Files.copy(inputStream,tmp);
        String fieName=urlString.substring(urlString.lastIndexOf("/"));
        String dir=downloadDirectory.toString();
        Path moveTo=Paths.get(dir+fieName);
        Files.move(tmp,moveTo);
        return Paths.get(downloadDirectory.toString()+urlString.substring(urlString.lastIndexOf("/")));

        // implement this method
    }
}
