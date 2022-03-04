package com.dev4j.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

@SpringBootApplication
public class DependencyInyectionApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(DependencyInyectionApplication.class);

	// Representa la declaracion de Bean de forma explicita.
	@Bean
	public String getApplicationName() {
		return "Devs4j_rules";
	}

	public static void main(String[] args) {
		// El contexto es el lugar donde viven los objetos administrados por Spring.
//		ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
//		AreaCalculatorService areaCalculatorService = context.getBean(AreaCalculatorService.class);
//		LOGGER.info("Area total: {}", areaCalculatorService.calAreas());
		
		ExpressionParser expressionParser = new SpelExpressionParser();
		Expression expression = expressionParser.parseExpression("10 + 20");
		LOGGER.info("Result {}", expression.getValue());

	}

}
