package excercise2lab4.com.cg.eis.pl;
import java.util.*;
import excercise2lab4.com.cg.eis.bean.Employee;
import excercise2lab4.com.cg.eis.service.EmpServices;
import excercise2lab4.com.cg.eis.service.EmployeeService;

public class InvokeServices 
{
	InvokeServices()
	{
		EmployeeService x1=new EmployeeService();
		Employee x2 = x1.getEmpDetails();
		int n;
		double salary;
		String scheme = null;
		System.out.println("Enter the service required : ");  
		System.out.println("\n1.Enter employees details : ");  
		System.out.println("\n2.To check designation : ");  
		System.out.println("\n3.To check scheme: ");  
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();  
		switch(n)
		{
		case 1:
			Employee person = new Employee(x2.id,x2.name,x2.designation,scheme, x2.salary);
			x2.Employee(person);
		case 2:
			System.out.println("Enter salary : ");  
			salary=sc.nextInt();  
			System.out.println("Designation :  " +x1.getdesignation(salary)); 
		case 3:
			System.out.println("Enter salary : ");  
			salary=sc.nextInt();  
			scheme = x1.insuranceScheme(x1.getdesignation(salary),salary);
			System.out.println("Scheme :  " +scheme);
		}
	}
	public static void main(String[] args)
	{
		InvokeServices is1=new InvokeServices();
	}

}
