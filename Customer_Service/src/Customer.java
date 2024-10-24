import java.util.Scanner;

public class Customer {
    private String name;
    private String address;
    private String email;

    public Customer(){

    }
    public Customer(String name, String address, String email){
        this.name = name;
        this.address = address;
        this.email = email;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public static String setInformation(){
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine().trim().toLowerCase();
        return s;
    }
    public void enterInformation(){
        System.out.print("Enter name: ");
        setName(setInformation());
        System.out.print("Enter address: ");
        setAddress(setInformation());
        System.out.print("Enter email: ");
        setEmail(setInformation());
    }
    public void display(){
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Email: " + getEmail());
    }
}
