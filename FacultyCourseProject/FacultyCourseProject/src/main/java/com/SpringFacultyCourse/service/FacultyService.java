package com.SpringFacultyCourse.service;

import com.SpringFacultyCourse.model.Faculty;
import com.SpringFacultyCourse.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FacultyService {

    @Autowired
    private FacultyRepository facultyRepository;

    public List<Faculty> getAllFaculties() {
        return facultyRepository.findAll();
    }

    public Faculty saveFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public Faculty getFacultyById(int id) {
        return facultyRepository.findById(id).orElse(null);
    }

    public void deleteFaculty(int id) {
        facultyRepository.deleteById(id);
    }
}
