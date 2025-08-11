package com.pwioi.entities;



public class Employee {
	private int empId;
	private String empName;
	private Projects[]  proj;
	
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setProj(Projects...proj) {
		this.proj = proj;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public Projects[] getProj() {
		return proj;
	}
	@Override
	public String toString() {
		
		String str1="Employee Details :- "+"\n"+"Employee ID :"+empId+"\n"+"Employee Name : "+empName+"\n"+"\n"+"His Current Projects :- "+"\n";
		for(Projects p:proj) {
			str1=str1+"Project ID : "+p.getpId()+"\n"+"Project Name : "+p.getpName()+"\n"+"Project Manager : "+p.getpMgr()+"\n"+ "**********"+"\n";
		}
		
		return str1;
	}
	
	
	

}
