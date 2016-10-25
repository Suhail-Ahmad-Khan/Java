package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;
import java.util.ArrayList;
import java.util.Random;

public class DoctorDetails {

	Utility u = new Utility();
	String name, specialization, availability;
	int id;

	public DoctorDetails() {
	}

	// Parameterized constructor
	public DoctorDetails(String name, int id, String specialization, String availability) {
		this.name = name;
		this.id = id;
		this.specialization = specialization;
		this.availability = availability;
	}

	// displaying info for single doctor
	public void printDoctor(DoctorDetails d) {
		System.out.println("Name : " + d.name);
		System.out.println("ID : " + d.id);
		System.out.println("Specialization : " + d.specialization);
		System.out.println("Availability : " + d.availability + "\n");
	}

	// Displaying List of Doctors
	public void listOfDoctors(ArrayList<DoctorDetails> doctors) {
		for (DoctorDetails info : doctors) {
			System.out.println("Name : " + info.name);
			System.out.println("ID : " + info.id);
			System.out.println("Specialization : " + info.specialization);
			System.out.println("Availability : " + info.availability + "\n");
		}
	}

	// search method for Doctor
	public void searchDoctor(ArrayList<DoctorDetails> doctors) {
		System.out.println("1.Name\n2.ID\n3.Specilization\n4.Availability");
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
		}// end of switch
	}// end of searchDoctor

	// search by name
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

	// searching doctor by id
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

	// searching Doctor by specialization
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

	// searching Doctor by availability
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

	// To search popular doctor
	public void popularDoctor(ArrayList<DoctorDetails> doctors) {
		Random r = new Random();
		int num = r.nextInt(5);
		System.out.println("Popular Doctor in Clinic:");
		this.searchById(doctors, (num + 1));
	}
}