package com.pwioi.entities;

public class Projects {
	private int pId;
	private String pName;
	private String pMgr;
	private Employee[] emp;
	public Projects(int pId, String pName, String pMgr,Employee...emp) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pMgr = pMgr;
		this.emp=emp;
	}
	public int getpId() {
		return pId;
	}
	public String getpName() {
		return pName;
	}
	public String getpMgr() {
		return pMgr;
	}
	@Override
	public String toString() {
		String str1="Project Details :- "+"\n"+"Project ID : "+pId+"\n"+"Project Name : "+pName+"\n"
				+"Project Manager : "+pMgr+"\n"+"\n"+"All Employees in this Project:- "+"\n";
		
		for(Employee e:emp) {
			str1=str1+"Employee ID : "+e.getEmpId()+"\n"+"Employee Name : "+e.getEmpName()+"\n"+"###########"+"\n";
		}
		return str1;
	    
	
		
	}
	

}

