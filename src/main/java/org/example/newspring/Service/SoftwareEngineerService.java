package org.example.newspring.Service;

import org.example.newspring.Controller.SoftwareEngineerRepository;
import org.example.newspring.Entity.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SoftwareEngineerService {

    public static SoftwareEngineerRepository softwareEngineerRepository = null;
    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository) {
        this.softwareEngineerRepository = softwareEngineerRepository;

    }
    public static List<SoftwareEngineer> getALLSoftwareEngineers(){
        return softwareEngineerRepository.findAll();
    }

    public static SoftwareEngineer getSoftwareEgineerbyID(Integer id) {
        return (softwareEngineerRepository.findById(id).orElseThrow(() -> new IllegalArgumentException(id + "Not found")));
    }

    public void insertSoftwareEngineer(SoftwareEngineer softwareEngineer) {
        softwareEngineerRepository.save(softwareEngineer);
    }
}
