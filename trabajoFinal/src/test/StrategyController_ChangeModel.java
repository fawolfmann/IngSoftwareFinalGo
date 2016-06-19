package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.BeatModel;
import main.BeatModelInterface;
import main.HeartAdapter;
import main.HeartModel;
import main.StrategyController;
import main.TempoAdapter;
import main.TempoModel;
public class StrategyController_ChangeModel {

	@Test
	public void test() {
		BeatModelInterface tempo = new TempoAdapter(TempoModel.getInstance());
		BeatModelInterface heart = new HeartAdapter (HeartModel.getInstance());
		BeatModelInterface beat = new BeatModel();
		StrategyController controller = new StrategyController(tempo);
		controller.addModel(tempo);
		controller.addModel(beat);
		controller.addModel(heart);
		controller.changeModel("Heart");
		assertEquals(heart, controller.getModel());
		
		
		
	}

}
