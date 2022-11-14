package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.*;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.tutorial.ex02.e01.FizzBuzz;

class EmployeeTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		InputStream input = getClass().getResourceAsStream("Employee.txt");
		List<Employee> actual = Employee.load(input);
		Employee employee = actual.get(0);
				assertEquals(1, actual.size());
				assertEquals("Ichiro", employee.getFirstName());
			    assertEquals("Tanaka", employee.getLastName());
			    assertEquals("ichiro@example.com", employee.getEmail());
	}

}
