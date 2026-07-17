package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfig {
	
	
	@Bean
	public Address addrobj() {
		
		Address addr=new Address();
		
		addr.setHouseno(336);
		addr.setCity("Mumbai");
		addr.setPincode(754256);
		
		return addr;
		
	}
	
	@Bean
	public Student stdobj() {
		
		Student std=new Student();
		std.setName("Aizen");
		std.setRollno(556);
		//std.setAddress(addrobj());
		
		return std;
		
	}
	

}
