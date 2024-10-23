package com.example.EmployeeManagementSystem;

import com.example.EmployeeManagementSystem.model.Employee;
import com.example.EmployeeManagementSystem.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementSystemApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee1 = new Employee("Aman Sen", "Software Developer", 50000);
		Employee employee2 = new Employee("Naman Soni", "Java Developer", 60000);
		Employee employee3 = new Employee("Raj Gupta", "Python Developer", 80000);
		Employee employee4 = new Employee("Om Thakur", "C++ Developer", 90000);
		Employee employee5 = new Employee("Yash Patel", "MERN Developer", 100000);

		// Save employees to the database
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
		employeeRepository.save(employee4);
		employeeRepository.save(employee5);
	}
}
