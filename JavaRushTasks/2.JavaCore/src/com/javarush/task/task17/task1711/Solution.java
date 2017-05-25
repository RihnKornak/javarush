package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        SimpleDateFormat dateFormatInput = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat dateFormatOutput = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        int id;
        Date birthday = null;

        if (args != null){

            switch (args[0]) {
                case "-c":
                    synchronized (allPeople){
                    for (int i = 1; i < args.length - 2; i += 3) {
                        try {
                            birthday = dateFormatInput.parse(args[i + 2]);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        if (args[i + 1].equals("м")) allPeople.add(Person.createMale(args[i], birthday));
                        if (args[i + 1].equals("ж")) allPeople.add(Person.createFemale(args[i], birthday));
                        id = allPeople.size() - 1;
                        System.out.println(id);

                    }
                    break;
            }

                case "-u" :
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length - 3; i += 4) {

                            Person person = allPeople.get(Integer.parseInt(args[i]));

                            person.setName(args[i + 1]);
                            if (args[i + 2].equals("м")) person.setSex(Sex.MALE);
                            if (args[i + 2].equals("ж")) person.setSex(Sex.FEMALE);
                            try {
                                person.setBirthDay(dateFormatInput.parse(args[i + 3]));
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                            allPeople.set(Integer.parseInt(args[i]), person);
                        }
                        break;
                    }
                case "-d" :
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {

                            Person person = allPeople.get(Integer.parseInt(args[i]));
                            person.setName(null);
                            person.setSex(null);
                            person.setBirthDay(null);

                        }
                        break;
                    }
                case "-i" :
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {

                            Person person = allPeople.get(Integer.parseInt(args[i]));
                            String pol = "";
                            if (person.getSex().equals(Sex.MALE)) pol = "м";
                            if (person.getSex().equals(Sex.FEMALE)) pol = "ж";
                            System.out.println(person.getName() + " " + pol + " " + dateFormatOutput.format(person.getBirthDay()));
                        }
                        break;
                    }
            }

        }
        //start here - начни тут
    }
}
