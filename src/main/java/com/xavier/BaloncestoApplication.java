package com.xavier;

import com.xavier.service.EquipoService;
import com.xavier.service.JugadorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BaloncestoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BaloncestoApplication.class, args);
		EquipoService EquipoService = context.getBean(EquipoService.class);
		JugadorService jugadorService = context.getBean(JugadorService.class);
		EquipoService.insertarEquipos();
		jugadorService.crearJugadores();
	}
}
