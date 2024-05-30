package com.Hospital_management_application.hospital_managment_application.controller;

import com.Hospital_management_application.hospital_managment_application.model.Patient;
import com.Hospital_management_application.hospital_managment_application.service.PatientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.ParameterizedType;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/patient")

public class PatientController {
    @Autowired
    private PatientService patientService;
    @PostMapping("/addPatient")
    public HttpEntity savePatient(@RequestBody Patient patient){
        String name = patientService.savePatientDetails(patient);
        return new ResponseEntity(name, HttpStatus.OK);
    }
    @GetMapping("/getPatient")
    public List<Patient> getPatientDetails(@RequestParam("pid") Integer patientId){
        return patientService.getPatientDetails(patientId);
//        return patient;
    }
//    public  HttpEntity getPatientDetails(@RequestParam("pid") Integer patientId){
//        List ans = patientService.getPatientDetails(patientId);
//        return new ResponseEntity(ans,HttpStatus.OK);
//    }

    @GetMapping("validateAge")
    public String validateAge(@RequestParam("age") Integer age){

        try{
            String  result = patientService.validatePatientAge(age);
            return result;
//            if(result){
//                return new ResponseEntity(result,HttpStatus.OK);
            }
            catch(Exception e){
//                return new ResponseEntity(result,HttpStatus.BAD_REQUEST);
                log.error("age entered was incorrect");
                return e.getMessage();
            }

        }
    }



