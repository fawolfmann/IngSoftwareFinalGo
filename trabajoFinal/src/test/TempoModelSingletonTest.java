package test;

import static org.junit.Assert.*;

import main.TempoModel;
import org.junit.Test;



public class TempoModelSingletonTest {

	@Test
	public void test() {
		TempoModel tempo = TempoModel.getInstance();
		TempoModel tempo2 = TempoModel.getInstance();
		Boolean SingleInstance = (tempo==tempo2);
		assertEquals(true, SingleInstance);
		
		
		
	}

}
