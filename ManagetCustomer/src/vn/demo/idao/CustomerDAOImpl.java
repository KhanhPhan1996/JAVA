package vn.demo.idao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import vn.demo.bo.Customer;
import vn.demo.utils.connector_utils;

public class CustomerDAOImpl implements IcustomerDAO{
	
	@Override
	public List<Customer> showCustomer() throws ClassNotFoundException, SQLException {
		List<Customer> list = new ArrayList<Customer>();
		Connection connection = connector_utils.getMyConnection();
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM customers ";
		ResultSet resultSet = statement.executeQuery(sql);
		System.out.printf("%-10s %-14s %-12s %-14s","ID","NAME","AGE","SALARY");
		System.out.println();
		while (resultSet.next()) {
			int ID = resultSet.getInt(1);
			String name = resultSet.getString(2);
			int age = resultSet.getInt(3);
			double salary = resultSet.getDouble(5);
			System.out.printf("%-11d", ID);
			System.out.printf("%-15s", name);
			System.out.printf("%-13d", age);
			System.out.printf("%-15f", salary);
			System.out.println();

		}
		return list;
		
	}

	@Override
	public void addCustomer(Customer customer, Statement statement) throws SQLException {
		System.out.println("----------INSERT----------");
		String sql = "insert into customers (Name,Age,Salary) "
				+ "values (" + "'" + customer.getName() + "'" + "," + customer.getAge() + "," + customer.getSalary() + ")"; 
		int rowCount = statement.executeUpdate(sql);
		System.out.println("Sql insert : " + sql);
		System.out.println("Row count affected = " + rowCount);
		
	}

	@Override
	public void updateCustomer(Customer customer, Statement statement) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println(("----------UPDATE----------"));
		System.out.print("Enter the id you want to update: ");
		int id = scanner.nextInt();
		String sql = "UPDATE customers SET Name = '" + customer.getName() + "', Age = " + customer.getAge() + ", Salary = " +customer.getSalary() + 
				" WHERE ID = " + id ;
		int rowCount = statement.executeUpdate(sql);
		System.out.println("Sql update : " + rowCount);
		System.out.println("Row count affected = " + rowCount);
		
	}

	@Override
	public void deleteCustomer(int ID, Statement statement) throws ClassNotFoundException, SQLException {
		String sql = "DELETE FROM customers WHERE ID = " + ID ;
		int rowCount = statement.executeUpdate(sql);
		System.out.println("Row count affected = " + rowCount);
		
	}

	@Override
	public List<Customer> findCustomerByName(String name) throws ClassNotFoundException, SQLException {
		List<Customer> listName = new ArrayList<Customer>();
		Connection connection = connector_utils.getMyConnection();
		Statement statement = connection.createStatement();
		Scanner scanner = new Scanner(System.in);
		System.out.println("----------FIND--------");
		String sql = "SELECT * FROM customers WHERE name = '" + name + "'";
		ResultSet resultSet = statement.executeQuery(sql);
		System.out.printf("%-10s %-14s %-12s %-14s","ID","NAME","AGE","SALARY");
		System.out.println();
		while (resultSet.next()) {
			int ID = resultSet.getInt(1);
			name = resultSet.getString(2);
			int age = resultSet.getInt(3);
			double salary = resultSet.getDouble(5);
			System.out.printf("%-11d", ID);
			System.out.printf("%-15s", name);
			System.out.printf("%-13d", age);
			System.out.printf("%-15f", salary);
			System.out.println();
		}
		return listName;
	}

	
	

}
