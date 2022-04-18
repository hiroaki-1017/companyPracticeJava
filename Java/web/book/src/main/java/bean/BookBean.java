package bean;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mariadb.jdbc.Driver;

public class BookBean {
	private List<Map<String,Object>> list;

	public List<Map<String, Object>> getList() {
		return list;
	}

	public void setList(List<Map<String, Object>> list) {
		this.list = list;
	}

	public void getBooks() {
		try {
			Driver.class.getDeclaredConstructor().newInstance();
			Connection con = DriverManager.getConnection("jdbc:mariadb://127.0.0.1/mybook","root","");

			System.out.println("接続成功");

			String sql = "select * from books";
			PreparedStatement ps = con.prepareStatement(sql.toString());
			System.out.println(ps);

			ResultSet rs = ps.executeQuery();
        	System.out.println(rs);

        	list = new ArrayList<Map<String,Object>>();

        	while(rs.next()) {
        		Map<String, Object> map = new HashMap<String, Object>();
        		map.put("id", rs.getString("id"));
        		map.put("title", rs.getString("title"));
        		map.put("another", rs.getString("another"));
        		map.put("publish", rs.getString("publisher"));
        		map.put("date", rs.getString("date"));

        		list.add(map);
        	}
        	System.out.println("接続成功");

        	rs.close();
        	ps.close();
        	con.close();

		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			System.out.println("エラー");

		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			System.out.println("エラー");
		}

	}
}
