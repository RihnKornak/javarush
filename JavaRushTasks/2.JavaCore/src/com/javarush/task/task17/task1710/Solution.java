package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        SimpleDateFormat dateFormatOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        if (args != null){
       if (args[0].equals("-c")){
           // if (args[0] == "-c"){
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                int id;

                Date birthday = null;
                try {
                    birthday = dateFormat.parse(args[3]);

                } catch (ParseException e) {
                    e.printStackTrace();
                }
                id = allPeople.size();
                if (args[2].equals("м")){
                   // if (args[2] == "м"){

                allPeople.add(Person.createMale(args[1], birthday));
                  //  System.out.println(allPeople.size()-1);
            }
            if (args[2].equals("ж")){allPeople.add(Person.createFemale(args[1], birthday));}
           System.out.println(id);

            }
            if (args[0].equals("-u") && Integer.parseInt(args[1]) < allPeople.size())
            {
                Person person = allPeople.get(Integer.parseInt(args[1]));
                person.setName(args[2]);
                if (args[3].equals("м")) person.setSex(Sex.MALE);
                if (args[3].equals("ж")) person.setSex(Sex.FEMALE);
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                //SimpleDateFormat dateFormatOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                Date birthday = null;
                try {
                    birthday = dateFormat.parse(args[4]);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                person.setBirthDay(birthday);
                allPeople.set(Integer.parseInt(args[1]), person);
            }
            if (args[0].equals("-d") && Integer.parseInt(args[1]) < allPeople.size())
            {
               Person person = allPeople.get(Integer.parseInt(args[1]));
                person.setName(null);
                person.setSex(null);
                person.setBirthDay(null);
                allPeople.set(Integer.parseInt(args[1]), person);
            }
            if (args[0].equals("-i"))
            {
                Person person = allPeople.get(Integer.parseInt(args[1]));
                String pol;
                if (person.getSex().equals(Sex.MALE)) pol = "м";
                else pol = "ж";
                System.out.println(person.getName() + " " + pol + " " + dateFormatOut.format(person.getBirthDay()));

            }
        }

        //start here - начни тут

    }
}
