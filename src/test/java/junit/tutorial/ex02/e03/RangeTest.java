package junit.tutorial.ex02.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RangeTest {
	Range sut;

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
	@Nested
	@DisplayName("Range0から10.5")
	class test1 {
		
		@BeforeEach
		void setUp() throws Exception {
			sut = new Range(0d, 10.5);
		}
		
		@Nested
		@DisplayName("範囲内")
		class test1_1 {

			@ParameterizedTest
			@ValueSource(doubles = {0.0, 10.5})
			void test1_1_1(double d) {
				assertTrue(sut.contains(d));
			}

		}
		@Nested
		@DisplayName("範囲外")
		class test1_2 {

			@ParameterizedTest
			@ValueSource(doubles = {-0.1, 10.6})
			void test1_2_1(double d) {
				assertFalse(sut.contains(d));
			}

		}
		
	}
	
	@Nested
	@DisplayName("Range-5.1から5.1まで")
	class test2 {
		
		@BeforeEach
		void setUp() throws Exception {
			sut = new Range(-5.1, 5.1);
		}

		@Nested
		@DisplayName("範囲内")
		class test2_1 {
			@ParameterizedTest
			@ValueSource(doubles = {-5.1, 5.1})
			void test2_1_1(double d) {
				assertTrue(sut.contains(d));
			}
		}
		
		@Nested
		@DisplayName("範囲外")
		class test2_2 {
			@ParameterizedTest
			@ValueSource(doubles = {-5.2, 5.2})
			void test2_2_1(double d) {
				assertFalse(sut.contains(d));
			}
		}
	}

}
