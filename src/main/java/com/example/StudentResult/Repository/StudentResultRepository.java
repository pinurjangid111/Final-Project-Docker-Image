package com.example.StudentResult.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.example.StudentResult.Domain.StudentResult;
 
 
@Repository
public interface StudentResultRepository extends JpaRepository<StudentResult, Long> {
 
}