package excercise2lab4.com.cg.eis.bean;

public class Employee 
{
    public int id;
    public double salary;
    public String name,designation,insuranceScheme;

	public Employee(int id, String name, String designation,String insuranceScheme,double salary)
	{

		super();
 		this.id = id;
 		this.name = name;
 		this.designation = designation;
 		this.insuranceScheme = insuranceScheme;
 		this.salary = salary;
 	}

	public void Employee(Employee person) 
	{
		// TODO Auto-generated method stub
		
	}
}


