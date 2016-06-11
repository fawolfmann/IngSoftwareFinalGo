
public interface TempoModelInterface  {
	int getSegundos();
	void setSegundos(int segundos);
	void registerObserver(BeatObserver o);
	void removeObserver(BeatObserver o);
	void registerObserver(BPMObserver o);
	void removeObserver(BPMObserver o);
	
}
