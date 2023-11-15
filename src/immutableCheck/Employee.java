package immutableCheck;

public final class Employee {

	private final int id;
	private final String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) throws Exception {
		
		Employee employee = new Employee(101, "Aman");
		System.out.println(employee.toString());
		
	}
}