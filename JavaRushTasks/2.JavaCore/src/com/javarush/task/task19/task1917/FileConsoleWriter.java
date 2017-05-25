package com.javarush.task.task19.task1917;

/* 
Свой FileWriter
*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

public class FileConsoleWriter {
   private FileWriter fileWriter;

    public FileConsoleWriter(String filename)
    {
        try {
            this.fileWriter = new FileWriter(filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public FileConsoleWriter(String fileName, boolean append)
    {
        try {
            this.fileWriter = new FileWriter(fileName, append);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public FileConsoleWriter(File file)
    {
        try {
            this.fileWriter = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public FileConsoleWriter(File file, boolean append)
    {
        try {
            this.fileWriter = new FileWriter(file, append);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public FileConsoleWriter(FileDescriptor fd)
    {
        this.fileWriter = new FileWriter(fd);
    }

    public void write(int c) throws IOException {
        this.fileWriter.write(c);
        System.out.println(c);
    }

    public void write(char[] cbuf) throws IOException {
        this.fileWriter.write(cbuf);
        System.out.println(String.valueOf(cbuf));
    }

    public void write(String str) throws IOException {
        this.fileWriter.write(str);
        System.out.println(str);
    }

    public void write(char[] cbuf, int off, int len)
    {
        try {
            this.fileWriter.write(cbuf, off, len);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(String.valueOf(cbuf, off, len));
    }

    public void write(String str, int off, int len) throws IOException {
        this.fileWriter.write(str, off, len);
        System.out.println(String.valueOf(str).substring(off, off + len));
    }

    public void close() throws IOException
    {
        this.fileWriter.close();
    }
    public static void main(String[] args) {

    }

}
