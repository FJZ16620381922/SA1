package Dao;

import java.sql.*;

public class getConnection {
	 private  static  String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";//������ģ�ȫ���綼һ��
	    private static String user="sa";//�û���
	    private static String pwd="520226yg";//����	
	    private static  String url="jdbc:sqlserver://127.0.0.1:1433;databaseName=pubs";//���ݿ����ӡ���ʽ�����ݿ�����+IP+�˿�+����
	    public static Connection getLink()
	    {
	        try
	        {
	            Class.forName(driverName);
	            return DriverManager.getConnection(url,user,pwd);
	        }catch (Exception e)
	        {
	            e.printStackTrace();
	            System.out.println(e);
	        }
	        return null;
	    }
	   public static void Close(Connection conn)
	    {
	        try
	        {
	            conn.close();
	        }catch(Exception e)
	        {
	            e.printStackTrace();
	            System.out.println(e);
	        }
	    }
	    public static void Close(Connection conn,CallableStatement call)
	    {
	        try
	        {
	            conn.close();
	            call.close();
	        }catch (Exception e)
	        {
	            System.out.println(e);
	            e.printStackTrace();
	        }
	    }
}
