package com.edu.co.empleado.service;

import java.util.List;

import com.edu.ue.model.Employee;

public interface EmpleadoServiceI {

	List<Employee> getAllEmpleado();
	Employee newEmpleados(Employee employee);
	void deleteAllEmpleados(int employeeId);
	Employee updateAllEmpleados(Employee employee);
	
	
}
