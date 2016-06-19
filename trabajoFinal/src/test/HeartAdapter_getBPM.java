package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.HeartAdapter;
import main.HeartModel;

public class HeartAdapter_getBPM {

	@Test
	public void test() {
		//Este es otro modelo que puede funcionar mas o menos...
		HeartModel heart = HeartModel.getInstance();
		HeartAdapter adapter = new HeartAdapter (heart);
		int heartRate = heart.getHeartRate();
		int bpmRate = adapter.getBPM();
		assertEquals(heartRate, bpmRate);
	}

}
