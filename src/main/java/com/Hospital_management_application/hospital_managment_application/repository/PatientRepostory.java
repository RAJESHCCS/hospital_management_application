package com.Hospital_management_application.hospital_managment_application.repository;

import com.Hospital_management_application.hospital_managment_application.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class PatientRepostory {
    Map<Integer, Patient> map = new HashMap<>();
}


