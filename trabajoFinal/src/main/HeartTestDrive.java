package main;
  
public class HeartTestDrive implements Runnable {

    public HeartTestDrive() {
		
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		HeartModel heartModel = HeartModel.getInstance(); 
        ControllerInterface model = new HeartController(heartModel);
	}
}
