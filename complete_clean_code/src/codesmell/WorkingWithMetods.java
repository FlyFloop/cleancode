package codesmell;

public class WorkingWithMetods {
    public static void main(String[] args) throws Exception {
        CustomerDal customerDal = new CustomerDal();
        CustomerManager customerManager = new CustomerManager(customerDal);
        customerManager.add(new Customer(1,2,"alper","yorgun","1234567890"));

    }
    static class CustomerManager{
        CustomerDal customerDal;
        CustomerManager(CustomerDal customerDal){
            this.customerDal = customerDal;
        }
        public void add(Customer customer) throws Exception {
            /*-
            code smell
            technical debt -> şimdilik kötü yazdım ama sonra onu düzelticem demek
            if(!customer.firstName.isEmpty() && !customer.lastName.isEmpty() && !customer.identityNumber.isEmpty()){
                // if bloğu ve altında sout bloğu asla birbiri ile temas etmemeli
                System.out.println("Eklendi");
            }
             */

            //doğru kod:
            validateIdentityIfEmpty(customer);
            validateFirstNameIfEmpty(customer);
            validateLastNameIfEmpty(customer);
            customerDal.add(customer);
        }
        public void addByOtherBusiness(Customer customer) throws Exception {
            /*
            bir nesneyi değer atarken diğer nesnelere nazaran farklı bir şekilde atanılması isteniyorsa
            veya farklı bir şekilde iş katmanı yapılması isteniyorsa temel ekleme fonksiyonu değiştirmek yerine
            ona özel farklı bir fonksiyon tanımlayarak bu sorun çözülebilir.
            Böylelikle hem ad,soyad,tcno doğrulamasını çözmüş olduk
            hemde bir nesne için özel istenen kuralı tanımlamış olduk
             */
            validateFirstNameLength(customer);
            validateIdentityIfEmpty(customer);
            validateFirstNameIfEmpty(customer);
            validateLastNameIfEmpty(customer);
            customerDal.add(customer);
        }
        private void validateFirstNameIfEmpty(Customer customer) throws  Exception{

            if(customer.firstName.isEmpty()) {

                throw new Exception("Validasyon hatası oldu");
            }
        }
        private void validateLastNameIfEmpty(Customer customer) throws  Exception{

            if(customer.lastName.isEmpty()) {

                throw new Exception("Validasyon hatası oldu");
            }
        }
        private void validateIdentityIfEmpty(Customer customer) throws  Exception{

            if(customer.identityNumber.isEmpty()) {

                throw new Exception("Validasyon hatası oldu");
            }
        }
        private void validateFirstNameLength(Customer customer) throws  Exception{

            if(customer.firstName.length() < 2) {

                throw new Exception("Validasyon hatası oldu");
            }
        }
    }
    static class CustomerDal{
        public void add(Customer customer){
            System.out.println("Eklendi");
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
