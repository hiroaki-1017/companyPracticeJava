package bean;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

import org.mariadb.jdbc.Driver;


public class DbConnection {
//フィールド
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

//接続メソッド
	public void open() {
		try {
			Driver.class.getDeclaredConstructor().newInstance();
			con = DriverManager.getConnection("jdbc:mariadb://localhost/yakuzo2","root","");

		} catch (InstantiationException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			System.out.println("eee1");
		} catch (IllegalAccessException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			System.out.println("eee2");
		} catch (IllegalArgumentException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			System.out.println("eee3");
		} catch (InvocationTargetException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			System.out.println("eee4");
		} catch (NoSuchMethodException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			System.out.println("eee5");
		} catch (SecurityException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			System.out.println("eee6");
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			System.out.println("eee");
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
			// TODO 自動生成された catch ブロック
			e.printStackTrace();

		}
	}
}
