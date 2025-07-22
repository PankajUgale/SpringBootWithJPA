package in.sp.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.main.entities.Student;
import in.sp.main.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService {

	@Autowired
private StudentRepository studentRepository;	
	
	@Override
	public boolean addStudentDetails(Student std) 
	{
		
		boolean status=false;
		try {
		studentRepository.save(std);
		status=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			status=false;
		}
		return status;
	}

}
