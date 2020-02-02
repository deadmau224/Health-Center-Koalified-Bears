package com.kolafied.bears.HealthCare.dao;

import com.kolafied.bears.HealthCare.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorDao extends JpaRepository<Doctor, Long> {
}
