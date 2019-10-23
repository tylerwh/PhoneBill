package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import dmacc.controller.BeanConfiguration;
import dmacc.entities.Address;
import dmacc.entities.Bill;
import dmacc.repository.BillRepository;

//@ComponentScan("dmacc.repository.BillRepository")
@SpringBootApplication
public class PhoneBillApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PhoneBillApplication.class, args);
		
//		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
//		
//		Bill b = appContext.getBean("bill", Bill.class);
//		
//		System.out.println(b.toString());
	}
	
	@Autowired
	BillRepository repo;
	
	@Override
	public void run(String... args) throws Exception { 
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Bill b = appContext.getBean("bill", Bill.class);
		b.setName("William");
		repo.save(b);
		
		Bill j = new Bill("Johnny Jay", "515-554-5554", "iPhone X", 59.99);
		
		Address a = new Address("7 Sixth Street", "West Des Moines", "IA");
		
		j.setAddress(a);
		repo.save(j);
		
		List<Bill> allTheBills = repo.findAll();
		for (Bill aBill: allTheBills) {
			System.out.println(aBill.toString());
		}
	}

}
