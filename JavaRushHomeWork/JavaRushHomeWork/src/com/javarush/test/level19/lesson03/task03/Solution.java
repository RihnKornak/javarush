package com.javarush.test.level19.lesson03.task03;

/* Адаптация нескольких интерфейсов
Адаптировать IncomeData к Customer и Contact.
Классом-адаптером является IncomeDataAdapter.
Инициализируйте countries перед началом выполнения программы. Соответствие кода страны и названия:
UA Ukraine
RU Russia
CA Canada
Дополнить телефонный номер нулями до 10 цифр при необходимости (смотри примеры)
Обратите внимание на формат вывода фамилии и имени человека
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static class IncomeDataAdapter implements Customer, Contact {
        private IncomeData id;
        public IncomeDataAdapter(IncomeData id){
            this.id = id;
        }
       public String getCompanyName(){
            return this.id.getCompany();
        }
       public String getCountryName(){
          String res = countries.get(this.id.getCountryCode());
            return res;
        }
       public String getName(){
            String s = "";
            return s+= this.id.getContactLastName() + ", " + this.id.getContactFirstName();
        }
       public String getPhoneNumber(){
            String s = "";
            String num ="" + this.id.getPhoneNumber();
            while (num.length() != 10){
                num = 0 + num;

            }

          return s += "+" + this.id.getCountryPhoneCode() + "(" + num.substring(0,3) + ")" + num.substring(3,6) + "-" + num.substring(6,8) + "-" + num.substring(8,10);
            //return s += "+" + this.id.getCountryPhoneCode() + num;
          // return s += "+" + this.id.getCountryPhoneCode() + num;


        }

        //
    }

    public static interface IncomeData {
        String getCountryCode();        //example UA

        String getCompany();            //example JavaRush Ltd.

        String getContactFirstName();   //example Ivan

        String getContactLastName();    //example Ivanov

        int getCountryPhoneCode();      //example 38

        int getPhoneNumber();           //example 501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.

        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan

        String getPhoneNumber();        //example +38(050)123-45-67
    }
  /*  public static void main(String [] args)
    {
        class IncomeDataClass implements IncomeData
        {
            String countryCode = "UA";
            String company = "JavaRush Ltd.";
            String firstName = "Ivan";
            String lastName = "Ivanov";
            int phoneCode = 38;
            int numPhone =501234567 ; //501234567
            @Override
            public String getCountryCode()
            {
                return countryCode;
            }
            @Override
            public String getCompany()
            {
                return company;
            }
            @Override
            public String getContactFirstName()
            {
                return firstName;
            }
            @Override
            public String getContactLastName()
            {
                return lastName;
            }
            @Override
            public int getCountryPhoneCode()
            {
                return phoneCode;
            }
            @Override
            public int getPhoneNumber()
            {
                return numPhone;
            }
        }
        IncomeDataAdapter incomeDataAdapter = new IncomeDataAdapter(new IncomeDataClass());
        System.out.println(incomeDataAdapter.getName());
        System.out.println(incomeDataAdapter.getCompanyName());
        System.out.println(incomeDataAdapter.getCountryName());
        System.out.println(incomeDataAdapter.getPhoneNumber());
    } */
}