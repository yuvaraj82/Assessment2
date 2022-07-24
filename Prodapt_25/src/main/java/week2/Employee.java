package week2;

public class Employee {
    int age;
	String name;
	String designation;
	
	public Employee(int age,String name,String designation)
	{
		this.age=age;
		this.name=name;
		this.designation=designation;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
