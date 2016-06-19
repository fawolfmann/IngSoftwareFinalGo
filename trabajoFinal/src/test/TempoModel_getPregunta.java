package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.TempoModel;

public class TempoModel_getPregunta {

	@Test
	public void test() {
		TempoModel tempo = TempoModel.getInstance();
		String tempo_pregunta = tempo.getPregunta(3);
		String pregunta = "Tenemos 12 monedas, una de ellas es falsa y tiene un peso diferente al de las demas. ¿Como utilizando una balanza, y solo 3 pesadas se puede determinar cual es la falsa y si es mas o menos pesada?";
		assertEquals(pregunta, tempo_pregunta);
	}	

}
