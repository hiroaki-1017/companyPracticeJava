package bean;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class DbConnection {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	public void open() {
		try {
			Class.forName("org.mariadb.jdbc.Driver").getDeclaredConstructor().newInstance();
			con = DriverManager.getConnection("jdbc:mariadb://127.0.0.1/yakuzo2","root","");
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			if(Objects.nonNull(rs)) {
				rs.close();
			}
			ps.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
