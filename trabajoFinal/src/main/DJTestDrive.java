package main;

public class DJTestDrive implements Runnable{

	public DJTestDrive() {

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
	}

}


