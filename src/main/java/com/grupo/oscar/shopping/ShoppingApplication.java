package com.grupo.oscar.shopping;

import com.grupo.oscar.shopping.model.Calcado;
import com.grupo.oscar.shopping.service.CalcadoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ShoppingApplication {


	public static void main(String[] args) {

		SpringApplication.run(ShoppingApplication.class, args);
	}

}
