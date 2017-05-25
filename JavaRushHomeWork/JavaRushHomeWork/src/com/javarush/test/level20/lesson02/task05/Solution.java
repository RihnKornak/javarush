package com.javarush.test.level20.lesson02.task05;

import java.io.*;

/* И еще раз о синхронизации
Разберитесь почему не работает метод main()
Реализуйте логику записи в файл и чтения из файла для класса Object
Метод load должен инициализировать объект данными из файла
Метод main реализован только для вас и не участвует в тестировании
*/
public class Solution extends java.lang.Object{
    public static void main(java.lang.String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
           java.lang.String your_file_name = "D:/file.tmp";
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            Object object = new Object();
            object.string1 = new String();   //string #1
            object.string2 = new String();   //string #2
            object.save(outputStream);
            outputStream.flush();

            Object loadedObject = new Object();
            loadedObject.string1 = new String(); //string #3
            loadedObject.string2 = new String(); //string #4


            loadedObject.load(inputStream);
            System.out.println("str1 " + loadedObject.string1.number);
            System.out.println("str1 " + loadedObject.string1.number);
            //check here that the object variable equals to loadedObject - проверьте тут, что object и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }


    public static class Object {
        String string1;
        String string2;

        public void save(OutputStream outputStream) throws Exception {

            PrintStream console = System.out;
            PrintStream stream = new PrintStream(outputStream);
            System.setOut(stream);
            if (string1 != null){string1.print();}

            PrintWriter writer = new PrintWriter(outputStream);
            java.lang.String isString1Present = string1 != null ? "yes" : "no1";
            writer.println(isString1Present);
            if (string1 != null){

                writer.println(string1.number);
            }
            java.lang.String isString2Present = string2 != null ? "yes" : "no1";
            writer.println(isString1Present);
            if (string2 != null){
                writer.println(string2.number);
            }

            writer.flush();
            writer.close();
            //implement this method - реализуйте этот метод
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            java.lang.String isString1Present = reader.readLine();
            int count = countStrings;
            count = 0;

            if (isString1Present.equals("yes")){

                countStrings = Integer.parseInt(reader.readLine()) - 1;
                string1 = new String();
            }
            java.lang.String isString2Present = reader.readLine();
            if (isString1Present.equals("yes")){
                countStrings = Integer.parseInt(reader.readLine());
                string1 = new String();
            }
            reader.close();
            //implement this method - реализуйте этот метод
        }
    }

    public static int countStrings ;

    public static class String {
        private final int number;

        public String() {
            number = ++countStrings;
        }

        public void print() {
            System.out.println("string #" + number);
        }
    }
}
