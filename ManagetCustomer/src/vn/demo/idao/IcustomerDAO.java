package vn.demo.idao;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import vn.demo.bo.Customer;

public interface IcustomerDAO {
	public List<Customer> showCustomer() throws ClassNotFoundException, SQLException;
	public void addCustomer(Customer customer, Statement statement) throws SQLException;
	public void deleteCustomer(int ID, Statement statement) throws ClassNotFoundException, SQLException;
	public List<Customer> findCustomerByName(String name) throws ClassNotFoundException, SQLException;
	public void updateCustomer(Customer customer, Statement statement) throws SQLException;
}
