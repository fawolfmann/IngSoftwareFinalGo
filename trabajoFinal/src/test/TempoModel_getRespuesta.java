package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.TempoModel;

public class TempoModel_getRespuesta {

	@Test
	public void test() {
		TempoModel tempo = TempoModel.getInstance();
		String tempo_respuesta = tempo.getRespuesta(3);
		String respuesta = "CONSULTAR";
		assertEquals(respuesta, tempo_respuesta);
	}

}
