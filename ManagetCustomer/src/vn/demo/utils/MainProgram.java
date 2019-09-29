package vn.demo.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import vn.demo.bo.Customer;
import vn.demo.idao.CustomerDAOImpl;

public class MainProgram {
	public static Scanner scanner = new Scanner(System.in);
	public static CustomerDAOImpl b = new CustomerDAOImpl();
//	public static List<Customer> listCustomer = new ArrayList<Customer>();
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		boolean flag = true;
		do {
		System.out.println("----------MENU---------");
		System.out.println("1. Nhap");
		System.out.println("2. In danh sach");
		System.out.println("3. Xoa ");
		System.out.println("4. Chinh sua");
		System.out.println("5. Tim kiem theo ten");
		System.out.println("6. Thoat");
		System.out.print("Nhap lua chon cua ban: ");
		int n = Integer.parseInt(scanner.nextLine());
		switch (n) {
		case 1:
			System.out.println("1. Nhap");
			input();
			break;
		case 2:
			System.out.println("2. In danh sach");
			show();
			break;
		case 3:
			System.out.println("3. Xoa ");
			delete();
			break;
		case 4:
			System.out.println("4. Chinh sua");
			update();
			break;
		case 5:
			System.out.println("5. Tim kiem theo ten");
			findName();
			break;
		case 6:
			System.out.println("6. Thoat");
			flag = false;
			break;
		}
		} while (flag == true);
	}
	public static void delete() throws ClassNotFoundException, SQLException {
		Connection connection = connector_utils.getMyConnection();
		Statement statement = connection.createStatement();
		System.out.print("Enter the ID you want to delete : ");
		int ID = Integer.parseInt(scanner.nextLine());
		b.deleteCustomer(ID, statement);
	}
	
	public static void input() throws ClassNotFoundException, SQLException  {
		Connection connection = connector_utils.getMyConnection();
		Statement statement =  connection.createStatement();
		boolean flag = true;
		while(flag == true) {
		System.out.print("Name: ");
		String name = scanner.nextLine();
		System.out.print("Age: ");
		int age = Integer.parseInt(scanner.nextLine());
		System.out.print("Salary: ");
		double salary = Double.parseDouble(scanner.nextLine());
		Customer customer = new Customer(name, age, salary);
//		listCustomer.add(customer);
		b.addCustomer(customer, statement);
		System.out.print("You want to enter more(Y/N) ?");
		String n = scanner.nextLine();
		if(n.equals("Y")) flag = true;
		if(n.equals("N")) flag = false;
		}
	
	}
	public static void show() throws ClassNotFoundException, SQLException {
//		if(listCustomer.size() == 0) System.out.println("The list is empty");
		 b.showCustomer();
		
	}
	public static void update() throws ClassNotFoundException, SQLException {
		Connection connection = connector_utils.getMyConnection();
		Statement statement =  connection.createStatement();
		System.out.print("Name update : ");
		String nameUpdate = scanner.nextLine();
		System.out.print("Age update: ");
		int ageUpdate = Integer.parseInt(scanner.nextLine());
		System.out.print("Salary update: ");
		double salaryUpdate = Double.parseDouble(scanner.nextLine());
		Customer customerUpdate = new Customer(nameUpdate,ageUpdate,salaryUpdate);
		b.updateCustomer(customerUpdate, statement);
		
	}
	
	public static void findName() throws ClassNotFoundException, SQLException {
		System.out.print("Enter the name you want to find: ");
		String nameFind = scanner.nextLine();
		b.findCustomerByName(nameFind);
	}
}

