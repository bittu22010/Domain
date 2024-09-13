package com.SpringFacultyCourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SpringFacultyCourse.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
