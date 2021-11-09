package com.company;
/*
interface öngörüsü 
 */

public class InterfaceSegregeation {
    public static void main(String[] args) {

    }
    interface IEatable{

        void ProvideFood();

    }
    interface IPayable{
        void PaySalary();

    }
    interface IWorkable{

        void Work();
    }
    class CompanyWorker implements IWorkable,IEatable,IPayable{

        @Override
        public void PaySalary() {

        }

        @Override
        public void ProvideFood() {

        }

        @Override
        public void Work() {

        }
    }
    class OutSourceWorker implements IWorkable,IPayable{

        @Override
        public void PaySalary() {

        }


        @Override
        public void Work() {

        }
    }
    class Robot implements IPayable{

        @Override
        public void PaySalary() {

        }


    }

}
