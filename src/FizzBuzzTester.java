import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTester {

	@Test
	public void test1() {
		
		assertEquals("1", FizzBuzzClass.fizzBuzzMethod(1));
	}
	
	@Test
	public void test2() {
		
		assertEquals("2", FizzBuzzClass.fizzBuzzMethod(2));
	}
	
	@Test
	public void test3() {
		
		assertEquals("Fizz", FizzBuzzClass.fizzBuzzMethod(3));
	}
	
	@Test
	public void test4() {
		
		assertEquals("4", FizzBuzzClass.fizzBuzzMethod(4));
	}
	
	@Test
	public void test5() {
		
		assertEquals("Buzz", FizzBuzzClass.fizzBuzzMethod(5));
	}
	
	@Test
	public void test6() {
		
		assertEquals("Fizz", FizzBuzzClass.fizzBuzzMethod(6));
	}
	
	@Test
	public void test9() {
		
		assertEquals("Fizz", FizzBuzzClass.fizzBuzzMethod(9));
	}
	
	@Test
	public void test10() {
		
		assertEquals("Buzz", FizzBuzzClass.fizzBuzzMethod(10));
	}
	
	@Test
	public void test12() {
		
		assertEquals("Fizz", FizzBuzzClass.fizzBuzzMethod(12));
	}
	
	@Test
	public void test15() {
		
		assertEquals("FizzBuzz", FizzBuzzClass.fizzBuzzMethod(15));
	}
	
	@Test
	public void test30() {
		
		assertEquals("FizzBuzz", FizzBuzzClass.fizzBuzzMethod(30));
	}

	
	
}
