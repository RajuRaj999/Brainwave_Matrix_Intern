package task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {
    private static ArrayList<Patient> patients = new ArrayList<>();
    private static ArrayList<Doctor> doctors = new ArrayList<>();
    private static ArrayList<Appointment> appointments = new ArrayList<>();
    private static ArrayList<MedicalRecord> medicalRecords = new ArrayList<>();
    private static ArrayList<Billing> bills = new ArrayList<>();
    private static ArrayList<Inventory> inventoryItems = new ArrayList<>();
    private static ArrayList<Staff> staffMembers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Dummy data for doctors
        doctors.add(new Doctor("Dr01", "Dr. Raj", "Endocrinologists"));
        doctors.add(new Doctor("Dr02", "Dr. Ram", "Gastroenterologists"));

        while (running) {
            System.out.println("==== Hospital Management System ====");
            System.out.println("1. Register Patient");
            System.out.println("2. Schedule Appointment");
            System.out.println("3. Manage EHR");
            System.out.println("4. Billing");
            System.out.println("5. Inventory");
            System.out.println("6. Staff Management");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient ID: ");
                    String pId = scanner.nextLine();
                    System.out.print("Enter Patient Name: ");
                    String pName = scanner.nextLine();
                    System.out.print("Enter Patient Age: ");
                    int pAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Patient Address: ");
                    String pAddress = scanner.nextLine();
                    System.out.print("Enter Patient Phone: ");
                    String pPhone = scanner.nextLine();
                    System.out.print("Enter Medical History: ");
                    String pHistory = scanner.nextLine();

                    patients.add(new Patient(pId, pName, pAge, pAddress, pPhone, pHistory));
                    System.out.println("Patient registered successfully.");
                    break;

                case 2:
                    System.out.print("Enter Appointment ID: ");
                    String aId = scanner.nextLine();
                    System.out.print("Enter Patient ID: ");
                    String patientId = scanner.nextLine();
                    Patient patient = findPatientById(patientId);
                    if (patient == null) {
                        System.out.println("Patient not found!");
                        break;
                    }

                    System.out.println("Select Doctor:");
                    for (Doctor doctor : doctors) {
                        System.out.println(doctor.getId() + ": " + doctor.getName() + " (" + doctor.getSpecialization() + ")");
                    }
                    System.out.print("Enter Doctor ID: ");
                    String doctorId = scanner.nextLine();
                    Doctor doctor = findDoctorById(doctorId);
                    if (doctor == null) {
                        System.out.println("Doctor not found!");
                        break;
                    }

                    System.out.print("Enter Appointment Date: ");
                    String date = scanner.nextLine();

                    appointments.add(new Appointment(aId, patient, doctor, date));
                    System.out.println("Appointment scheduled successfully.");
                    break;

                case 3:
                    System.out.print("Enter Record ID: ");
                    String rId = scanner.nextLine();
                    System.out.print("Enter Patient ID: ");
                    String ehrPatientId = scanner.nextLine();
                    Patient ehrPatient = findPatientById(ehrPatientId);
                    if (ehrPatient == null) {
                        System.out.println("Patient not found!");
                        break;
                    }

                    System.out.print("Enter Diagnosis: ");
                    String diagnosis = scanner.nextLine();
                    System.out.print("Enter Treatment: ");
                    String treatment = scanner.nextLine();
                    System.out.print("Enter Date: ");
                    String recordDate = scanner.nextLine();

                    medicalRecords.add(new MedicalRecord(rId, ehrPatient, diagnosis, treatment, recordDate));
                    System.out.println("Medical record added successfully.");
                    break;

                case 4:
                    System.out.print("Enter Bill ID: ");
                    String billId = scanner.nextLine();
                    System.out.print("Enter Patient ID: ");
                    String billPatientId = scanner.nextLine();
                    Patient billPatient = findPatientById(billPatientId);
                    if (billPatient == null) {
                        System.out.println("Patient not found!");
                        break;
                    }

                    System.out.print("Enter Service: ");
                    String service = scanner.nextLine();
                    System.out.print("Enter Amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();

                    bills.add(new Billing(billId, billPatient, service, amount));
                    System.out.println("Billing information added successfully.");
                    break;

                case 5:
                    System.out.print("Enter Item ID: ");
                    String itemId = scanner.nextLine();
                    System.out.print("Enter Item Name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();

                    inventoryItems.add(new Inventory(itemId, itemName, quantity, price));
                    System.out.println("Inventory item added successfully.");
                    break;

                case 6:
                    // Staff Management
                    System.out.print("Enter Staff ID: ");
                    String staffId = scanner.nextLine();
                    System.out.print("Enter Staff Name: ");
                    String staffName = scanner.nextLine();
                    System.out.print("Enter Role: ");
                    String role = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine();

                    staffMembers.add(new Staff(staffId, staffName, role, salary));
                    System.out.println("Staff member added successfully.");
                    break;

                case 0:
                    running = false;
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
    private static Patient findPatientById(String id) {
        for (Patient patient : patients) {
            if (patient.getId().equals(id)) {
                return patient;
            }
        }
        return null;
    }

    private static Doctor findDoctorById(String id) {
        for (Doctor doctor : doctors) {
            if (doctor.getId().equals(id)) {
                return doctor;
            }
        }
        return null;
    }
}

