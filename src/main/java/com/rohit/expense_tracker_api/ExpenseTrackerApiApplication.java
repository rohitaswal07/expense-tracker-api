package com.rohit.expense_tracker_api;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
			title = "Expense Tracker OPEN API",
			version = "1.0.0",
			description = "Expense Tracker OPEN API documentation"
		),
		servers = @Server(
			url = "http://localhost:8080",
				description = "Expense Tracker OPEN API url"
		)
)
public class ExpenseTrackerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseTrackerApiApplication.class, args);
	}

}
