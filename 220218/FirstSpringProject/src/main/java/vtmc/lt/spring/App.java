package vtmc.lt.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		ServiceA serviceA = (ServiceA) context.getBean("serviceABean");
		System.out.println(serviceA.getResult());
		((ConfigurableApplicationContext) context).close();

	}


}
