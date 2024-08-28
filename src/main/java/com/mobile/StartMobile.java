package com.mobile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sim.sim;

public class StartMobile {
	
	
	ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
	private sim s = context.getBean(sim.class);
	
	public  StartMobile(){
		startRelianceMobile();
		s.startsim();
	}
	
	
	public void startRelianceMobile() {
		System.out.println("welcome to reliance mobile");
	}

}
