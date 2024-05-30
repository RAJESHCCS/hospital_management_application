package com.Hospital_management_application.hospital_managment_application.service;

import com.Hospital_management_application.hospital_managment_application.model.Patient;
import com.Hospital_management_application.hospital_managment_application.repository.PatientRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepostory patientRepostory;
    @GetMapping("/addPatient")
    public String savePatientDetails(Patient patient) {
        return null;
    }

    public List<Patient> getPatientDetails(Integer patientId) {
        return null;
    }

    public String validatePatientAge(Integer age) throws Exception {

        if(age<18){
//            return "this is not valid patient";
            throw  new Exception("enter the valid age");
        }
        return "Age is"+ age+ "and safe to give dose";

    }
}
