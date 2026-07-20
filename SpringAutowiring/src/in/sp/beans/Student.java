package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private int rollno;
    private String name;
    
    @Autowired
    private Address address;
    @Autowired
    private Subjects subjects;
    
    
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public Subjects getSubjects() {
//		return subjects;
//	}
//	public void setSubjects(Subjects subjects) {
//		this.subjects = subjects;
//	}

//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}
	
public void display() {
		
		System.out.println("roll no "+rollno);
		System.out.println("name "+name);
		System.out.println("Address : "+address);
		System.out.println("Subjects : "+subjects);
	}

}
