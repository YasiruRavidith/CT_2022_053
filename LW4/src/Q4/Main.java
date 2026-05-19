package Q4;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("Amal Perera", "0771234567");
        Bicycle bicycle = new Bicycle(owner);

        System.out.println("Bicycle owner details:");
        System.out.println("Name: " + bicycle.getOwner().getOwnerName());
        System.out.println("Phone: " + bicycle.getOwner().getPhoneNo());
    }
}
