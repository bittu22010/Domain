package ClassSpringBootSecurity.service;

	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import ClassSpringBootSecurity.model.StudentBean;
import ClassSpringBootSecurity.repository.StudentRepository;

	@Configuration
	public class StudentService {
		
		@Autowired
		private StudentRepository studnetRepo;

		public StudentBean createStudent(StudentBean student) {
			
			return studnetRepo.save(student);
		}

		public List<StudentBean> createallStudent(List<StudentBean> students) {
			
			return studnetRepo.saveAll(students);
		}

		
	}


