package ranDomTaixiu;

public class NhaMang {
	private String idNM;
	public String tenNM;
	private String seri;
	public int moneyNM;
	public NhaMang(String idNM, String tenNM, String seri, int moneyNM) {
		 this.idNM=idNM;
		 this.tenNM=tenNM;
		 this.seri=seri;
		 this.moneyNM=moneyNM;
	}

	public String getId() {
		return this.idNM;
		}

		public void setId(String id) {
		this.idNM = id;
		}

		public String getseri() {
		  return this.seri;
		}
		public String tenNM() {
			return this.tenNM;
			}
		public int monney() {
			return this.moneyNM;
		}

	@Override
	public String toString() {
		return this.idNM + ","+this.tenNM + ","+this.seri+ ","+ this.moneyNM;
	}

	
}
