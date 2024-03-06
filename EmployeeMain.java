package st;

class Employee
{
  public int salary;
  //attribute od employee class
  public Employee(int sal) //special type of method // constructor
  {
	  salary=sal;
  }
  public void work() //a method of class
  {
	  System.out.println("Working as a employee");
  }
  public int getSalary()
  {
	  return salary;
  }
}
class Manager extends Employee
{
 public Manager(int sal) {
	 super(sal);
	 
 }
 public void work()
{
  System.out.println("Managing the employee");
}
 public void addEmployee()
 {
   System.out.println("Addning the no of employee");
 }

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee emp= new Employee(20000);
		Manager man=new Manager(30000);
		emp.work();
		System.out.println("Employee Salary" +emp.getSalary());
	     man.work();
	     System.out.println("Manage Employee salary:"+emp.getSalary());
	}
		// TODO Auto-generated method stub

	}

}
