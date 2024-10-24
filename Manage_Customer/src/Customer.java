import java.util.Scanner;

public class Customer {
    private String firstname;
    private String lastname;
    private String age;
    private String address;
    private String email;

    public Customer(String firstname, String lastname, String address){

    }
    // thuộc tính khởi tạo đối tượng khách hàng
    public Customer(String fistname, String lastname, String age, String address, String email){
        this.firstname = fistname;
        this.lastname = lastname;
        this.age = age;
        this.address = address;
        this.email = email;
    }

    // thay đổi thuộc tính khách hàng
    public void Customer(String fistname, String lastname, String age, String address, String email){
        this.firstname = fistname;
        this.lastname = lastname;
        this.age = age;
        this.address = address;
        this.email = email;
    }
    // Tạo các setter và getter
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public void setAge(String age){
        this.age = age;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public String getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    public String getEmail(){
        return email;
    }
    public String getFullname(){
        return firstname + " " + lastname;
    }
    //Nhap thong tin
    public static String setInformation(){
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine().trim().toLowerCase();
        return str;
    }

    public void enterInformation(){
        System.out.print("Enter Fistname: ");
        setFirstname(setInformation());
        System.out.print("Enter Lastname: ");
        setLastname(setInformation());
        System.out.print("Enter Age: ");
        setAge(setInformation());
        System.out.print("Enter Address: ");
        setAddress(setInformation());
        System.out.print("Enter Email: ");
        setEmail(setInformation());
    }
}
