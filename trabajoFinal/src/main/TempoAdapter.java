package main;
public class TempoAdapter implements BeatModelInterface {
	TempoModelInterface temporizador;
	
	
	public TempoAdapter(TempoModelInterface model){
		temporizador = model;
	}
	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBPM(int bpm) {
		// TODO Auto-generated method stub
		this.temporizador.setSegundos(bpm);
	}

	@Override
	public int getBPM() {
		// TODO Auto-generated method stub
		return temporizador.getSegundos();
	}

	@Override
	public void registerObserver(BeatObserver o) {
		// TODO Auto-generated method stub
		temporizador.registerObserver(o);
	}

	@Override
	public void removeObserver(BeatObserver o) {
		// TODO Auto-generated method stub
		temporizador.removeObserver(o);
	}

	@Override
	public void registerObserver(BPMObserver o) {
		// TODO Auto-generated method stub
		temporizador.registerObserver(o);
	}

	@Override
	public void removeObserver(BPMObserver o) {
		// TODO Auto-generated method stub
		temporizador.removeObserver(o);
	}
	
	//Esto se modifico.
	@Override
	public void notifyBeatObservers() {
		// TODO Auto-generated method stub
		((TempoModelInterface)temporizador).notifyBeatObservers();
	}
	@Override
	public void notifyBPMObservers() {
		// TODO Auto-generated method stub
		((TempoModelInterface)temporizador).notifyBPMObservers();
	}

}
