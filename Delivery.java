package inharitance;

public class Delivery implements Amazon,Newlook,Zara{


    @Override
    public void freedelivery() {
        System.out.println("free delivery");
    }

    @Override
    public void freedelivary() {
        System.out.println("free delivery");

    }

    @Override
    public void freegiftonbirthday() {
        System.out.println("free gift on birthday");

    }
}
