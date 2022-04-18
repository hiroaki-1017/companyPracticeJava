package bean;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class LoginBean extends DbConnection {

//	フィールド
	private String shain_code = "";
	private String shain_name = "";
	private String kengen_code = "";
	private String kengen_name = "";
	private String tenpo_code = "";
	private String tenpo_name = "";
	private String password = "";
	private List<Map<String,String>> list;
	private String msg = "";

//	コンストラクタ
	public LoginBean() {
		TorihikisakiBean tb = new TorihikisakiBean();
		list = tb.getTenpoList();
	}

//	getter,setter
	public String getShain_code() {
		return shain_code;
	}
	public void setShain_code(String shain_code) {
		this.shain_code = shain_code;
	}
	public String getShain_name() {
		return shain_name;
	}
	public void setShain_name(String shain_name) {
		this.shain_name = shain_name;
	}
	public String getKengen_code() {
		return kengen_code;
	}
	public void setKengen_code(String kengen_code) {
		this.kengen_code = kengen_code;
	}
	public String getKengen_name() {
		return kengen_name;
	}
	public void setKengen_name(String kengen_name) {
		this.kengen_name = kengen_name;
	}
	public String getTenpo_code() {
		return tenpo_code;
	}
	public void setTenpo_code(String tenpo_code) {
		this.tenpo_code = tenpo_code;
	}
	public String getTenpo_name() {
		return tenpo_name;
	}
	public void setTenpo_name(String tenpo_name) {
		this.tenpo_name = tenpo_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Map<String, String>> getList() {
		return list;
	}
	public void setList(List<Map<String, String>> list) {
		this.list = list;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public boolean check() {
		try {
			//SQL作成
			StringBuilder sql = new StringBuilder();
			sql.append("select ");
			sql.append("ms.shain_name,");
			sql.append("ms.kengen_code,");
			sql.append("mk.kengen_name ");
			sql.append("from ");
			sql.append("mst_shain ms join mst_kengen mk ");
			sql.append("on ms.kengen_code = mk.kengen_code ");
			sql.append("where ");
			sql.append("ms.shain_code = ? ");
			sql.append("and ms.password = ? ");
			sql.append("and ms.login_flg = '0' ");
			sql.append("and ms.delete_flg = '0'");
//			DBオープン
			open();
//			psインスタンス
			ps = con.prepareStatement(sql.toString());
//			パラメーターセット
			ps.setString(1, shain_code);
			ps.setString(2, password);

			rs = ps.executeQuery();

			if(rs.next()) {
				shain_name = rs.getString("shain_name");
				kengen_code = rs.getString("kengen_code");
				kengen_name = rs.getString("kengen_name");
				System.out.println(kengen_code);
				System.out.println(shain_name);
			} else {
				msg = "指定の社員コード、パスワードの組み合わせは存在しません";
				return false;
			}
			//関連チェック
			if(kengen_code.equals("002") && tenpo_code.equals("")) {
				msg = "店舗権限者は店舗の選択が必須です。";
				System.out.println("良い");
				return false;
			}

			//店舗情報の整理
			if(kengen_code.equals("001")) {
				tenpo_code = "";
				tenpo_name = "";
				return true;
			}

			String sql2 = "select torihikisaki_name from mst_torihikisaki where torihikisaki_code = ?";
			ps = con.prepareStatement(sql2);
			ps.setString(1, tenpo_code);
			rs = ps.executeQuery();
			rs.next();
			tenpo_name = rs.getString("trihikisaki_name");

			close();

			//権限名の取得

		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			System.out.println("キャッチ入った");
		}

		return true;
	}
}
