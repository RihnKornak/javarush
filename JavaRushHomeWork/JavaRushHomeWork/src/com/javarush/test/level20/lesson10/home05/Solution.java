package com.javarush.test.level20.lesson10.home05;

import java.io.*;
import java.util.logging.Logger;

/* Сериализуйте Person
Сериализуйте класс Person стандартным способом. При необходимости поставьте полям модификатор transient.
*/
public class Solution {
    /*
   public static void main(String[] args) throws Exception
    {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("D:/file.tmp"));
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("D:/file.tmp"));
        Person person = new Person("FN", "LN", "CN", Sex.MALE);
        System.out.println("First name-" + person.firstName + "Last name -" + person.lastName + "full name -" + person.fullName + "greeetings -" + person.greetingString +"Country name -" +  person.country + "sex -" + person.sex + "output -" + person.outputStream + "logger -" + person.logger);
        outputStream.writeObject(person);
        Person aaa = (Person) inputStream.readObject();
        System.out.println("First name-" + aaa.firstName + "Last name -" + aaa.lastName + "full name -" + aaa.fullName + "greeetings -" + aaa.greetingString +"Country name -" +  aaa.country + "sex -" + aaa.sex + "output -" + aaa.outputStream + "logger -" + aaa.logger);
    }
    */

    public static class Person implements Serializable{
        String firstName;
        String lastName;
       transient String fullName;
       transient final String greetingString;
        String country;
        Sex sex;
       transient PrintStream outputStream;
       transient Logger logger;

        Person(String firstName, String lastName, String country, Sex sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.greetingString = "Hello, ";
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }
       /* private void writeObject(ObjectOutputStream out) throws IOException{
            out.defaultWriteObject();
            out.writeObject(sex);

        }
        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
            in.defaultReadObject();
            sex = (Sex) in.readObject();
            outputStream = System.out;
            logger = Logger.getLogger(String.valueOf(Person.class));
        } */
    }

    enum Sex {
        MALE,
        FEMALE
    }
}
