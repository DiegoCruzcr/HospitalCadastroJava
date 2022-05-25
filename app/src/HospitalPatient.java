package com.java;

public class HospitalPatient extends Hospital {
	//attributes 
	private String PatientName;
	private int PatientAge;
	private int Patient_ID;
	private String PatientAddres;
	
	public static void main(String[] args) {
		//instance of HospitalPaciente
		HospitalPatient Patient = new HospitalPatient();
		//set the values
		Patient.setPatientAge(19);
		Patient.setPatientName("Diego");
		Patient.setPatient_ID(16325423);
		Patient.setPatientAddres("Rua rui de moraes apocalipse 312");
		//get the values Patient
		System.out.println("---------------------------------");
		Patient.getPatientAge();
		Patient.getPatientName();
		Patient.getPatient_ID();
		Patient.getPatientAddres();
		System.out.println("---------------------------------");
		//get the values Hospital
		System.out.println("---------------------------------");
		Patient.getHospitalUnitName();
		Patient.getHospitalUnitPhone();
		Patient.getHospitalUnitAddres();
		System.out.println("---------------------------------");
	}
	//receiving arguments and set in the attributes

	public void setPatientAddres(String addres) {
		this.PatientAddres = addres;
	}
	
	public void setPatientName(String name) {
		this.PatientName = name;
	}
	public void setPatientAge(int age) {
		this.PatientAge = age;
	}
	public void setPatient_ID(int ID_Number) {
		this.Patient_ID = ID_Number;
	}
	public String getPatientName() {
		System.out.println(PatientName);
		return PatientName;
	}
	//return values
	public int getPatientAge() {
		System.out.println(PatientAge);
		return PatientAge;
	}
	public int getPatient_ID() {
		System.out.println(Patient_ID);
		return Patient_ID;
	}
	public String getPatientAddres() {
		System.out.println(PatientAddres);
		return PatientAddres;
	}


}
