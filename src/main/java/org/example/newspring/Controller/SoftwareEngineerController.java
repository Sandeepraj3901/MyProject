package org.example.newspring.Controller;

import org.example.newspring.Entity.*;
import org.example.newspring.Service.SoftwareEngineerService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.example.newspring.Service.SoftwareEngineerService.*;

@RestController
@RequestMapping("api/v1/software-engineer")
public class SoftwareEngineerController {
    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping
    public List<SoftwareEngineer> getSoftwareEngineer(){
        return SoftwareEngineerService.getALLSoftwareEngineers();

    }
    @PostMapping
    public void  addNewSoftwareEngineer(@RequestBody SoftwareEngineer softwareEngineer){
        softwareEngineerService.insertSoftwareEngineer( softwareEngineer);
    }
    @GetMapping("{id}")
    public SoftwareEngineer getSoftwareEngineerId(@PathVariable Integer id){
        return SoftwareEngineerService.getSoftwareEgineerbyID(id);

    }
}
