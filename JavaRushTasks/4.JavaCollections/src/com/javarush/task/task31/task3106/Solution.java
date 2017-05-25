package com.javarush.task.task31.task3106;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/*
Разархивируем файл
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            return;
        }

        String resultFileName = args[0];
        ArrayList<String> sorted = new ArrayList<>();
        for (int i = 1; i < args.length; i++){
            sorted.add(args[i]);
        }
        sorted.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        List zipParts= new ArrayList<>();
        for (int i = 0; i < sorted.size(); i++) {
            zipParts.add(new FileInputStream(sorted.get(i)));
        };


        byte[] buffer = new byte[1024];
        int readByteCnt;
        try(ZipInputStream zipIn = new ZipInputStream(new SequenceInputStream(Collections.enumeration(zipParts)));
            FileOutputStream fileOut = new FileOutputStream(new File(resultFileName))) {

            System.out.println(zipIn.getNextEntry().toString());

            while ((readByteCnt = zipIn.read(buffer)) > 0) {
                fileOut.write(buffer, 0, readByteCnt);
                fileOut.flush();
            }
        }

    }

    }

