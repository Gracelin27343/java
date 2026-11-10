package Polymorphism.runtime;

public class Advanceupi extends UPIpament{
//usiig @overiide means it is method overloading
    @Override
    public void pay() {
        super.pay();
        System.out.println("Paying with advanced UPI like BHIM UPI");
    }

    @Override
    public void cancelpayment() {
        super.cancelpayment();
        System.out.println("cancel BHIM UPI");
    }
}
