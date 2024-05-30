package com.Hospital_management_application.hospital_managment_application.controller;

import com.Hospital_management_application.hospital_managment_application.model.Doctor;
import com.Hospital_management_application.hospital_managment_application.service.DoctorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.net.http.HttpResponse;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping("/add")
    public HttpEntity<String> addDoctordetails(@RequestBody Doctor doctor){
        try {
            log.info("We have got the request doctor {}",doctor);
            String result = doctorService.addDoctor(doctor);
             return new ResponseEntity("doctor details has been saved." +result, HttpStatus.CREATED);
        }
        catch(Exception e) {
            return new ResponseEntity("failed to save in details due to "+e.getMessage(),HttpStatus.BAD_REQUEST );
        }

    }
    @GetMapping("/getDocwithmaxexp")
   public HttpEntity docWithMaxexp() throws Exception{
        String name = doctorService.getDocswithmaxexp();

        if(name == "")
            return new ResponseEntity(name,HttpStatus.EXPECTATION_FAILED);
        return new ResponseEntity(name,HttpStatus.OK);

    }
    @GetMapping("/getDocListwithdegree")
    public List<Doctor> getAllDocDetails(@RequestParam("degree") String degree){
        List<Doctor> list = doctorService.getDoctordetailswithDegree(degree);
        return list;
    }

}
