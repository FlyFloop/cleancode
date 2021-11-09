package com.company;
/*
sırf birbirine benziyor diye birbirinin yerine kullanma nesneleri
 */
public class LiskovsSubstitution {
    public static void main(String[] args) {



       /*
       Customer customer = new Customer();
        customer.Id = 1;
        customer.firstName = "alper";
        customer.lastName = "yorgun";
        customer.tcNo = "12345";

        //yanlış yöntem birbiri yerine kullanılmamalı hepsi için
        //farklı classlar oluşturulmalı
        Customer firma = new Customer();
        firma.Id = 2;
        firma.firstName = "abc kozmetik";
        firma.tcNo = "1234567890";
        */

    }
    static class Customer{
        public int Id;
    }
    static class RealCustomer extends  Customer{
        public String firstName;
        public String tcno;
        public String lastName;

    }
    static class BusinessCustomer extends Customer{

        public String CompanyName;
        public String taxNo;
    }
}
