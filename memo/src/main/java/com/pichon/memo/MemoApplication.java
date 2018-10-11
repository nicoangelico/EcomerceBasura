package com.pichon.memo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.pichon.memo.modelo.Cliente;
import com.pichon.memo.repositorio.MemoRepository;

@SpringBootApplication
public class MemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner setup(MemoRepository memoRepository) {
		return (args) -> {
			memoRepository.save(new Cliente("Pichon_de_picuru", "nicoangelico@gmail.com"));
			memoRepository.save(new Cliente("jorch", "trolljorch@gmail.com"));
			memoRepository.save(new Cliente("FrancoJim14", "francojim@gmail.com"));
		};
	}

}
