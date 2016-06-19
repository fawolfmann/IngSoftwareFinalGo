package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.HeartModel;

public class HeartModel_NoInstance {

	@Test
	public void test() {
		assertEquals(HeartModel.getCantInstance(), 0);
		
	}

}
