package net.grigdim.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolManagementSystemApplication
//		implements CommandLineRunner
	{

	public static void main(String[] args) {
		SpringApplication.run(SchoolManagementSystemApplication.class, args);
	}


//	@Autowired
//	StudentRepo studentRepo;
//	@Override
//	public void run(String... args) throws Exception {
////		Student student1 = new Student("Dimitris", "Grigoriadis", "d.g.grigoriadis@gmail.com");
////		studentRepo.save(student1);
////		Student student2 = new Student("Silia", "Sideri", "siliasid@gmail.com");
////		studentRepo.save(student2);
//	}
}
