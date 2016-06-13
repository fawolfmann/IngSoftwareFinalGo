package main;
public class MyTempoTestDrive implements Runnable{
	public MyTempoTestDrive() {

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		TempoModel tempomodel = TempoModel.getInstance();
        ControllerInterface model = new TempoController(tempomodel);
	}

}
