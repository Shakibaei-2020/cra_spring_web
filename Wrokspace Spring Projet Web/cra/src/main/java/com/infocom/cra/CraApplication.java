package com.infocom.cra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * Classe: Cra Application
 * Utilisée afin d'executer et d'effectuer la configuration de l'application.
 * 
 * @author mrshakibaei
 */

@SpringBootApplication
@EnableSwagger2
public class CraApplication extends SpringBootServletInitializer {
	 
	
	/**
	 * 
	 */
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CraApplication.class);
    }
	
	/**
	 * 
	 */
	public static void main(String[] args) {
		SpringApplication.run(CraApplication.class, args);
	}

}
