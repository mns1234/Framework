package com.WBQA.assignments;
//Write me a class ? Employee (salary (monthly), name, designation, id, commission pct) ?
//		Methods to get AnnualSalary Method to set Salary Method to set commission 
//		Percentage Create 5 employees and run their annual salary.
//

public class Employeedetail {
	private String name;
	private int designationId;
	private int salary;
	private int commisionPct;
	
	public String getName() {
		return name;
	}
	public int getDesignationId() {
		return designationId;
	}
	public int getSalary() {
		return salary;
	}
	public int getCommisionPct() {
		return commisionPct;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDesignationId(int designationId) {
		this.designationId = designationId;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setCommisionPct(int commisionPct) {
		this.commisionPct = commisionPct;
	}
	public static void main(String[] args) {
		Employeedetail ed1=new Employeedetail();
		ed1.setName("MAYA");
		ed1.setDesignationId(01);
		ed1.setSalary(5000);
		ed1.setCommisionPct(5);
		
		Employeedetail ed2=new Employeedetail();
		ed2.setName("MAYb");
		ed2.setDesignationId(02);
		ed2.setSalary(5000);
		ed2.setCommisionPct(5);
		
		Employeedetail ed3=new Employeedetail();
		ed3.setName("MAYc");
		ed3.setDesignationId(03);
		ed3.setSalary(6000);
		ed3.setCommisionPct(6);
		
		Employeedetail ed4=new Employeedetail();
		ed4.setName("MAYd");
		ed4.setDesignationId(04);
		ed4.setSalary(7000);
		ed4.setCommisionPct(7);
		
		Employeedetail ed5=new Employeedetail();
		ed5.setName("MAYA");
		ed5.setDesignationId(05);
		ed5.setSalary(8000);
		ed5.setCommisionPct(8);
		
		System.out.println("name:" +ed1.getName() + " designation: "+ed1.designationId +" salary:"+ed1.getSalary()+" com:"+ed1.getCommisionPct());
		System.out.println("name:" +ed2.getName() + " designation: " +ed2.designationId +" salary:"+ed2.getSalary()+" com:"+ed2.getCommisionPct());
		System.out.println("name:" +ed3.getName() + " designation: " +ed3.designationId +" salary:"+ed3.getSalary()+" com:"+ed3.getCommisionPct());
		System.out.println("name:" +ed4.getName() + " designation: " +ed4.designationId +" salary:"+ed4.getSalary()+" com:"+ed4.getCommisionPct());
		System.out.println("name:" +ed5.getName() + " designation: " +ed5.designationId +" salary:"+ed5.getSalary()+" com:"+ed5.getCommisionPct());
	}
	

}