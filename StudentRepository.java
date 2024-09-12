package ClassSpringBootSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ClassSpringBootSecurity.model.StudentBean;

public interface StudentRepository extends JpaRepository<StudentBean, Integer> {

}
