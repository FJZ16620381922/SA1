package Dao;
import java.sql.*;

public class TestJdbc {
	public static void main(String []args)
	{
		Connection connection=getConnection.getLink();
		String sql="SELECT*FROM DataTable";
		try{
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		ResultSet resultSet=preparedStatement.executeQuery();
		while(resultSet.next())
		{
			String date=resultSet.getString(1);
			System.out.print(date);
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
