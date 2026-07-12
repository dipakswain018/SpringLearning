package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.student;

public class main {
	
	public static void main(String[] args) {
		
		ApplicationContext container=new ClassPathXmlApplicationContext("in/sp/resources/applicationContext.xml");
		
		student std=(student) container.getBean("stdobj");
		std.display();
	}

}
