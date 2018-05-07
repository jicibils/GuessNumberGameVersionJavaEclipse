package GuessNumberGame;

import static org.junit.Assert.*;

import org.junit.Test;

public class AskNumberTest {

	@Test
	public void testCheckPositiveNumberButLessThan1() {
	  AskNumber askNumber = new AskNumber();
	  assertEquals(askNumber.checkNumber(0),0);

	}

	@Test
	public void testCheckPositiveNumberButGreaterThan100() {
		AskNumber askNumber = new AskNumber();
	  assertTrue(askNumber.checkNumber(200) == 0);

	}

	@Test
	public void testCheckNegativeNumber() {
		AskNumber askNumber = new AskNumber();
	  assertEquals(askNumber.checkNumber(-10),0);

	}

	@Test
	public void testCheckValidNumber() {
		AskNumber askNumber = new AskNumber();
	  assertTrue(askNumber.checkNumber(50) == 50);

	}

}
