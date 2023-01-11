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

		Service s1 = new Service(null, "Cabelo", 60, "Na tesoura ou maquina como o cliente preferir");
		Service s2 = new Service(null, "Barba", 40, "Corte e desenho profissional de barba");
		Service s3 = new Service(null, "Cabelo + Barba", 90, "Pacote completo de cabelo e barba");

		serviceRepository.saveAll(Arrays.asList(s1, s2, s3));

	}
}
