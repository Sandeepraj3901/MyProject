package org.example.newspring.Service;

import org.example.newspring.Controller.SoftwareEngineerRepository;
import org.example.newspring.Entity.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {

    public static SoftwareEngineerRepository softwareEngineerRepository = null;
    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository) {
        this.softwareEngineerRepository = softwareEngineerRepository;

    }
    public static List<SoftwareEngineer> getALLSoftwareEngineers(){
        return softwareEngineerRepository.findAll();
    }
}
