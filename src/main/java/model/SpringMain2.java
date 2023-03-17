package model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain2 {

	public static void main(String[] args) {
	
		
		//creates Spring container
				ApplicationContext applicationContext=new ClassPathXmlApplicationContext("carFactoryService.xml");
				
				//Asking container to give student bean with id student01
		
				CarFactoryService carFactoryService=(CarFactoryService)applicationContext.getBean("cfs01");
				
				System.out.println(carFactoryService);
				
				//extracting car and employee from car factory
				Car car=carFactoryService.getCarr();
				
				Employee emp=carFactoryService.getEmployeee();
				System.out.println(car);
				System.out.println(emp);
			
				//direct acccess to car and employee
				
				/*
				 * Car car1=(Car)applicationContext.getBean("car"); Employee
				 * employee=(Employee)applicationContext.getBean("employee");
				 * 
				 * System.out.println(car1); System.out.println(employee);
				 */
				
				
		
			
	}

}
