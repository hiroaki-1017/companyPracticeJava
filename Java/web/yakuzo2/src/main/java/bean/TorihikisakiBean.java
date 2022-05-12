package bean;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TorihikisakiBean extends DbConnection {
	public List<Map<String,String>> getTenpoList() {
		List<Map<String,String>> list = new ArrayList();
		Map<String,String> map;

		//SQL
		String sql = "select torihikisaki_code,torihikisaki_name from mst_torihikisaki where torihikisaki_kbn = '2' and delete_flg = '0'";

		open();

		try {
			//SQL分をpsに渡す
			ps = con.prepareStatement(sql);
			//executeQueryでSQL分を実行しrsに入れる
			rs = ps.executeQuery();

			while(rs.next()) {
				map = new HashMap();
				map.put("tenpo_code", rs.getString("torihikisaki_code"));
				map.put("tenpo_name", rs.getString("torihikisaki_name"));
				list.add(map);
			}
			System.out.println("yoi");
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			System.out.println("aadaa");
		}
		close();

		return list;
	}
}
