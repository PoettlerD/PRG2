package sort.ue.employee;

public class Employee implements Comparable<Employee> {

	private int empNumber;
	private String name;
	private double salary;
	private String Department;
	public Employee(int empNumber, String name, double salary, String department) {
		super();
		this.empNumber = empNumber;
		this.name = name;
		this.salary = salary;
		Department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public int getEmpNumber() {
		return empNumber;
	}
	@Override
	public String toString() {
		return "Employee [empNumber=" + empNumber + ", name=" + name + ", salary=" + salary + ", Department="
				+ Department + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empNumber;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empNumber != other.empNumber)
			return false;
		return true;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if (this.empNumber < o.empNumber)
			return -1;
		if (this.empNumber > o.empNumber)
			return 1;
		return 0;
	}
	
	
}
