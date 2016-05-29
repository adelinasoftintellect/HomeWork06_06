
class Doctor extends Employee {
	int shiftn;
	int shiftd;

	public Doctor(int hours, float salary,int shiftn, int shiftd) {
		super(hours, salary);
		this.shiftn = shiftn;
		this.shiftd = shiftd;
	}

	public int getShiftn() {
		return shiftn;
	}

	public void setShiftn(int shiftn) {
		this.shiftn = shiftn;
	}

	public int getShiftd() {
		return shiftd;
	}

	public void setShiftd(int shiftd) {
		this.shiftd = shiftd;
	}

	public Doctor() {
		this(0,0,0,0);
	}

	public void doctor() {
		System.out.println("Hours per day: " + this.shiftn);
		System.out.println("Hours per night: " + this.shiftd);
		System.out.println();
	}
}
