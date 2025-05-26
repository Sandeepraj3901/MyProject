package org.example.newspring.Controller;

import org.example.newspring.Entity.SoftwareEngineer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoftwareEngineerRepository extends JpaRepository<SoftwareEngineer, Integer> {
}
