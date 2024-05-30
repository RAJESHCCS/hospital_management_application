package com.Hospital_management_application.hospital_managment_application.repository;

import com.Hospital_management_application.hospital_managment_application.model.Doctor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Repository
public class DoctorRepository {

    Map<Integer,Doctor > map = new HashMap<>();
    public String saveDetails(Doctor doctor) throws Exception
            {
        map.put(doctor.getDocId(),doctor);
        return "Doctor has been added to the DB with docId"+doctor.getDocId();
    }


    public String getDoctordetails(Integer docId) throws Exception{
        Doctor ans = map.get(docId);
        return ans.toString();
    }

    public List<Doctor> getAlldoctor() {
        log.info("We are in repo Layer returning all the doctors ");
        return map.values().stream().toList();
    }
}
