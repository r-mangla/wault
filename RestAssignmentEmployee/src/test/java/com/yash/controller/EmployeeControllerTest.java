package com.yash.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yash.model.Employee;
import com.yash.service.EmployeeServiceImpl;

@RunWith(SpringRunner.class)
@WebMvcTest(value = EmployeeController.class)
public class EmployeeControllerTest {

	/*
	 * @Autowired private MockMvc mockMvc;
	 * 
	 * @MockBean private EmployeeServiceImpl employeeService;
	 * 
	 * @Test public void shouldReturnListOfEmployeesInJSONFormat() throws Exception
	 * { List<Employee> employees = Arrays.asList(new Employee(101, "employeeName1",
	 * 1000.0), new Employee(102, "employeeName2", 2000.0));
	 * 
	 * when(employeeService.getAllEmployees()).thenReturn(employees);
	 * 
	 * RequestBuilder requestBuilder =
	 * get("/employees").accept(MediaType.APPLICATION_JSON);
	 * 
	 * mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk())
	 * .andExpect(MockMvcResultMatchers.jsonPath("$[0].name", is("employeeName1")))
	 * .andExpect(MockMvcResultMatchers.jsonPath("$[0].salary", is(1000.0)))
	 * .andExpect(MockMvcResultMatchers.jsonPath("$[1].name", is("employeeName2")))
	 * .andExpect(MockMvcResultMatchers.jsonPath("$[1].salary", is(2000.0)));
	 * 
	 * verify(employeeService, times(1)).getAllEmployees();
	 * 
	 * }
	 * 
	 * @Test public void shouldReturnEmployeeInJSONFormatWhenIdIsGiven() throws
	 * Exception { Employee employee = new Employee(101, "employeeName", 1000.0);
	 * 
	 * when(employeeService.getEmployee(101)).thenReturn(employee);
	 * 
	 * RequestBuilder requestBuilder =
	 * get("/employees/101").accept(MediaType.APPLICATION_JSON);
	 * 
	 * mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk())
	 * .andExpect(MockMvcResultMatchers.jsonPath("$.name", is("employeeName")))
	 * .andExpect(MockMvcResultMatchers.jsonPath("$.salary", is(1000.0)));
	 * 
	 * verify(employeeService, times(1)).getEmployee(101);
	 * 
	 * }
	 * 
	 * @Test public void shouldAddEmployeeWhenInputIsInJSON() throws Exception {
	 * Employee employee = new Employee(); employee.setName("employeeName");
	 * employee.setSalary(1000.0);
	 * 
	 * when(employeeService.addEmployee(employee)).thenReturn(employee);
	 * 
	 * RequestBuilder requestBuilder =
	 * post("/employees").accept(MediaType.APPLICATION_JSON)
	 * .contentType(MediaType.APPLICATION_JSON).content(asJsonString(employee));
	 * 
	 * mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk())
	 * .andExpect(MockMvcResultMatchers.jsonPath("$.name", is("employeeName")))
	 * .andExpect(MockMvcResultMatchers.jsonPath("$.salary", is(1000.0)));
	 * 
	 * verify(employeeService, times(1)).addEmployee(employee); }
	 * 
	 * @Test public void shouldUpdateEmployeeInJSONFormatWhenIdIsGiven() throws
	 * Exception { Employee employee = new Employee(); employee.setId(201);
	 * employee.setName("employeeName"); employee.setSalary(1000.0);
	 * 
	 * when(employeeService.updateEmployee(employee, 201)).thenReturn(employee);
	 * 
	 * RequestBuilder requestBuilder =
	 * put("/employees/201").accept(MediaType.APPLICATION_JSON)
	 * .contentType(MediaType.APPLICATION_JSON).content(asJsonString(employee));
	 * 
	 * mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk())
	 * .andExpect(MockMvcResultMatchers.jsonPath("$.id", is(201)))
	 * .andExpect(MockMvcResultMatchers.jsonPath("$.name", is("employeeName")))
	 * .andExpect(MockMvcResultMatchers.jsonPath("$.salary", is(1000.0)));
	 * 
	 * verify(employeeService, times(1)).updateEmployee(employee, 201); }
	 * 
	 * @Test public void shouldDeleteEmployeeWhenIdIsGiven() throws Exception {
	 * 
	 * doNothing().when(employeeService).deleteEmployee(201);
	 * 
	 * RequestBuilder requestBuilder = delete("/employees/201");
	 * 
	 * mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	 * 
	 * verify(employeeService, times(1)).deleteEmployee(201); }
	 * 
	 * public static String asJsonString(final Object obj) { try { return new
	 * ObjectMapper().writeValueAsString(obj); } catch (Exception e) { throw new
	 * RuntimeException(e); } }
	 */

}
