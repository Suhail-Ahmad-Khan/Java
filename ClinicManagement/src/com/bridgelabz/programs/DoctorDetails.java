package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;
import java.util.ArrayList;
import java.util.Random;

public class DoctorDetails {

	Utility u = new Utility();
	String name, specialization, availability;
	int id;

	// DEFAULT CONSTRUCTOR
	public DoctorDetails() {
	}

	// PARAMETERIZED CONSTRUCTOR
	public DoctorDetails(String name, int id, String specialization, String availability) {
		this.name = name;
		this.id = id;
		this.specialization = specialization;
		this.availability = availability;
	}

	// DISPLAY DOCTOR DETAILS
	public void printDoctor(DoctorDetails d) {
		System.out.println("Name : " + d.name);
		System.out.println("ID : " + d.id);
		System.out.println("Specialization : " + d.specialization);
		System.out.println("Availability : " + d.availability + "\n");
	}

	// DISPLAY LIST OF DOCTORS
	public void listOfDoctors(ArrayList<DoctorDetails> doctors) {
		for (DoctorDetails info : doctors) {
			System.out.println("Name : " + info.name);
			System.out.println("ID : " + info.id);
			System.out.println("Specialization : " + info.specialization);
			System.out.println("Availability : " + info.availability + "\n");
		}
	}

	// SEARCHING FOR A DOCTOR
	public void searchDoctor(ArrayList<DoctorDetails> doctors) {
		System.out.println("1. Name");
		System.out.println("2. ID");
		System.out.println("3. Specilization");
		System.out.println("4. Availability");
		int choice = u.inputInteger();
		switch (choice) {
		case 1: {
			System.out.print("Please enter Name to Search: ");
			String nameSearch = u.inputString();
			this.searchByName(doctors, nameSearch);
			break;
		}
		case 2: {
			System.out.print("Please Enter ID: ");
			int idSearch = u.inputInteger();
			this.searchById(doctors, idSearch);
			break;
		}
		case 3: {
			System.out.print("Please Enter Specilization for search: ");
			String spSearch = u.inputString();
			this.searchBySpecilization(doctors, spSearch);
			break;
		}
		case 4: {
			System.out.print("Please Enter Morning or Evening: ");
			String available = u.inputString();
			this.searchByAvailability(doctors, available);
			break;
		}
		default: {
			System.out.println("Entered Wrong Choice");
		}
		}
	}

	// SEARCHING BY NAME
	public void searchByName(ArrayList<DoctorDetails> doctors, String name) {
		int count = 0;
		for (DoctorDetails doctor : doctors) {
			if (name.equals(doctor.name)) {
				this.printDoctor(doctor);
				count++;
			}
		}
		if (count == 0)
			System.out.println("Sorry Doctor for given name not found");
	}

	// SEARCING BY ID
	public void searchById(ArrayList<DoctorDetails> doctors, int id) {
		int count = 0;
		for (DoctorDetails doctor : doctors) {
			if (id == doctor.id) {
				this.printDoctor(doctor);
				count++;
			}
		}
		if (count == 0)
			System.out.println("Sorry Doctor for given id not found");

	}

	// SEARCHING BY SPECIALIZATION
	public void searchBySpecilization(ArrayList<DoctorDetails> doctors, String specialization) {
		int count = 0;
		for (DoctorDetails doctor : doctors) {
			if (specialization.equals(doctor.specialization)) {
				this.printDoctor(doctor);
				count++;
			}
		}
		if (count == 0)
			System.out.println("Sorry Doctor for given specialization not found");
	}

	// SEARCHING BY AVAILABILITY
	public void searchByAvailability(ArrayList<DoctorDetails> doctors, String availability) {
		int count = 0;
		for (DoctorDetails doctor : doctors) {
			if (availability.equals(doctor.availability)) {
				this.printDoctor(doctor);
				count++;
			}
		}
		if (count == 0)
			System.out.println("Sorry Doctor for given availability not found");
	}

	// SEARCHING A POPULAR DOCTOR
	public void popularDoctor(ArrayList<DoctorDetails> doctors) {
		Random r = new Random();
		int num = r.nextInt(5);
		System.out.println("Popular Doctor in Clinic:");
		this.searchById(doctors, (num + 1));
	}
}
