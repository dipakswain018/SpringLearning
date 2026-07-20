package in.sp.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subjects;

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
		//std.setSubjects(subobj()); manual DI
		
		return std;
		
	}
	
	@Bean
	public Subjects subobj() {
		Subjects subj=new Subjects();
		
		List<String> subjects_list=new ArrayList<String>();
		
		subjects_list.add("Java");
		subjects_list.add("c++");
		
		subj.setSubjects(subjects_list);
				
				
				
	    return subj;
	}

}
