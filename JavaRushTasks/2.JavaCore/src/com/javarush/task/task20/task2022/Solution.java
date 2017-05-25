package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/
public class Solution implements Serializable, AutoCloseable {
    private transient FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
      out.defaultWriteObject();

    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.stream = new FileOutputStream(fileName, true);

    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution("D:/JAVA/1.txt");
        solution.writeObject("XXX films");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:/JAVA/2.txt"));
        out.writeObject(solution);

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:/JAVA/2.txt"));
        Solution solution2 = (Solution) in.readObject();
        out.close();
        in.close();
        solution.close();

        System.out.println(solution2.toString());






    }
}
