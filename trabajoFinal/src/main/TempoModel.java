package main;


import java.util.ArrayList;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class TempoModel implements TempoModelInterface,Runnable{
	ArrayList<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
	ArrayList<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();
	ArrayList<TempoObserver> tempoObservers = new ArrayList<TempoObserver>();
	String[] preguntas = new String[4];
	String[] respuestas = new String[4];
	public static TempoModel uniqueInstance=null;	
	static int SegundosTotales=0;
	static int SegundosActuales=0;
	Thread thread;
	private int respuesta = 0;
	private TempoModel(){

		agregarPreguntas();
		agregarRespuestas();

	}

	private void agregarPreguntas(){
		preguntas[0]="El problema consiste en un hombre ciego, que debe tomar tres pastillas de distinto color por dia para vivr, estas son exactamente iguales al tacto y al olfato. El hombre tiene guardadas sus pantillas en frascos de 6, donde hay dos de cada color. \u00BFComo hace para no morir?";
		preguntas[1]="Hay tres cajas, una contiene manzanas, otra naranjas y la otra tiene tanto naranjas como manzanas. El problema es que las etiquetas estan las 3 mal puestas. �Como podes etiquetar bien las cajas sacando una sola fruta y viendola?";
		preguntas[2]="Cuatro individuos llegan a un r�o en la noche. Hay un puente estrecho, pero este s�lo soporta a dos personas a la vez. Los individuos tienen una antorcha, y debido a que es de noche, deben utilizar la antorcha cuando cruzan el puente, por lo tanto, si cruzan dos personas, uno debe volver atr�s llevando la antorcha para que puedan cruzar los dem�s. El individuo A puede cruzar el puente en un minuto, el individuo B en dos minutos, el individuo C en cinco minutos, y el individuo D en ocho minutos. Cuando dos individuos cruzan el puente juntos, tardan lo que tarda el m�s lento de ellos. El problema es: �Pueden cruzar todos el puente en quince minutos o menos?";
		preguntas[3]="Tenemos 12 monedas, una de ellas es falsa y tiene un peso diferente al de las demas. �Como utilizando una balanza, y solo 3 pesadas se puede determinar cual es la falsa y si es mas o menos pesada?";
	}
	private void agregarRespuestas(){
		respuestas[0]="La solucion consiste en partir las pastillas a la mitad, al partir el ciego deja una mitad en el frasco y se toma la otra mitad";
		respuestas[1]="Como sabemos que todas las etiquetas estan cambiadas. Miramos la que tiene la etiqueta Mixta, sabremos que la caja corresponde a la fruta que saquemos ya que esta no puede ser la caja mixta. Luego, le ponemos la etiqueta correspondiente y a las otras dos cajas les intercambiamos las etiquetas restantes.";
		respuestas[2]="Primero cruzan A y B, luego vuelve A con la antorcha. Cruzan C y D, y luego vuelve B con la antorcha. Finalmente, cruzan A y B.";
		respuestas[3]="CONSULTAR";

	}
	public static TempoModel getInstance(){
		if (uniqueInstance==null){
			uniqueInstance= new TempoModel();
		}

		return uniqueInstance;
	}
	@Override
	public int getSegundos() {
		// TODO Auto-generated method stub
		return SegundosActuales;
	}

	@Override
	public void setSegundos(int segundos) {
		// TODO Auto-generated method stub
		SegundosTotales = segundos;
		SegundosActuales = SegundosTotales;
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void registerObserver(BeatObserver o) {
		// TODO Auto-generated method stub
		beatObservers.add(o);
	}

	@Override
	public void removeObserver(BeatObserver o) {
		// TODO Auto-generated method stub
		int i = beatObservers.indexOf(o);
		if (i >= 0) {
			beatObservers.remove(i);
		}
	}
	@Override
	public void registerObserver(TempoObserver o ){
		tempoObservers.add(o);
	}
	public void removeObserver(TempoObserver o) {
		// TODO Auto-generated method stub
		int i = tempoObservers.indexOf(o);
		if (i >= 0) {
			tempoObservers.remove(i);
		}
	}
	@Override
	public void registerObserver(BPMObserver o) {
		// TODO Auto-generated method stub
		bpmObservers.add(o);
	}

	@Override
	public void removeObserver(BPMObserver o) {
		// TODO Auto-generated method stub
		int i = bpmObservers.indexOf(o);
		if (i >= 0) {
			bpmObservers.remove(i);
		}
	}
	public void notifyBeatObservers() {
		for(int i = 0; i < beatObservers.size(); i++) {
			BeatObserver observer = (BeatObserver)beatObservers.get(i);
			observer.updateBeat();
		}
	}
	public void notifyBPMObservers() {
		for(int i = 0; i < bpmObservers.size(); i++) {
			BPMObserver observer = (BPMObserver)bpmObservers.get(i);
			observer.updateBPM();
		}
	}

	public void notifyTEMPOObservers(String a) {
		for(int i = 0; i < tempoObservers.size(); i++) {
			TempoObserver observer = (TempoObserver)tempoObservers.get(i);
			observer.updateTempo(a);
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(SegundosActuales != 0){
			switch(SegundosActuales){
			case 10:
				reproducir("/main/resources/sounds/10seconds.wav");

				break;
			case 30:

				reproducir("/main/resources/sounds/30seconds.wav");

				break;
			case 5:
				reproducir("/main/resources/sounds/5seconds.wav");
			}

			try{	
				Thread.sleep(1000);
				SegundosActuales--;
				notifyBeatObservers();
				notifyBPMObservers();
			}catch(Exception e){
			}

		}
		reproducir("/main/resources/sounds/begins.wav");
		notifyTEMPOObservers(getRespuesta(respuesta));

		/*try{	
			Thread.sleep(10000);
			uniqueInstance = null;
			TempoModel tempomodel = TempoModel.getInstance();
	        ControllerInterface model = new TempoController(tempomodel);

		}catch(Exception e){
		}
		 */
	}
	public String getRespuesta(int index){
		return respuestas[index];
	}
	public void reproducir(String audioPath){
		try
		{
			AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(this.getClass().getResource(audioPath));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start( );
		}
		catch (Exception e)
		{
			// a special way i'm handling logging in this application
			e.printStackTrace();
		}

	}


	public String getPregunta(int index){
		return preguntas[index];
	}

	@Override
	public void mostrarPregunta(int pregunta) {
		// TODO Auto-generated method stub
		notifyTEMPOObservers(getPregunta(pregunta));
		this.respuesta=pregunta;
		/*
		switch(pregunta){
		case 0:
			notifyTEMPOObservers(preguntas[pregunta]);
			respuesta=pregunta;
			break;
		case 1:
			notifyTEMPOObservers(preguntas[pregunta]);
			respuesta=pregunta;
			break;

		case 2:
			notifyTEMPOObservers(preguntas[pregunta]);
			respuesta=pregunta;
			break;

		case 3:
			notifyTEMPOObservers(preguntas[pregunta]);
			respuesta=pregunta;
			break;

		}
		 */

	}

}


