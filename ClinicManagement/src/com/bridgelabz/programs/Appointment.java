package com.bridgelabz.programs;

import com.bridgelabz.programs.NodeCreation;
import com.bridgelabz.programs.PatientDetails;

@SuppressWarnings("rawtypes")
public class Appointment {
	String[] docsNames = { "Dr. Joshi", "Dr. Patel", "Dr. Naved", "Dr. Desai", "Dr. Jeet" };
	int id;
	NodeCreation[] table = new NodeCreation[5];
	NodeCreation head, temp, entry;

	// table of Doctors
	public Appointment() {
		for (int i = 0; i < 5; i++)
			table[i] = null;
	}

	// Arranging the appointments according to doctors availability
	@SuppressWarnings("unchecked")
	public void takeAppoinment(PatientDetails patient, int id) {
		try {
			this.id = id;
			int num = id - 1;
			int count = 1;
			if (table[num] == null) {
				table[num] = new NodeCreation();
				table[num].setData(docsNames[num]);
				head = table[num];
				// System.out.println(table[num].getData());
			}
			head = table[num];
			temp = head;

			// Checking for total appointments
			while (temp.getNext() != null) {
				temp = temp.getNext();
				count++;
			}

			// if appointments for particular doctor are 5 then no further
			// appointments
			if (count <= 5) {
				head = table[num];
				temp = head;
				entry = new NodeCreation();
				entry.setData(patient);
				System.out.println("Appointment successfull for " + docsNames[num]);
				while (temp.getNext() != null) {
					temp = temp.getNext();
				}
				temp.setNext(entry);
			}

			else {
				System.out.println("Sorry Todays Appointment for " + docsNames[num] + " is not available ");
			}
			// new Patient().printPatient((Patient)temp.getNext().getData());
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Doctor's ID is Wrong!!");
		}

	}// end of takeApppointment

	// showing total appointments in clinic
	public void showAppointments() {
		for (int i = 0; i < 5; i++) {
			System.out.print("\n" + docsNames[i] + ": ");
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
	}// end of showTable
}
