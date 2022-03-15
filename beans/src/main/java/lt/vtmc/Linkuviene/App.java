package lt.vtmc.Linkuviene;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Bean bean = (Bean) context.getBean("Human");
		System.out.println(bean.getResult());
	
		Bean shape = (Bean) context.getBean("Shape");
		System.out.println(shape.getMessage());
		
		Bean rectangle = (Bean) context.getBean("Rectangle");
		System.out.println(rectangle.getMessage());
		
		Bean square = (Bean) context.getBean("Square");
		System.out.println(square.getMessage());
		
		Bean circle = (Bean) context.getBean("Circle");
		System.out.println(circle.getMessage());
		
		((ConfigurableApplicationContext) context).close();

    }
}
