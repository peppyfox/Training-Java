package excercise2lab4.com.cg.eis.service;
import excercise2lab4.com.cg.eis.bean.Employee;
import java.util.*;
import  excercise2lab4.com.cg.eis.service.EmpServices;

public class EmployeeService implements EmpServices
{

	
	public Employee getEmpDetails() 
	{
		int n;
		String designation;
		String insuranceScheme = null;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter employee id");
		int id = in.nextInt();
		System.out.println("Enter employee salary");
		double salary = in.nextDouble();
		System.out.println("Enter employee name");
		String name = in.next();
		designation= getdesignation(salary);
		

		
		Employee emp = new Employee(id,name,designation,insuranceScheme,salary);
		return emp;
			
	}

	public String getdesignation(double salary) 
	{
		String designation;
		if(salary<3000)
		{
			designation = "Clerk";
		}
		else if(salary>=3000&&salary<10000)
		{
			designation = "System Associate";
		}
		else if(salary>=10000&&salary<20000) 
		{
			designation = "Senior Associate";
		}
		else if(salary>=20000&&salary<40000)
		{
			designation = "Programmer";
		}
		else
		{
			designation = "Manager";
		}
		return(designation);
	}
	
	public String insuranceScheme(String designation,double salary) 
	{
		String scheme;
		if(designation == "Clerk")
			scheme = "No Scheme";
		else if(designation == "System Associate")
			scheme = "Scheme C";
		else if(designation == "Programmer")
			scheme = "Scheme B";
		else
			scheme = "Scheme A";
		return scheme;
	}

	public void EmpDetails(Employee emp) 
	{
		System.out.println("Employee id"+emp.id);
		System.out.println("Employee name"+emp.name);
		System.out.println("Employee designation"+emp.designation);
		System.out.println("Employee salary"+emp.salary);
		System.out.println("Employee insurancescheme"+emp.insuranceScheme);
		
	}
}
