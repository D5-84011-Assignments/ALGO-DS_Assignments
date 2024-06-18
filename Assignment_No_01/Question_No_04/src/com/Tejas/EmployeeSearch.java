package com.Tejas;

public class EmployeeSearch {

	    // Search by empId
	    public static int searchByEmpId(Employee[] employees, int empId) {
	        int comparisons = 0;
	        for (int i = 0; i < employees.length; i++) {
	            comparisons++;
	            if (employees[i].empId == empId) {
	                System.out.println("Search by EmpId Comparisons: " + comparisons);
	                return i;
	            }
	        }
	        System.out.println("Search by EmpId Comparisons: " + comparisons);
	        return -1;
	    }

	    // Search by name
	    public static int searchByName(Employee[] employees, String name) {
	        int comparisons = 0;
	        for (int i = 0; i < employees.length; i++) {
	            comparisons++;
	            if (employees[i].name.equals(name)) {
	                System.out.println("Search by Name Comparisons: " + comparisons);
	                return i;
	            }
	        }
	        System.out.println("Search by Name Comparisons: " + comparisons);
	        return -1;
	    }

	    // Search by salary
	    public static int searchBySalary(Employee[] employees, double salary) {
	        int comparisons = 0;
	        for (int i = 0; i < employees.length; i++) {
	            comparisons++;
	            if (employees[i].salary == salary) {
	                System.out.println("Search by Salary Comparisons: " + comparisons);
	                return i;
	            }
	        }
	        System.out.println("Search by Salary Comparisons: " + comparisons);
	        return -1;
	    }

	    public static void main(String[] args) {
	        Employee[] employees = {
	            new Employee(101, "Kunal", 75000),
	            new Employee(102, "Shubham", 50000),
	            new Employee(103, "Chetan", 60000),
	            new Employee(104, "Tejas", 75000),
	            new Employee(105, "Rahul", 50000)
	        };

	        int empId = 103;
	        String name = "Tejas";
	        double salary = 50000;

	        // Search by empId
	        int empIdResult = searchByEmpId(employees, empId);
	        System.out.println("Employee found by EmpId: " + (empIdResult != -1 ? employees[empIdResult] : "Not Found"));

	        // Search by name
	        int nameResult = searchByName(employees, name);
	        System.out.println("Employee found by Name: " + (nameResult != -1 ? employees[nameResult] : "Not Found"));

	        // Search by salary
	        int salaryResult = searchBySalary(employees, salary);
	        System.out.println("Employee found by Salary: " + (salaryResult != -1 ? employees[salaryResult] : "Not Found"));
	    }
	}

	
