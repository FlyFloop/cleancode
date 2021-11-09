package com.company;
/*
her bir metod kavram etc sadece bir iş yapmalıdır
 */
public class SingleResponsibility {
    public static void main(String[] args) {

    }
    class CustomerManager{
        public void TransactionalOperation(){
            Insert();
            Update();
        }
        private void Insert(){
            MyContext myContext = new MyContext();
            myContext.Insert();
        }
        private void Update(){
            MyContext myContext = new MyContext();
            myContext.Update();
        }
    }
    class PersonManager{
        public void Add(){
            CustomerManager customerManager = new CustomerManager();

        }

    }

    class MyContext{

        public void Update() {
        }
        public void Insert() {
        }
    }
}
