package com.pwioi.test;


import com.pwioi.entities.*;


public class Launch {
	public static void main(String[] args) {
		
		Employee e1= new Employee();
		e1.setEmpId(112);
		e1.setEmpName("Monu");
		

		Employee e2= new Employee();
		e2.setEmpId(113);
		e2.setEmpName("Sonu");
		
		Employee e3= new Employee();
		e3.setEmpId(114);
		e3.setEmpName("Banu");
		
		Projects pj1=new Projects(125,"GmailApp","Irfan",e1,e3);
		Projects pj2=new Projects(126,"GmapApp","Munaf",e1,e2,e3);
		Projects pj3=new Projects(127,"GphotosApp","Rakesh",e1,e3);
		e1.setProj(pj1,pj2);
		e2.setProj(pj2,pj3);
		e3.setProj(pj1,pj2,pj3);
	
		
		System.out.println("---e1 Employee data---");
		System.out.println(e1);
		System.out.println("---e2 Employee data---");
		System.out.println(e2);
		System.out.println("---e3 Employee data---");
		System.out.println(e3);
		
		System.out.println("---Project pj1 data---");
		System.out.println(pj1);
		System.out.println("---Project pj2 data---");
		System.out.println(pj2);
		System.out.println("---Project pj3 data---");
		System.out.println(pj3);
		
		
		
	
	
	
	}

	

}
