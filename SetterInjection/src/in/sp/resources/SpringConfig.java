package in.sp.resources;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfig {
	
	@Bean
	public Address createAddrrobj(){
		
		Address addr=new Address(); 
		addr.setHouseno(551);
		addr.setCity("Dubai");
		addr.setPincode(754894);
		
		return addr;
	}
	
	@Bean
	public Student createStdObj() {
		
		Student std=new Student();
		
		std.setName("Yachiru");
		std.setRollno(256);
		std.setAddress(createAddrrobj());
		
		
		return std;
	}
	

}
