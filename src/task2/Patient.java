package task2;

import java.util.ArrayList;
import java.util.Scanner;
class Patient {
    private String id;
    private String name;
    private int age;
    private String address;
    private String phone;
    private String medicalHistory;

    public Patient(String id, String name, int age, String address, String phone, String medicalHistory) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.medicalHistory = medicalHistory;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }
    public String getMedicalHistory() { return medicalHistory; }

    @Override
    public String toString() {
        return "Patient[ID=" + id + ", Name=" + name + ", Age=" + age + ", Address=" + address + ", Phone=" + phone + "]";
    }
}

// Doctor class to manage doctor details
class Doctor {
    private String id;
    private String name;
    private String specialization;

    public Doctor(String id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getSpecialization() { return specialization; }

    @Override
    public String toString() {
        return "Doctor[ID=" + id + ", Name=" + name + ", Specialization=" + specialization + "]";
    }
}

// Appointment class to manage appointments
class Appointment {
    private String appointmentId;
    private Patient patient;
    private Doctor doctor;
    private String appointmentDate;

    public Appointment(String appointmentId, Patient patient, Doctor doctor, String appointmentDate) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentDate = appointmentDate;
    }

    @Override
    public String toString() {
        return "Appointment[ID=" + appointmentId + ", Patient=" + patient.getName() + ", Doctor=" + doctor.getName() + ", Date=" + appointmentDate + "]";
    }
}

// MedicalRecord class to manage Electronic Health Records (EHR)
class MedicalRecord {
    private String recordId;
    private Patient patient;
    private String diagnosis;
    private String treatment;
    private String date;

    public MedicalRecord(String recordId, Patient patient, String diagnosis, String treatment, String date) {
        this.recordId = recordId;
        this.patient = patient;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.date = date;
    }

    @Override
    public String toString() {
        return "MedicalRecord[ID=" + recordId + ", Patient=" + patient.getName() + ", Diagnosis=" + diagnosis + ", Treatment=" + treatment + ", Date=" + date + "]";
    }
}

// Billing class to manage billing and invoices
class Billing {
    private String billId;
    private Patient patient;
    private String service;
    private double amount;

    public Billing(String billId, Patient patient, String service, double amount) {
        this.billId = billId;
        this.patient = patient;
        this.service = service;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Billing[ID=" + billId + ", Patient=" + patient.getName() + ", Service=" + service + ", Amount=" + amount + "]";
    }
}

// Inventory class to manage medical supplies
class Inventory {
    private String itemId;
    private String itemName;
    private int quantity;
    private double price;

    public Inventory(String itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Inventory[ID=" + itemId + ", Name=" + itemName + ", Quantity=" + quantity + ", Price=" + price + "]";
    }
}

// Staff class to manage hospital staff details
class Staff {
    private String staffId;
    private String name;
    private String role;
    private double salary;

    public Staff(String staffId, String name, String role, double salary) {
        this.staffId = staffId;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff[ID=" + staffId + ", Name=" + name + ", Role=" + role + ", Salary=" + salary + "]";
    }
}
