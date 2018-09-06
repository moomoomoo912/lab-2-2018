package cashier;

public class Cashier {
	private int galleon;
	private int sickle;
	private int knut;
	private static final int SICKLE_TO_GALLEON = 17;
	private static final int KNUT_TO_SICKLE = 29;
	
	public Cashier() {
		this.galleon = 0;
		this.sickle = 0;
		this.knut = 0;
	}

	public Cashier(int galleon, int sickle, int knut) {
		this.galleon = galleon;
		this.sickle = sickle;
		this.knut = knut;
	}
	
	public void addCoin (int galleon, int sickle, int knut) {
		this.galleon += galleon;
		this.sickle += sickle;
		this.knut += knut;
	}
	
	public void change(int galleon, int sickle, int knut) {
		this.galleon -= galleon;
		this.sickle -= sickle;
		this.knut -= knut;
	}
	
	public void exchange() {
		this.galleon += sickle / SICKLE_TO_GALLEON;
		this.sickle += knut / KNUT_TO_SICKLE;
		this.sickle = sickle % SICKLE_TO_GALLEON;
		this.knut = knut % KNUT_TO_SICKLE;
	}
	
	public boolean steal() {
		if( !this.isEmpty()) {
			this.galleon = 0;
			this.sickle = 0;
			this.knut = 0;
			return true;
		}	
		else return false;
	}

	public int getGalleon() {
		return galleon;
	}

	public int getSickle() {
		return sickle;
	}

	public int getKnut() {
		return knut;
	}
	
	public boolean isEmpty() {
		return this.galleon == 0 && this.sickle == 0 && this.knut == 0;
	}


}
