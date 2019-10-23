package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.entities.Address;
import dmacc.entities.Bill;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Bill bill() {
		Bill bean = new Bill();
		bean.setName("Theodore Geisel");
		bean.setPhone("555-555-5555");
		bean.setDevice("Moto X");
		bean.setAmount(39.99);
		return bean;
	}
	
	@Bean
	public Address address() {
		Address bean = new Address("1 Second St", "Rapid City", "MI");
		return bean;
	}
	
	

}
