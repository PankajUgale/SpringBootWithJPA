package in.sp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.sp.main.entities.Student;
import in.sp.main.services.StudentService;
import in.sp.main.services.StudentServiceImp;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);
		StudentService stdservice = context.getBean(StudentServiceImp.class);
		
//------------------Insertion Operation----------------------------------
		
		Student std = new Student();
		std.setName("Rohit");
		std.setRollNo(45);
		std.setMarks(96.45f);

		boolean status = stdservice.addStudentDetails(std);
		if (status) {
			System.out.println("Student inserted Successfully...");
		} else {
			System.out.println("Student not inserted d1ue to some Error.");
		}
	}
}
