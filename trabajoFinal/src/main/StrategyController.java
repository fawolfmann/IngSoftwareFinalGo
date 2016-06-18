package main;

import java.util.ArrayList;

public class StrategyController implements ControllerInterface{
	BeatModelInterface model;
	StrategyView view;
	ArrayList<BeatModelInterface> modelos;
	/*
	 * Se podria hacer un decorator  que contenga los tres controladores mas las funcionalidades nuevas, lo que estaria copado.
	 */

	public StrategyController(BeatModelInterface model) {
		this.model = model;
		this.modelos = new ArrayList<BeatModelInterface>();
		view = new StrategyView(this, this.model);
		this.model.notifyBeatObservers();
		this.model.notifyBPMObservers();
	}

	public void addModel(BeatModelInterface model){
		modelos.add(model);
	}
	public void start() {
		model.on();
		view.disableStartMenuItem();
		view.enableStopMenuItem();
	}

	public void stop() {
		model.off();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
	}

	public void increaseBPM() {
		if(this.model instanceof BeatModel){
		int bpm = model.getBPM();
		model.setBPM(bpm + 1);
		}
	}

	public void decreaseBPM() {
		if(this.model instanceof BeatModel){
		int bpm = model.getBPM();
		model.setBPM(bpm - 1);
		}
	}

	public void setBPM(int bpm) {
		model.setBPM(bpm);
	}
	public void changeModel(String modelo){
		switch(modelo){
		case ("Smart"):
			this.view.changeModel(modelos.get(0));
			this.model=modelos.get(0);
			break;
		case("DJ"):
			this.view.changeModel(modelos.get(1));
			this.model=modelos.get(1);
			break;
		case("Heart"):
			this.view.changeModel(modelos.get(2));
			this.model=modelos.get(2);
			break;
		default:
			break;
		}
		this.model.notifyBeatObservers();
		this.model.notifyBPMObservers();
	}
}
