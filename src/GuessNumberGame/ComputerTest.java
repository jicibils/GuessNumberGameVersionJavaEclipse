package GuessNumberGame;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComputerTest {

	@Test
	public void testTryNumberWithPairNumber1() {
	  //with a pair number return the half	
	  Computer computer = new Computer();
	  assertTrue(computer.tryNumber(0,50) == 25);

	}

	@Test
	public void testTryNumberWithPairNumber2() {
	  //with a pair number return the half	
	  Computer computer = new Computer();
	  assertTrue(computer.tryNumber(0,80) == 40);

	}

	@Test
	public void testTryNumberWithOddNumber1() {
	  //with a odd number return the number is rounded down	
	  Computer computer = new Computer();
	  assertTrue(computer.tryNumber(0,25) == 12);

	}

	@Test
	public void testTryNumberWithOddNumber2() {
	  //with a odd number return the number is rounded down	
	  Computer computer = new Computer();
	  assertTrue(computer.tryNumber(0,77) == 38);

	}
}
