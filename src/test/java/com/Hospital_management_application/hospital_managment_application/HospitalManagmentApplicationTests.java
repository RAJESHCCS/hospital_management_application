package com.Hospital_management_application.hospital_managment_application;

import com.Hospital_management_application.hospital_managment_application.model.Patient;
import com.Hospital_management_application.hospital_managment_application.repository.PatientRepostory;
import com.Hospital_management_application.hospital_managment_application.service.PatientService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class HospitalManagmentApplicationTests {
//	@Test
//	void contextLoads() {
//	}
	@Mock
	private PatientRepostory patientRepostory;

	@InjectMocks
//	private  PatientService patientService;
	public PatientService serviceLayerobj = new PatientService();

	@Test
	public void testGetOldestPatientName(){

		Patient p1 = new Patient(1,"p1",10,"abc");
		Patient p2 = new Patient(2,"p2",12,"mno");
		Patient p3 = new Patient(3,"p3",13,"efg");
		List<Patient> patientList = new ArrayList<>();
		patientList.add(p1);
		patientList.add(p2);
		patientList.add(p3);
		//expected o/p p3
		String expectingOutput = "p3";
		String actualOutput = serviceLayerobj.getOldestPatientName(patientList);

		assert (actualOutput == expectingOutput);
	}
	@Test
	public void testGetOldestPatientWithNoInput(){
		List<Patient> patientDummyData = generateDummyInputData();
		Mockito.when(patientRepostory.getAllPatients()).thenReturn(patientDummyData);

//		String expectedOutput = "p3";
//		String actualOutput = serviceLayerobj.getOldestPatientName(patientDummyData);
//		assert(expectedOutput == actualOutput);

	}
	private List<Patient> generateDummyInputData(){
		Patient p1 = new Patient(1,"p1",10,"abc");
		Patient p2 = new Patient(2,"p2",12,"mno");
		Patient p3 = new Patient(3,"p3",13,"efg");

		List<Patient> patientList = new ArrayList<>();
		patientList.add(p1);
		return patientList;
	}

}
