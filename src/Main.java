class Employee {

	private int hours;
	private float salary;

	public Employee(int hours, float salary) {
		super();
		this.hours = hours;
		this.salary = salary;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Employee() {
		this(0, 0);
	}

	public void employee() {
		System.out.println("Hours pre month: " + this.hours);
		System.out.println("Month Salary: " + this.salary);

	}
}

public class Main {

	public static void main(String[] args) {
		Policeman ivan = new Policeman(168, 1100, "Major");
		ivan.employee();
		ivan.policeman();
		Doctor petar = new Doctor(180, 3000, 8, 8);
		petar.employee();
		petar.doctor();

	}
}
