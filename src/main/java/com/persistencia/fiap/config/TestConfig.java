package com.persistencia.fiap.config;

import java.util.Arrays;

import com.persistencia.fiap.entities.Service;
import com.persistencia.fiap.repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private ServiceRepository serviceRepository;

	@Override
	public void run(String... args) throws Exception {

		Service s1 = new Service(null, "Notebook", 1455.99, "tesatarfsraga");
		Service s2 = new Service(null, "Teste", 143, "sgfnsmlafglklhfjsk");

		serviceRepository.saveAll(Arrays.asList(s1, s2));

	}
}
