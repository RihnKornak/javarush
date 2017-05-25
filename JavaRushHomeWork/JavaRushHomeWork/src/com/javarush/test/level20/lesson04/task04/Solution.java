package com.javarush.test.level20.lesson04.task04;

import java.io.*;

/* Как сериализовать static?
Сделайте так, чтобы сериализация класса ClassWithStatic была возможной
*/
public class Solution {
    public static class ClassWithStatic implements Serializable{
        public static String staticString = "it's test static string";
        public int i;
        public int j;
    }

  /*  public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        FileOutputStream outputStream = new FileOutputStream("D:/file3.tmp");
        FileInputStream inputStream = new FileInputStream("D:/file3.tmp");
        ClassWithStatic cws = new ClassWithStatic();
        cws.i = 4;
        cws.j = 6;
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(cws);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        ClassWithStatic xxx = (ClassWithStatic)objectInputStream.readObject();
        System.out.println(xxx.staticString + " i " + xxx.i + " ; j " + xxx.j);
    } */
}
