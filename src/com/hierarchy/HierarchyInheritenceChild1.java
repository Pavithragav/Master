package com.hierarchy;

public class HierarchyInheritenceChild1 extends HierarchyInheritence {

	//child1
	private void empSalary() {
		System.out.println("85000");

	}
	
	public static void main(String[] args) {
		HierarchyInheritenceChild1 p = new HierarchyInheritenceChild1();
		p.empName();
		p.empId();
		p.empAge();
		p.empSalary();
	}
	
}
