package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.TempoAdapter;
import main.TempoModel;

public class TempoAdapter_setBPM {

	@Test
	public void test() {
		//Este test podria fallar
		TempoAdapter model = new TempoAdapter (TempoModel.getInstance());
		int segundos = 15;
		model.setBPM(segundos);
		int segundos_model = model.getBPM();
		assertEquals (segundos, segundos_model);
	}

}
