package week2;

public class TestController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ep=new Employee(21,"Yuvaraj G","Associate Software Engineer");
		Employee ep1=new Employee(21,"Ravi R","Associate Software Engineer");
		Employee ep2=new Employee(22,"John J","Associate Software Engineer");
		
		HR_Manager hr=new HR_Manager();
		hr.process_Records(ep.age,ep.name,ep.designation);
		hr.process_Records(ep1.age,ep1.name,ep1.designation);
		hr.process_Records(ep2.age,ep2.name,ep2.designation);
		
		

	}

}
