package com.bridgelabz.programs;

import com.bridgelabz.programs.NodeCreation;
import com.bridgelabz.programs.PatientDetails;

@SuppressWarnings("rawtypes")
public class Appointment {
	String[] doctorNames = { "Dr. Dalvi", "Dr. Saleem", "Dr. Kazi", "Dr. Azgaonkar", "Dr. Shergill" };
	int id;
	NodeCreation[] table = new NodeCreation[5];
	NodeCreation head, temp, entry;

	public Appointment() {
		for (int i = 0; i < 5; i++)
			table[i] = null;
	}

	@SuppressWarnings("unchecked")
	public void takeAppointment(PatientDetails patient, int id) {
		try {
			this.id = id;
			int num = id - 1;
			int count = 1;
			if (table[num] == null) {
				table[num] = new NodeCreation();
				table[num].setData(doctorNames[num]);
				head = table[num];
				}
			head = table[num];
			temp = head;

			while (temp.getNext() != null) {
				temp = temp.getNext();
				count++;
			}

			if (count <= 5) {
				head = table[num];
				temp = head;
				entry = new NodeCreation();
				entry.setData(patient);
				System.out.println("Appointment successfull for " + doctorNames[num]);
				while (temp.getNext() != null) {
					temp = temp.getNext();
				}
				temp.setNext(entry);
			}

			else {
				System.out.println("Sorry Todays Appointment for " + doctorNames[num] + " is not available ");
			}
			} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Doctor's ID is Wrong!!");
		}

	}

	public void showAppointments() {
		for (int i = 0; i < 5; i++) {
			System.out.print("\n" + doctorNames[i] + ": ");
			temp = table[i];
			int total = 0;
			if (temp == null)
				System.out.println(" \nTotal Patients: " + total);

			else {
				temp = temp.getNext();
				while (temp != null) {
					total++;
					System.out.print(((PatientDetails) temp.getData()).name + ", ");
					temp = temp.getNext();
				}
				System.out.println("\nTotal patients: " + total);
			}
		}
	}
}
