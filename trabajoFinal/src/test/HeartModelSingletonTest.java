package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.HeartModel;
import main.TempoModel;

public class HeartModelSingletonTest {

	@Test
	public void test() {
		HeartModel heart = HeartModel.getInstance();
		HeartModel heart2 = HeartModel.getInstance();
		Boolean SingleInstance = (heart==heart2);
		assertEquals(true, SingleInstance);
	}

}
