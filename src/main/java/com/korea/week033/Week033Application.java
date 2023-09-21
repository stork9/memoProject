package com.korea.week033;

import com.korea.week033.domain.MemoRepository;
import com.korea.week033.service.MemoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Week033Application {

	public static void main(String[] args) {
		SpringApplication.run(Week033Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(MemoRepository memoRepository, MemoService memoService) {
		return (args) -> {
		};
	}
}