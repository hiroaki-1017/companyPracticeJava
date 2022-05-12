package bean;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class GuitarBean extends DbConnection {
	//フィールド
	private List<Map<String,Object>> list;
	private Map<String,Object> map;
	private String name;



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//getter,setter
	public List<Map<String, Object>> getList() {
		return list;
	}
	public void setList(List<Map<String, Object>> list) {
		this.list = list;
	}
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	public void getGuitarList() {
		list = new ArrayList<Map<String, Object>>();

		String sql = "select * from guitars";

		open();

		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			while(rs.next()) {
				map = new HashMap<String, Object>();
				map.put("id", rs.getInt("id"));
				map.put("name", rs.getString("name"));
				map.put("maker", rs.getString("maker"));
				map.put("type", rs.getString("type"));
				map.put("featuer", rs.getString("featuer"));
				map.put("famous_user", rs.getString("famous_user"));
				map.put("production_start", rs.getString("production_start"));
				map.put("images", rs.getString("images"));
				list.add(map);
			}

		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		close();

	}

	public void getInfo(HttpServletRequest request) {
		map = new HashMap<String, Object>();
		map.put("id", request.getParameter("id"));
		map.put("name", request.getParameter("name"));
		map.put("maker", request.getParameter("maker"));
		map.put("type", request.getParameter("type"));
		map.put("featuer", request.getParameter("featuer"));
		map.put("famous_user", request.getParameter("famous_user"));
		map.put("production_start", request.getParameter("production_start"));
		map.put("images", request.getParameter("images"));

	}



}
