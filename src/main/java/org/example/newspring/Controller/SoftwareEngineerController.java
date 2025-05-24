package org.example.newspring.Controller;

import org.example.newspring.Entity.SoftwareEngineer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineer")
public class SoftwareEngineerController {
    @GetMapping
    public List<SoftwareEngineer> getSoftwareEngineer(){

        return List.of(new SoftwareEngineer(1,"Raj",33,"Texas","Spring Boot"),
                new SoftwareEngineer(2,"Sandy",31,"Texas","Java"));


    }
}
