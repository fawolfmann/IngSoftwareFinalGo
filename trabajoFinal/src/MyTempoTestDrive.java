
public class MyTempoTestDrive {
	 public static void main (String[] args) {
			TempoModel tempomodel = TempoModel.getInstance();
	        ControllerInterface model = new TempoController(tempomodel);
	    }

}
