package com.javarush.test.level20.lesson07.task01;

import java.io.*;

/* Externalizable для апартаментов
Реализуйте интерфейс Externalizable для класса Apartment
Подумайте, какие поля не нужно сериализовать.
*/
public class Solution {
   /* public static void main(String[] args) throws Exception
    {
        ObjectInput input = new ObjectInputStream(new FileInputStream("D:/file3.tmp"));
        ObjectOutput output = new ObjectOutputStream(new FileOutputStream("D:/file3.tmp"));
        Apartment apartment = new Apartment();
        apartment.writeExternal(output);
        output.close();
        apartment.readExternal(input);
        input.close();
        System.out.print(apartment);
    } */

    public static class Apartment implements Externalizable{

        private transient   String address;
        private transient int year;

        /**
         * Mandatory public no-arg constructor.
         */
        public Apartment() { super(); }

        public Apartment(String adr, int y) {
            address = adr;
            year = y;
        }

        public void writeExternal(ObjectOutput outputStream) throws IOException{
            outputStream.writeObject(address);
            outputStream.writeInt(year);
        }
        public void readExternal(ObjectInput input) throws IOException, ClassNotFoundException{

                address = (String)input.readObject();
                year = input.readInt();
        }

        /**
         * Prints out the fields. used for testing!
         */
        public String toString() {
            return("Address: " + address + "\n" + "Year: " + year);
        }
    }
}
