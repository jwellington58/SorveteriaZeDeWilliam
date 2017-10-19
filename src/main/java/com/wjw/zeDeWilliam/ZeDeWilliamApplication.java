package com.wjw.zeDeWilliam;


import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebMvcProperties.LocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;

@SpringBootApplication
public class ZeDeWilliamApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZeDeWilliamApplication.class, args);
	}
	//Isso indica que as configurações como data, numeros com virgula e
	// etc... estarão no formato brasileiro
	@Bean
	public FixedLocaleResolver localeResolver(){
		return new FixedLocaleResolver(new Locale("pt", "BR"));
	}
	
}
