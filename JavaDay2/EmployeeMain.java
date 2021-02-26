import java.util.Scanner;

public class EmployeeMain
{
	public static void main(String args[])
	{
		Employee obj = new Employee();
		obj.setName("LTTS");
		obj.setAddress("Mysore");
		obj.setMobile("123456789");
		System.out.println(obj.getName());
		System.out.println(obj.getAddress());
		System.out.println(obj.getMobile());
	}
}
