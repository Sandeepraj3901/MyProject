package org.example.newspring.Controller;

import org.example.newspring.Entity.*;
import org.example.newspring.Service.SoftwareEngineerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.example.newspring.Service.SoftwareEngineerService.*;

@RestController
@RequestMapping("api/v1/software-engineer")
public class SoftwareEngineerController {
    @GetMapping
    public List<SoftwareEngineer> getSoftwareEngineer(){
        return SoftwareEngineerService.getALLSoftwareEngineers();

    }
}
