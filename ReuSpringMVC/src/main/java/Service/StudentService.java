package Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import model.Student;

@Service 
public class StudentService {
	
	List<Student> students =new ArrayList<>( Arrays.asList(new Student(1,"Reuben", "Java"),
			new Student(2,"Contrader","Software"),
			new Student(3, "Reuben", "Pyhton")
	));
	
	public List<Student> getAllStudents() {
		
		return students;
		
	}
	
	public Student getStudentById(String id) {
		Student s = students.stream()
				
				.filter(student  -> id.equals(student.getId()) )
				.findAny()
				.orElse(null);
			
				return s;	
	}

	public void addStudent(Student student) {
		students.add(student);
		
	}
		
	
	
}
