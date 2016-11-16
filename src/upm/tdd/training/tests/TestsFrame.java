package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import upm.tdd.training.BowlingException;
import upm.tdd.training.Frame;

public class TestsFrame {
	
	

	@Test(expected = BowlingException.class)
	public void testStrike() throws BowlingException {
		//Assign
		Frame newFrame = new Frame(9, 1);
		//Act
		boolean ris = newFrame.isStrike();
		//Assert
		assertEquals(false, ris);
		
	}

}
