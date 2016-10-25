package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;
import java.util.ArrayList;

public class PatientDetails{
	Utility u = new Utility();
	String name,mobileNo;
	int id,age;
		
	public PatientDetails(){}
		public PatientDetails(String name,int id,String mobileNo,int age){
		this.name = name;
		this.id = id;
		this.mobileNo = mobileNo;
		this.age = age;
	}
	
	//Display Data for One Patient
	public void printPatient(PatientDetails patient)
	{
		System.out.println("\nPatient's Details are:");
		System.out.println("Name : "+patient.name);
		System.out.println("ID : "+patient.id);
		System.out.println("MobileNo : "+patient.mobileNo);
		System.out.println("age : "+patient.age +"\n");
	}

	//Display list of patients
	public void listOfPatients(ArrayList<PatientDetails> patients){
		for(PatientDetails info : patients){
			System.out.println("Name : "+info.name);
			System.out.println("ID : "+info.id);
			System.out.println("MobileNo : "+info.mobileNo);
			System.out.println("age : "+info.age +"\n");
		}
	}

	//search method for particular data.
	public void searchPatient(ArrayList<PatientDetails> patients){
		System.out.println("1.Name\n2.ID\n3.Mobile Number");
		int choice = u.inputInteger();
		switch(choice){
			case 1:{
				System.out.print("Please enter Name to Search: ");
				String nameSearch = u.inputString();
				this.searchByName(patients,nameSearch);
				break;
			}
			case 2:{
				System.out.print("Please Enter ID: ");
				int idSearch = u.inputInteger();
				this.searchById(patients,idSearch);
				break;
			}
			case 3:{
				System.out.print("Please Enter Mobile Number for search: ");
				String spSearch = u.inputString();
				this.searchByNumber(patients,spSearch);
				break;
			}
			default:{
				System.out.println("Entered Wrong Choice");
			}
		}//end of switch	
	}//end of searchPatient

	//Searching for name
	public void searchByName(ArrayList<PatientDetails> patients,String name){
		int count=0;
		for(PatientDetails patient : patients){
			if(name.equals(patient.name)){
				this.printPatient(patient);
				count++;
			}
		}
		if(count==0)
			System.out.println("Sorry Patient for given name not found");
	}//end method

	//searching for id
	public void searchById(ArrayList<PatientDetails> patients,int id){
		int count = 0;
		for(PatientDetails patient : patients){
			if(id == patient.id){
				this.printPatient(patient);
				count++;
			}
		}
		if(count==0)
			System.out.println("Sorry Patient for given id not found");
	}

	//searching for number
	public void searchByNumber(ArrayList<PatientDetails> patients, String number){
		int count = 0;
		for(PatientDetails patient : patients){
			if(number.equals(patient.mobileNo)){
				this.printPatient(patient);
				count++;
			}
		}
		if(count==0)
			System.out.println("Sorry Patient for given number not found");
	}
}