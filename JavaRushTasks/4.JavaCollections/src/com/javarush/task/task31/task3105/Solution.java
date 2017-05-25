package com.javarush.task.task31.task3105;

import java.io.*;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* 
Добавление файла в архив
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        File zipFile = new File(args[1]);
        File tmpFile = File.createTempFile("zip", "tmp");

        File newFile = new File(args[0]);

        Map<String, ZipEntry> map = new HashMap<>();


        ZipInputStream inZIP = new ZipInputStream(new BufferedInputStream(new FileInputStream(zipFile)));

        byte[] buff = new byte[8192];


        if (zipFile.exists())
        {
            ZipEntry entry;
          while ((entry = inZIP.getNextEntry()) != null)
          {
              map.put(entry.getName(), entry);
          }
          inZIP.close();
            ZipOutputStream outZIP = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(zipFile)));
            boolean trigga = false;
            for (Map.Entry<String, ZipEntry> pair : map.entrySet())
            {

                if (pair.getKey().equals(newFile.getName()))
                {
                    trigga = true;
                }
            }
            if (trigga)
            {
                for (Map.Entry<String, ZipEntry> pair : map.entrySet()) {

                    if (pair.getKey().equals(newFile.getName()))
                    {
                        outZIP.putNextEntry(new ZipEntry("new/" + pair.getValue()));

                        FileInputStream inputStream = new FileInputStream(newFile);
                        while (inputStream.available()  > 0)
                        {
                            int count = inputStream.read(buff);
                            outZIP.write(buff, 0, count);

                        }
                        inputStream.close();
                        outZIP.closeEntry();
                    }
                    outZIP.putNextEntry(pair.getValue());

                }
                }else {
                outZIP.putNextEntry(new ZipEntry(newFile.getName()));
                Files.copy(newFile.toPath(), outZIP);
                outZIP.closeEntry();
                for (Map.Entry<String, ZipEntry> pair : map.entrySet())
                {
                    outZIP.putNextEntry(pair.getValue());
                }

            }

            outZIP.close();
        }





        inZIP.close();


        // конец метода main
    }
}
