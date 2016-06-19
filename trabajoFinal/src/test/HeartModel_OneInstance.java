package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.HeartModel;

public class HeartModel_OneInstance {

	@Test
	public void test() {
		HeartModel heart = HeartModel.getInstance();
		assertEquals(1, HeartModel.getCantInstance());
	}

}
