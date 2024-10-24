
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Tạo mảng danh sách bệnh nhân với điều kiện không qua 10 bệnh nhân
        ArrayList<Patient> patientList = new ArrayList<>();
        System.out.println("Enter patient list <No more than 10 patients>: ");
        //Tạo vòng loop bệnh nhân
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter patient number " + (i + 1) + ":");
            Patient patient = new Patient();
            patient.getInformation();
            patientList.add(patient);
            if (i < 9){
                //Chỉ hỏi tiếp nếu chưa đạt tới 10 bệnh nhân
            System.out.println("Do you want add more <Y/N>?");
            String choise = sc.nextLine();
            if (!choise.equalsIgnoreCase("Y")) {
                break;
               }
            }
        }
        System.out.println("Print patientlist: ");
        for (Patient patient : patientList) {
            patient.displayPatients();
        }
        //Kiểm tra mã code của patient
        System.out.println("Enter patient's code to check: ");
        String codetoCheck = sc.nextLine();
        boolean flag = false;
        for(Patient patient : patientList){
            if(patient.getCode().equalsIgnoreCase(codetoCheck)){
                System.out.println("Patient found! " + patient);
                flag = true;
                break;
            }
            if(!flag){
                System.out.println("Patient with code " + codetoCheck + " doesn't exist!");
            }
        }
        System.out.println("Add a new patient: ");
        addPatient(patientList);
    }

    private static void addPatient(ArrayList<Patient> patientList) {
        Patient patient = new Patient();
        patient.getInformation();
        patientList.add(patient);
        System.out.println("Patient add succesfully! ");
        System.out.println("Updated Patietlist: ");
        for(Patient p : patientList){
            System.out.println(p);
        }
    }
}