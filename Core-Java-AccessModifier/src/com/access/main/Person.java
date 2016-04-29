package com.access.main;

import com.access.mobile.Mobile;
import com.access.sim.Sim;

public class Person {
	String fname;
	String lname;
	private int age;
	public Mobile  mobile;
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Person [fname=" + fname + ", lname=" + lname + ", age=" + age + ", mobile=" + mobile + "]";
	}


	public static void main(String[] args) {
		Person person= new Person();
		person.setFname("Bhaskar");
		person.setLname("Gogoi");
		String fString = person.getFname();
		String lString = person.getLname();
		person.getName(fString,lString);
		person.setAge(25);
		
		Sim sim = new Sim();
		sim.setName("AT&T");
		sim.setModel("2453");
		sim.setQuantity(1);
		Mobile mobile = new Mobile();
		mobile.setName("Samsung");
		mobile.setModel("S5");
		mobile.setVendor("Samsung");
		mobile.setPrice(329);
		mobile.setSim(sim);
		person.setMobile(mobile);
		
		System.out.println(person);
	}
	
	String getName(String fname,String lname){
		return fname+" "+lname;
	}
}
