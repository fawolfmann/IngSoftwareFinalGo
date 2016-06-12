package main;
public class TempoController implements ControllerInterface {
	static TempoModelInterface tempomodel;
	DJView view;
	TempoView tempoview;
	public int veces = 0;
	public TempoController(TempoModelInterface model){
		tempomodel = model;
		tempoview = new TempoView(this, model);
		tempoview.setInvisible(true);
		/*view = new DJView(this, new TempoAdapter(tempomodel));
		view.createView();
	    view.createControls();
		view.disableStopMenuItem();
		view.disableStartMenuItem();
		*/
	}
	public void mostrar(int pregunta){
		if(veces == 0){
		view = new DJView(this, new TempoAdapter(tempomodel));
		view.createView();
	    view.createControls();
		view.disableStopMenuItem();
		view.disableStartMenuItem();
		tempoview.setInvisible(false);
		tempomodel.mostrarPregunta(pregunta);
		veces++;
		}else{
		tempoview.setInvisible(false);
		tempomodel.mostrarPregunta(pregunta);
		}
	}
	@Override
	public void start() {
		// TODO Auto-generated method stub
			
			
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	@Override
	public void increaseBPM() {
		// TODO Auto-generated method stub
		
		tempoview.restart();
	}

	@Override
	public void decreaseBPM() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setBPM(int bpm) {
		// TODO Auto-generated method stub
		tempomodel.setSegundos(bpm);
		tempoview.setInvisible(true);
		
		
	}

}
