package com.company;
/*
Program yeni özellik eklemeye açık o özellikleri değiştirmeye kapalı olmaıldır
dependency inversion da yapıldı sınıfların birbirine gevşek bağlı olması
 */
public class Openclosed {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new DepCustomerDal());
        customerManager.Add();
    }
    //loosely coupled
    static class CustomerManager implements IcostumerService{
        private ICostumerDal _costumerDal;
        CustomerManager(ICostumerDal costumerDal){
            _costumerDal = costumerDal;
        }
        public void Add(){
            _costumerDal.Add();
        }
    }
   //veri erişim katmadı
   static class EFCustomerDal implements ICostumerDal{
        public void Add(){
            //ef code
            System.out.println("Added to database ef");

        }
    }
    static class NHCustomerDal implements ICostumerDal{
        public void Add(){
            //ef code
            System.out.println("Added to database nh");

        }
    }
    static class DepCustomerDal implements ICostumerDal{
        public void Add(){
            //ef code
            System.out.println("Added to database dep");

        }
    }
}
