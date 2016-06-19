package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.HeartModel;

public class HeartModel_getCantInstances {

	@Test
	public void test() {
		HeartModel heart = HeartModel.getInstance();
		heart=HeartModel.getInstance();
		heart=HeartModel.getInstance();
		int cant = HeartModel.getCantInstance();
		assertEquals(cant, 3);
		
	}

}
