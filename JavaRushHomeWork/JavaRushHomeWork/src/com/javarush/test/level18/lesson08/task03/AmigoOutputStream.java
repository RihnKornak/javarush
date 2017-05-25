package com.javarush.test.level18.lesson08.task03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* AmigoOutputStream
1 Измените класс AmigoOutputStream так, чтобы он стал Wrapper-ом для класса FileOutputStream. Используйте наследование.
2 При вызове метода close() должны выполняться следующая последовательность действий:
2.1 вызвать метод flush()
2.2 дописать следующий текст [JavaRush © 2012-2013 All rights reserved.], используйте метод getBytes()
2.3 закрыть поток методом close()
*/

public class AmigoOutputStream extends OutputStream{
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream current;
    public AmigoOutputStream(FileOutputStream current){
        this.current = current;
    }

    @Override
    public void write(byte[] b) throws IOException
    {
        current.write(b);
    }

    public void write(int b) throws IOException
    {
      current.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException
    {
        current.write(b, off, len);
    }

    @Override
    public void flush() throws IOException
    {
        current.flush();
    }

    @Override
    public void close() throws IOException
    {
        current.flush();
            current.write("JavaRush © 2012-2013 All rights reserved.".getBytes());
        current.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}

