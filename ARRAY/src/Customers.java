import java.util.Scanner;

public class Customers {
   private String hoten;
   private String maKH;
   private String diachi;
   private String email;

   public Customers(){

   }

   public Customers(String ht, String dc, String mkh, String e){
       hoten = ht;
       maKH = mkh;
       diachi = dc;
       email = e;
   }
   public static String getInformation(){
       String s;
       Scanner sc = new Scanner(System.in);
       s = sc.nextLine();
       s = s.trim();
       s = s.toLowerCase();
       return s;
   }

   public void NhapKH(){
       String str;
       System.out.print("-Ho ten: ");
       str = getInformation();
       this.hoten = str;
       System.out.print("-Dia chi: ");
       str = getInformation();
       this.diachi = str;
       System.out.print("-Ma KH:");
       str = getInformation();
       this.maKH = str;
       System.out.print("-Email: ");
       str = getInformation();
       this.email = str;
   }
   public  void InKH(){
       System.out.println("--Ho ten: " + this.hoten);
       System.out.println("--Dia chi: " + this.diachi);
       System.out.println("--Ma KH:" + this.maKH);
       System.out.println("--Email: " + this.email);
   }

}
