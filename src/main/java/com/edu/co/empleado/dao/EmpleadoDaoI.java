package com.edu.co.empleado.dao;

import java.util.List;
import com.edu.ue.model.Employee;

public interface EmpleadoDaoI {

	List<Employee> getEmpleados();
	void deleteEmpleados(int employeeId);
	Employee createEmpleados(Employee employee);
	Employee updateEmpleados(Employee employee);
	
}
