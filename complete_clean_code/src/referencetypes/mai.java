package referencetypes;

import java.util.Arrays;

public class mai {
    public static void main(String[] args) {
        int sayi1=  20;
        int sayi2=25;
        sayi1 = sayi2;
        sayi2 = 30;
        System.out.println(sayi1);//25



        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};
        sayilar1 = sayilar2;
        sayilar2[0] = 30;
        System.out.println(Arrays.toString(sayilar1));
        /*
        aynı referansı tutuyorlar
        sayilar1 = 101 referansını tutsun
        sayilar2 = 102 referansını tutsun
        sayilar1 = sayilar2 ->sayilar1 = 102,sayilar2 = 102 demektir
         */
        //30-5-6

        Customer customer = new Customer();
        Product product = new Product();
        Person person = customer;
        Person person1 = new Employee();
        //birbirlerine bağlı olmadıkları için referansı atayamıyoruz
        //2sinide ayrı ayrı tanımlıyoruz

        PersonDal personDal = new PersonDal();
        personDal.add(customer);
        /*
        bir sınıfa inherit edilen sınıflar referans tip olarak benzer olurlar
        person istenen yere customer veya employee verilebilir
        çünkü referans tipleri aynı
        sistemde ilerde yeni gereksinimler çıktığında bu tasarımla
        sorun yaşamayacağız customer empolyee varken visitor
        tanımladğımızda hiçbir sorun çıkmadan işlemler gerçekleştirilebilir
         */

    }
    static class Person{
        int id;
        String firstName;
    }
    static class Visitor extends Person{
        String visitorCard;
    }
    static class Customer extends Person{
        String creditCardNo;
    }
    static class Employee extends Person{
        double salary;
    }
    static class Product{
        int id;
        String name;
    }
    static class PersonDal{
        public void add(Person person){

        }
    }
}
/*

 */