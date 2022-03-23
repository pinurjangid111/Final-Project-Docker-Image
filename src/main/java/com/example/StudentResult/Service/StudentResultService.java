package com.example.StudentResult.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.StudentResult.Domain.StudentResult;
import com.example.StudentResult.Repository.StudentResultRepository;
 
@Service
public class StudentResultService {
	
	@Autowired
    private StudentResultRepository repo;
	
	public List<StudentResult> listAll() {
        return repo.findAll();
    }
     
    public void save(StudentResult std) {
        repo.save(std);
    }
     
    public StudentResult get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
 
}
