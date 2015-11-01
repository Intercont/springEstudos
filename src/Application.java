import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.igor.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		
//		CustomerService customerService = new CustomerServiceImpl();
		
		//Carrega o applicationContext do Spring na inicialização da aplicação 
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//recebendo CustomerService via Bean do applicationContext
		CustomerService customerService = applicationContext.getBean("customerService", CustomerService.class);
		
		System.out.println(customerService.findAll().get(0).getFirstName() + 
				" " + customerService.findAll().get(0).getLastName());

	}

}
