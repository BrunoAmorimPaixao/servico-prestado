package com.servico.cliente;

import com.servico.cliente.domain.Cliente;
import com.servico.cliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClienteApplication {

	@Autowired
	ClienteRepository repository;
/*
	@Bean
	public CommandLineRunner run() {
		return args -> {
			Cliente cliente = new Cliente().builder().cpf("00000000001").nome("Fulano 2").build();
			repository.save(cliente);
		};

	}*/

	public static void main(String[] args) {
		SpringApplication.run(ClienteApplication.class, args);
	}

}
