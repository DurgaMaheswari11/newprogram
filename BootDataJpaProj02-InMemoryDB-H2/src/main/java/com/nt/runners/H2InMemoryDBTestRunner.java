package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.nt.service.IJobSeekerMgmtService;
import com.nt.entity.JobSeeker;
import com.nt.repository.IJobSeekerRepository;
@Component
public class H2InMemoryDBTestRunner implements CommandLineRunner {
@Autowired
private IJobSeekerMgmtService jsService;
	@Override
	public void run(String... args) throws Exception {
	System.out.println("===========save object operation==========");
	try {
		JobSeeker js1=new JobSeeker(); 
		js1.setJsName("mahi"); js1.setJsAddrs("hyd");
		js1.setQlfy("B.E"); js1.setExpectedSalary(800000.0);
		
		JobSeeker js2=new JobSeeker(); 
		js2.setJsName("ram"); js2.setJsAddrs("hyd");
		js2.setQlfy("B.tech"); js2.setExpectedSalary(700000.0);
		
		JobSeeker js3=new JobSeeker(); 
		js3.setJsName("seetha"); js3.setJsAddrs("vizag");
		js3.setQlfy("M.E"); js3.setExpectedSalary(700000.0);
		
		String msg=jsService.registerJobSeekerASGroup(List.of(js1,js2,js3));
		System.out.println(msg);
	} 
	catch(Exception e) {
		e.printStackTrace();
		}
     System.out.println("======List Object Operation=========");
     jsService.showAllJobSeekers().forEach(js->System.out.println(js));
     
     
     System.out.println("======find Object Operation=========");
     System.out.println("1 id Job Seeker details:: "+jsService.findJsById(1));
     
	}

}
