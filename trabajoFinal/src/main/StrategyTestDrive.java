package main;

import java.util.Scanner;

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
		StrategyController controller = new StrategyController(tempomodel);

		while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter a number");	
			int modelo = scanner.nextInt();

			switch(modelo){
			case(1):
				controller.changeModel(beatmodel);
			break;
			case(2):
				controller.changeModel(heartmodel);
			break;
			case(3):
				controller.changeModel(tempomodel);
				break;
			default:
				break;
			}

		}
	}	



}
