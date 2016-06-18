package main;

public class StrategyTestDrive {



	public static void main(String[] args) {
		BeatModelInterface beatmodel;
		BeatModelInterface heartmodel;
		BeatModelInterface tempomodel;
		// TODO Auto-generated method stub
		beatmodel=new BeatModel();
		beatmodel.initialize();
		heartmodel=new HeartAdapter(HeartModel.getInstance());
		heartmodel.initialize();
		tempomodel=new TempoAdapter(TempoModel.getInstance());
		StrategyController controller = new StrategyController(heartmodel);
		
		controller.addModel(tempomodel);
		controller.addModel(beatmodel);
		controller.addModel(heartmodel);

	}
}	




