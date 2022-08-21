package excercise2lab4.com.cg.eis.service;
import excercise2lab4.com.cg.eis.bean.Employee;
import java.util.*;
public interface EmpServices 
{
	public Employee getEmpDetails();
	public String insuranceScheme(String designation,double Salary);
	public void EmpDetails(Employee emp);
}
