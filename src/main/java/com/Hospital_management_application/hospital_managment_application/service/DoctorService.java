package com.Hospital_management_application.hospital_managment_application.service;

import com.Hospital_management_application.hospital_managment_application.model.Doctor;
import com.Hospital_management_application.hospital_managment_application.repository.DoctorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Slf4j
@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;
    public String addDoctor(Doctor doctor)  {
        try {
            String result = doctorRepository.saveDetails(doctor);
            return result;
        }
        catch (Exception e)
        {   return e.getMessage();}
    }

    public String getDocswithmaxexp() throws Exception  {
            // from repo we got the data
        List<Doctor> doctorList = doctorRepository.getAlldoctor();

        int exp=0;
        String docName= " ";
        for(Doctor doctor : doctorList){
            if(doctor.getExperience() > exp){
                log.trace("We are comparing level and experience ");
                if(doctor.getName().compareTo(docName)>0) {
                    docName = doctor.getName();
                }
            }
            if(doctor.getExperience()>exp){
                exp = doctor.getExperience();
                docName = doctor.getName();

            }
        }
        return docName;
    }

    public List<Doctor> getDoctordetailswithDegree(String degree) {
        List<Doctor> doctorList = doctorRepository.getAlldoctor();
        List<Doctor> finalAnsList = new ArrayList<>();


        for(Doctor doctor : doctorList){
            if(doctor.getDegree().equals(degree)){
                finalAnsList.add(doctor);
            }
        }
        return finalAnsList;
        }
    }

