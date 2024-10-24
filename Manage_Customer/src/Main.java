public class Main {
    public static void main(String[] args) {
      Manage customer = new Manage();
      customer.enterCustomer();
      customer.display();
        System.out.println("Finding by name: ");
        customer.findByname("Nguyen Tu Anh");
        System.out.println("Finding by address");
        customer.findByaddress("Ha Noi");
    }
}