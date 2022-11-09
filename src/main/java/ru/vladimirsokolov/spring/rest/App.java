package ru.vladimirsokolov.spring.rest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.vladimirsokolov.spring.rest.configuration.MyConfig;
import ru.vladimirsokolov.spring.rest.entity.Employee;

import java.util.List;


public class App {
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee empByID = communication.getEmployee(7);
//        System.out.println(empByID);

//        Employee emp = new Employee("Julia", "Sokolova", "IT", 1200);
//        emp.setId(11);
//        communication.saveEmployee(emp);

        communication.deleteEmployee(11);
    }
}
