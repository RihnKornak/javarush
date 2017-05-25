package com.javarush.test.level20.lesson02.task02;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* Читаем и пишем в файл: JavaRush
Реализуйте логику записи в файл и чтения из файла для класса JavaRush
В файле your_file_name.tmp может быть несколько объектов JavaRush
Метод main реализован только для вас и не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
           // File your_file_name = File.createTempFile("your_file_name", null);
            String your_file_name = "D:/file3.tmp";
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaRush javaRush = new JavaRush();
            User user = new User();
            user.setFirstName("Ali");
            user.setLastName("Baba");
            user.setBirthDate(new Date());
            user.setMale(true);
            user.setCountry(User.Country.OTHER);

            User user1 = new User();
            user1.setFirstName("Kazi");
            user1.setLastName("Agli");
            user1.setBirthDate(new Date());
            user1.setMale(true);
            user1.setCountry(User.Country.OTHER);

            User user2 = new User();
            user2.setFirstName("Jasmine");
            user2.setLastName("Shah");
            user2.setBirthDate(new Date());
            user2.setMale(false);
            user2.setCountry(User.Country.UKRAINE);



            javaRush.users.add(user);
            javaRush.users.add(user1);
            javaRush.users.add(user2);
            javaRush.users.add(null);
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны

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

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter writer = new PrintWriter(outputStream);
            writer.println(users.size());

            if (users.size() > 0)
            {

                for (User i : users)
                {
                    if (i == null)
                    {
                        writer.println("null");
                    }else {

                        writer.println("notNull");

                        writer.println(i.getFirstName());

                        writer.println(i.getLastName());

                        writer.println(i.getBirthDate().getTime());

                        writer.println(i.isMale());

                        writer.println(i.getCountry());

                    }// end of if-condition
                    writer.flush();
                 //
                }
            }// end of if-condition
            writer.close();
            //implement this method - реализуйте этот метод
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            int usersSize = Integer.parseInt(reader.readLine());
            int count = 0;
            for (int i = 0; i < usersSize; i++)
            {
                String isUserPresent = reader.readLine();
                if (!isUserPresent.equals("null"))
                {
                    users.add(new User());

                    users.get(users.size() - 1).setFirstName(reader.readLine());
                    users.get(users.size() - 1).setLastName(reader.readLine());
                    users.get(users.size() - 1).setBirthDate(new Date(Long.parseLong(reader.readLine())));
                    users.get(users.size() - 1).setMale(Boolean.parseBoolean(reader.readLine()));
                    String country = reader.readLine().toLowerCase();
                    if (country.equals("ukraine")){
                    users.get(users.size() - 1).setCountry(User.Country.UKRAINE);
                }else if (country.equals("russia")){
                    users.get(users.size() - 1).setCountry(User.Country.RUSSIA);
                }else {
                    users.get(users.size() - 1).setCountry(User.Country.OTHER);
                }



                }else users.add(null); // end of if-condition
            } // end of for-loop

        reader.close();
            //implement this method - реализуйте этот метод
      }
    }
}
