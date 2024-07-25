package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 	Projeto Spring boot gerado via Spring Initializr.
 * 	Modulos selecionados:
 * 	Spring Data JPA
 * 	Spring Web
 * 	H2 DataBase
 * 	OpenFeign
 *
 * @Author WeslleyQueiroz
 */

@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetoSpringApplication.class, args);
	}

}
