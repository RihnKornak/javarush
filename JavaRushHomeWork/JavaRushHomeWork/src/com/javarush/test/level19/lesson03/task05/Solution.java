package com.javarush.test.level19.lesson03.task05;

import java.util.HashMap;
import java.util.Map;

/* Закрепляем адаптер
Адаптировать Customer и Contact к RowItem.
Классом-адаптером является DataAdapter.
Инициализируйте countries перед началом выполнения программы. Соответствие кода страны и названия:
UA Ukraine
RU Russia
CA Canada
*/

public class Solution {
    private static Map<String,String> countries = new HashMap<String,String>();
    static {
        countries.put("Ukraine","UA");
        countries.put("Russia","RU");
        countries.put("Canada","CA");
    }

    public static class DataAdapter implements RowItem {
        private Customer customer;
        private Contact contact;
        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }
       public String getCountryCode(){
           String s = countries.get(this.customer.getCountryName());
     return s;
       }
       public String getCompany(){
           return this.customer.getCompanyName();
       }
       public String getContactFirstName(){
           String[] s = this.contact.getName().split(", ");
           return s[1];
       }
       public String getContactLastName(){
           String[] s = this.contact.getName().split(", ");
           return s[0];
        }
       public String getDialString(){

          // return "callto://" + this.contact.getPhoneNumber().substring(0,3) + this.contact.getPhoneNumber().substring(4,7) + this.contact.getPhoneNumber().substring(8,11) + this.contact.getPhoneNumber().substring(12,14) + this.contact.getPhoneNumber().substring(15,17);
        return "callto://" + this.contact.getPhoneNumber().replaceAll("[()-]", "");
       }


    }

    public static interface RowItem {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        String getDialString();         //example callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67
    }

  /*  public static void main(String[] args)
    {
        class CustomJaba implements Customer
        {
                String companyName = "JavaRush Ltd.";
                String countryName = "Ukraine";


                @Override
                public String getCompanyName(){

                return companyName;
            }

                @Override
                public String getCountryName(){

                    return countryName;
                }

        }
        class PolovoiContact implements Contact
        {
            String name = "Ivanov, Ivan";
            String phoneNumber = "+38(050)123-45-67";



                @Override
                public String getName()
                {
                    return name;
                }

                @Override
                public String getPhoneNumber()
                {
                    return phoneNumber;
                }

        }
        CustomJaba customer = new CustomJaba();
        PolovoiContact contact = new PolovoiContact();
        DataAdapter da = new DataAdapter(customer, contact);
        System.out.println(da.getCountryCode());
        System.out.println(da.getCompany());
        System.out.println(da.getContactFirstName());
        System.out.println(da.getContactLastName());
        System.out.println(da.getDialString());
    } */
}