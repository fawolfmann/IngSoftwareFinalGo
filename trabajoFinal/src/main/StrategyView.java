package main;

public class StrategyView extends DJView{

	public StrategyView(ControllerInterface controller, BeatModelInterface model) {
		super(controller, model);

		// TODO Auto-generated constructor stub
	}
	public void changeModel(BeatModelInterface model){
		this.model.removeObserver((BeatObserver)this);
		this.model.removeObserver((BPMObserver)this);
		this.model=model;
		this.model.registerObserver((BeatObserver)this);
		this.model.registerObserver((BPMObserver)this);

	}
}
