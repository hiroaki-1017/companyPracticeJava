package bean;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TorihikisakiBean extends DbConnection {
//	店舗情報の提供
	public List<Map<String,String>> getTenpoList() {
		List<Map<String,String>> list = new ArrayList<Map<String,String>>();

		String sql = "select torihikisaki_code, torihikisaki_name from mst_torihikisaki where torihikisaki_kbn = '2' and delete_flg = '0'";

		open();

		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			while(rs.next()) {
				Map<String, String> map = new HashMap<String, String>();
				map.put("tenpo_code", rs.getString("torihikisaki_code"));
				map.put("tenpo_name", rs.getString("torihikisaki_name"));
				list.add(map);
			}

			close();

		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return list;
	}
}
