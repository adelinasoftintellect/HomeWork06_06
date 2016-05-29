
class Policeman extends Employee {
	private String rang;

	public Policeman(int hours, float salary, String rang) {
		super(hours, salary);
		this.rang = rang;
	}

	public String getRang() {
		return rang;
	}

	public void setRang(String rang) {
		this.rang = rang;
	}

	public Policeman() {
		this(0, 0, "");
	}

	public void policeman() {
		System.out.println("Rang: " + this.rang);
		System.out.println();
	}
}
