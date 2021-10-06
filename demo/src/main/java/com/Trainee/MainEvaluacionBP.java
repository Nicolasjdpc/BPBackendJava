package com.Trainee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MainEvaluacionBP {

	public static void main(String[] args) {
		SpringApplication.run((MainEvaluacionBP.class), args);
	}

	/*pruebas postman
	 * 
	 * http://localhost:9095/rest/lote
	 * http://localhost:9095/rest/categoria    GET/POST
	 * http://localhost:9095/rest/bajaBien/2   PUT
	 * http://localhost:9095/rest/inventario   GET/POST
	 * http://localhost:9095/rest/bajaLote/1   PUT
	 * http://localhost:9095/rest/busquedaCategoriaBien/2 GET
	 * 
	 * 
	 * */
}
