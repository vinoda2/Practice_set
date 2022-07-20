package com.xworkz.oops;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1=new Employee();
		employee1.emp_id=12;
		employee1.emp_name="Kadamba";
		employee1.designation="Fullstack developer";
		System.out.println(employee1.emp_id);
		System.out.println(employee1.emp_name);
		System.out.println(employee1.designation);
		System.out.println(Employee.state);// static variable
		
		Employee employee2=new Employee();
		employee2.emp_id=124;
		employee2.emp_name="Kadamba";
		employee2.designation="Fullstack developer";
		System.out.println(employee2.emp_id);
		System.out.println(employee2.emp_name);
		System.out.println(employee2.designation);
		System.out.println(Employee.state);// static
	}

}
