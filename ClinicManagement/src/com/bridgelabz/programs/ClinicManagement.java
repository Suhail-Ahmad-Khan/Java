package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;
import com.bridgelabz.programs.DoctorDetails;
import com.bridgelabz.programs.PatientDetails;
import com.bridgelabz.programs.Appointment;
import java.util.ArrayList;

public class ClinicManagement {

	public static void main(String[] args) {
		Utility u = new Utility();
		int patientId = 1;
		Appointment appointment = new Appointment();

		ArrayList<DoctorDetails> doctors = new ArrayList<DoctorDetails>();
		ArrayList<PatientDetails> patients = new ArrayList<PatientDetails>();

		// CREATING LIST OF DOCTORS
		DoctorDetails doctor1 = new DoctorDetails("Dr. Dalvi", 1, "Heart", "Morning/Evening");
		DoctorDetails doctor2 = new DoctorDetails("Dr. Saleem", 2, "Brain", "Morning");
		DoctorDetails doctor3 = new DoctorDetails("Dr. Kazi", 3, "Ear", "Morning/Evening");
		DoctorDetails doctor4 = new DoctorDetails("Dr. Azgaonkar", 4, "Eyes", "Evening");
		DoctorDetails doctor5 = new DoctorDetails("Dr. Shergill", 5, "Gynaecologist", "Morning");

		// ADDING THE LIST TO ARRAYLIST
		doctors.add(doctor1);
		doctors.add(doctor2);
		doctors.add(doctor3);
		doctors.add(doctor4);
		doctors.add(doctor5);

		// CREATING LIST OF PATIENTS
		PatientDetails patient1 = new PatientDetails("Mr. Kamble", patientId, "9087645342", 28);
		PatientDetails patient2 = new PatientDetails("Ms. Pande", patientId, "8456985426", 22);
		PatientDetails patient3 = new PatientDetails("Mrs. Chadha", patientId, "7545865412", 56);
		PatientDetails patient4 = new PatientDetails("Mr. Patil", patientId, "9846541320", 79);
		PatientDetails patient5 = new PatientDetails("Ms. Jadhav", patientId, "9945653287", 45);
		PatientDetails patient6 = new PatientDetails("Mr. Kavedia", patientId, "8451623084", 39);

		// ADDING THE LIST TO ARRAYLIST
		patients.add(patient1);
		patients.add(patient2);
		patients.add(patient3);
		patients.add(patient4);
		patients.add(patient5);
		patients.add(patient6);

		while (true) {
			System.out.println("\n********** MENU **********\n");
			System.out.println("1. View Doctors List");
			System.out.println("2. View Patients List");
			System.out.println("3. Search Doctor Details");
			System.out.println("4. Search Patient Details");
			System.out.println("5. Take an Appoinment");
			System.out.println("6. Show All Appointments");
			System.out.println("7. Popular Doctor");
			System.out.println("8. Exit");
			System.out.print("Enter your Choice: ");
			int choice = u.inputInteger();
			System.out.println("\n");

			switch (choice) {

			case 1:
				System.out.println("List Of Doctors:");
				new DoctorDetails().listOfDoctors(doctors);
				break;

			case 2:
				System.out.println("List of Patients:");
				new PatientDetails().listOfPatients(patients);
				break;

			case 3:
				System.out.println("Search Doctor By:");
				new DoctorDetails().searchDoctor(doctors);
				break;

			case 4:
				System.out.println("Search Patient By:");
				new PatientDetails().searchPatient(patients);
				break;

			case 5:
				patientId++;
				System.out.print("Please Enter Patient's Name: ");
				String name = u.inputString();
				System.out.print("Please Enter Phone number: ");
				String number = u.inputString();
				System.out.print("Please Enter Age: ");
				int age = u.inputInteger();

				PatientDetails newPatient = new PatientDetails(name, patientId, number, age);
				patients.add(newPatient);

				System.out.print("Please enter Doctors id: ");
				int docId = u.inputInteger();
				appointment.takeAppoinment(newPatient, docId);
				break;

			case 6:
				appointment.showAppointments();
				break;

			case 7:
				new DoctorDetails().popularDoctor(doctors);
				break;

			case 8:
				System.out.println("Program Terminated");
				return;

			default:
				System.out.println("Wrong Choice!!");
				break;
				
			}// end of switch
		} // end of while
	}
}