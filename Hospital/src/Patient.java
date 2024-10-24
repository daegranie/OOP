import java.util.ArrayList;
import java.util.Scanner;

public class Patient {
    private String name;
    private String age;
    private String code;
    private String history;
    private String diagnosis;

    public Patient() {

    }

    public Patient(String name, String age, String code, String history, String diagnosis) {
        this.name = name;
        this.age = age;
        this.code = code;
        this.history = history;
        this.diagnosis = diagnosis;
    }

    public void setPatient(String name, String age, String code, String history, String diagnosis) {
        this.name = name;
        this.age = age;
        this.code = code;
        this.history = history;
        this.diagnosis = diagnosis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public static String setInformation() {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine().toUpperCase().trim();
        return s;
    }

    public void getInformation() {
        System.out.print("Enter patient's name: ");
        setName(setInformation());
        System.out.print("Enter patient's age: ");
        setAge(setInformation());
        System.out.print("Enter patient's code: ");
        setCode(setInformation());
        System.out.print("Enter patient's history: ");
        setHistory(setInformation());
        System.out.print("Enter patient's diagnosis: ");
        setDiagnosis(setInformation());
    }

    public void displayPatients() {
        System.out.println("Patient's name: " + getName());
        System.out.println("Patient's age: " + getAge());
        System.out.println("Patient's code: " + getCode());
        System.out.println("Patient's history: " + getHistory());
        System.out.println("Patient's diagnosis: " + getDiagnosis());
    }
}