package main;


import java.io.FileInputStream;
import java.util.ArrayList;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class TempoModel implements TempoModelInterface,Runnable{
	ArrayList beatObservers = new ArrayList();
	ArrayList bpmObservers = new ArrayList();
	private static TempoModel uniqueInstance=null;	
	static int SegundosTotales=0;
	static int SegundosActuales=0;
	Thread thread;
	
	public TempoModel(){
		thread = new Thread(this);
		
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

	}


