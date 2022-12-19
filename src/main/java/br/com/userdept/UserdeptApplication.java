package br.com.userdept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Anotação responsavel por fazer um pré  processamento na minha classe antes de compilar
 *  e vai transformar o projeto em SpringBoot.
 */
@SpringBootApplication
public class UserdeptApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserdeptApplication.class, args);
	}

}
