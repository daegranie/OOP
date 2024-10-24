
import java.util.ArrayList;
import java.util.Scanner;

public class Manage {
    private ArrayList <Customer> customerList = new ArrayList<>();
    private int SoKH;

    public Manage(){
        this.SoKH = 0;
    }
//Phuong thuc nhap danh sach khach hang.
    public void enterCustomer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter list of Customer: ");
        SoKH = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < SoKH; i++){
            System.out.print("Enter Firstname: ");
            String firstname = sc.nextLine();
            System.out.print("Enter Lastname: ");
            String lastname = sc.nextLine();
            System.out.print("Enter Address: ");
            String address = sc.nextLine();
            Customer cs = new Customer(firstname, lastname, address);
            customerList.add(cs);
        }
    }

    public void display(){
        for(Customer cs : customerList){
            System.out.println("Name: " + cs.getFullname());
            System.out.println("Address: " + cs.getAddress());
            System.out.println("Email: " + cs.getEmail());
        }
    }
    public void findByname(String fullname){
        for(Customer cs : customerList){
            if(cs.getFirstname().equalsIgnoreCase(fullname) || cs.getLastname().equalsIgnoreCase(fullname)){
                System.out.println("Name: " + cs.getFullname());
                System.out.println("Address: " + cs.getAddress());
                System.out.println("Email: " + cs.getEmail());
            }
        }
    }

    public void findByaddress(String address){
        for(Customer cs : customerList){
            if(cs.getAddress().equalsIgnoreCase(address)){
                System.out.println("Name: " + cs.getFullname());
                System.out.println("Address: " + cs.getAddress());
                System.out.println("Email: " + cs.getEmail());
            }
        }
    }
}
