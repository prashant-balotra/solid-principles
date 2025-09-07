package com.codewithmonks.solid;

import com.codewithmonks.solid.srp.good.*;
import com.codewithmonks.solid.ocp.good.*;
import com.codewithmonks.solid.lsp.good.*;
import com.codewithmonks.solid.isp.good.*;
import com.codewithmonks.solid.dip.good.*;
import com.codewithmonks.solid.srp.good.UserService;

import java.util.List;

public class SolidPrinciplesApplication {
	public static void main(String[] args) {
		System.out.println("=== SOLID Principles Demo ===\n");

		demonstrateSRP();
		demonstrateOCP();
		demonstrateLSP();
		demonstrateISP();
		demonstrateDIP();
	}

	private static void demonstrateSRP() {
		System.out.println("1. Single Responsibility Principle (SRP):");

		UserRepository userRepo = new UserRepository();
		EmailService emailService = new EmailService();
		UserService userService = new UserService(userRepo, emailService);

		userService.registerUser("john@example.com", "John Doe");
		System.out.println();
	}

	private static void demonstrateOCP() {
		System.out.println("2. Open/Closed Principle (OCP):");

		List<Shape> shapes = List.of(
				new Rectangle(5, 10),
				new Circle(7)
		);

		AreaCalculator calculator = new AreaCalculator();
		double totalArea = calculator.calculateTotalArea(shapes);
		System.out.println("Total area: " + totalArea);
		System.out.println();
	}

	private static void demonstrateLSP() {
		System.out.println("3. Liskov Substitution Principle (LSP):");

		FlyingBird eagle = new Eagle();
		eagle.fly();
		eagle.eat();

		Bird penguin = new Penguin();
		penguin.eat();
		((Penguin) penguin).swim();
		System.out.println();
	}

	private static void demonstrateISP() {
		System.out.println("4. Interface Segregation Principle (ISP):");

		Human human = new Human();
		human.work();
		human.eat();
		human.sleep();

		Robot robot = new Robot();
		robot.work();
		robot.charge();
		System.out.println();
	}

	private static void demonstrateDIP() {
		System.out.println("5. Dependency Inversion Principle (DIP):");

		// Can easily switch database implementations
		Database mysqlDb = new MySQLDatabase();
		com.codewithmonks.solid.dip.good.UserService userService1 = new com.codewithmonks.solid.dip.good.UserService(mysqlDb);
		userService1.saveUser("User data for MySQL");

		Database postgresDb = new PostgreSQLDatabase();
		com.codewithmonks.solid.dip.good.UserService userService2 = new com.codewithmonks.solid.dip.good.UserService(postgresDb);
		userService2.saveUser("User data for PostgreSQL");
		System.out.println();
	}
}
