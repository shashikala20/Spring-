package com.aop.AOPAssignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.Services.PaymentService;

/**
 * Hello world!
 *
 */
public class App {
  
	private static ApplicationContext ApplicationContext;

	public static void main( String[] args )
    {
       ApplicationContext = new ClassPathXmlApplicationContext("com/aop/AOPAssignment/config.xml");
        PaymentService paymentObject =ApplicationContext.getBean("Payment",PaymentService.class);
       
        //auth print:PaymentStarted
        
		
    
    }
}
