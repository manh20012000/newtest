package ranDomTaixiu;

public class NhaCai {
     


	public int moneyNhaCai;

	
	protected NhaCai(int moneyNhaCai) {
		this.moneyNhaCai = moneyNhaCai;
	}
public int getMoneyNhaCai() {
		return moneyNhaCai;
	}

	public void setMoneyNhaCai(int moneyNhaCai) {
		this.moneyNhaCai = moneyNhaCai;
	}
	@Override
	public String toString() {
		return "" + moneyNhaCai;
	}
}
