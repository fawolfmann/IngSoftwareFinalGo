package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.TempoModel;

public class TempoMode_getSegundos {

	@Test
	public void test() {
		//Este Test esta pesimo. Esta muy mal diseñado el software.
		TempoModel model = TempoModel.getInstance();
		model.setSegundos(15);
		int segundos = model.getSegundos();
		assertEquals(segundos, 15);
	}

}
