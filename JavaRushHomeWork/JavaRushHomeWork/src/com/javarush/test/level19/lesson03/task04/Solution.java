package com.javarush.test.level19.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950

В файле хранится большое количество людей, данные одного человека находятся в одной строке. Метод read() должен читать данные одного человека.
*/

public class Solution {


    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner sc;
        public PersonScannerAdapter(Scanner sc){
            this.sc = sc;
        }
      public Person read() throws IOException{
          String[] s = this.sc.nextLine().split(" ");
          Calendar dr = new GregorianCalendar(Integer.parseInt(s[5]), Integer.parseInt(s[4])-1, Integer.parseInt(s[3]));
          Person person = new Person(s[1], s[2], s[0], dr.getTime());
           return person ;
          // return this.sc.nextLine();
      }
       public void close() throws IOException{
            this.sc.close();
        }
    }

    public static void main(String[] args) throws Exception
    {
        FileInputStream fileInputStream = new FileInputStream("d:/file1.txt");
        Scanner scanner = new Scanner(fileInputStream,"Cp1251");
        PersonScannerAdapter personScannerAdapter = new PersonScannerAdapter(scanner);
        System.out.print(personScannerAdapter.read().toString());

    }
}
