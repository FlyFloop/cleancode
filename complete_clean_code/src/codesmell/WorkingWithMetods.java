package codesmell;

public class WorkingWithMetods {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.add(new Customer(1,2,"alper","yorgun","1234567890"));

    }
    static class CustomerManager{
        public void add(Customer customer){
            System.out.println("Eklendi.");
        }
    }
     static class Customer{
        int cityId;
        int id;

        String firstName;
        String lastName;
        String identityNumber;

         public Customer(int cityId, int id, String firstName, String lastName, String identityNumber) {
             this.cityId = cityId;
             this.id = id;
             this.firstName = firstName;
             this.lastName = lastName;
             this.identityNumber = identityNumber;
         }



    }
}
/*

Kötü kod:
 public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.add("alper","yorgun","1234567890");
        customerManager.add("emre","yorgun","1234567890");
        customerManager.add("engin","yorgun","1234567890");
        customerManager.add("pınar","yorgun","1234567890");
        customerManager.add("salih","yorgun","1234567890");
        customerManager.add("alper","yorgun","1234567890");
    }
    static class CustomerManager{
        public void add(String firstName,String lastName,String identityNumber,int cityId){
            System.out.println("Eklendi.");
        }
    }

 */
