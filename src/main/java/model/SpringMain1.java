package model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain1 {

	public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("student.xml");
	
	Student student1=(Student)applicationContext.getBean("student01");
	System.out.println(student1);
	
	Student student2=(Student)applicationContext.getBean("student02");
	System.out.println(student2);
	
	}

}
