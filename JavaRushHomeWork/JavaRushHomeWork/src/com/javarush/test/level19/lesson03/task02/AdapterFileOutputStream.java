package com.javarush.test.level19.lesson03.task02;

/* Адаптер
Используйте класс AdapterFileOutputStream, чтобы адаптировать FileOutputStream к новому интерфейсу AmigoStringWriter
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterFileOutputStream implements AmigoStringWriter{
    private FileOutputStream fo;


   public AdapterFileOutputStream(FileOutputStream fo){
       this.fo = fo;
   }
   public void writeString(String s) throws IOException{

        this.fo.write(s.getBytes());
    }
    public void flush() throws IOException{
        this.fo.flush();
    }
    public void close() throws IOException{
        this.fo.close();
    }


}

