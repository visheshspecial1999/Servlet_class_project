package crud_operation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import crud_operation.connection.JdbcConnection;
import crud_operation.dto.Laptop;

public class LaptopDao {

	// insertLaptop method
		public String insertLaptop(Laptop laptop) {
			// call the getConnection method and store the connection in Connection
			// interface
			Connection connection = JdbcConnection.getConnection();

			String insert = "insert into laptop values(?,?,?)";
			// create statement(PrepartedStatement)
			PreparedStatement preparedStatement;
			try {
				preparedStatement = connection.prepareStatement(insert);

				preparedStatement.setInt(1, laptop.getLaptopId());
				preparedStatement.setString(2, laptop.getLaptopName());
				preparedStatement.setDouble(3, laptop.getLaptopPrice());

				// execute query
				boolean b = preparedStatement.execute();
				if (b == false) {
					return "<h3 style='color:green'>data...............inserted</h3>";
				} else {
					return "<h3 style='color:red'>error</h3>";
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// close connection

			finally {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return null;
		}
		
		
		//displayLaptop method 
				public List<Laptop> displayLaptop() {
					List<Laptop> li = new ArrayList();
					// call the getConnection method and store the connection in Connection
					// interface
				Connection connection	=JdbcConnection.getConnection();

					String select = "select * from laptop";
					// create statement(PrepartedStatement)
					PreparedStatement preparedStatement;
					try {
						preparedStatement = connection.prepareStatement(select);

						// execute query
						ResultSet resultSet = preparedStatement.executeQuery();
						while (resultSet.next()) {
							Laptop laptop=new Laptop();
							laptop.setLaptopId(resultSet.getInt("laptopId"));
							laptop.setLaptopName(resultSet.getString("laptopName"));
							laptop.setLaptopPrice(resultSet.getDouble("laptopPrice"));
							li.add(laptop);
							
						}return li;
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					// close connection
					finally {
						try {
							connection.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					return null;	
				}
}