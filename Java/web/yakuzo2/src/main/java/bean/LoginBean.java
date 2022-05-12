package bean;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class LoginBean extends DbConnection {
	//外から直接アクセスできないようにprivateフィールド
	private String shain_code = "";
	private String shain_name = "";
	private String password = "";
	private String tenpo_code = "";
	private String tenpo_name = "";
	private String kengen_code = "";
	private String kengen_name = "";

	private String msg = "";
	private List<Map<String,String>> list;

	//外から変更できるようにするgetter,setter
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<Map<String, String>> getList() {
		return list;
	}
	public void setList(List<Map<String, String>> list) {
		this.list = list;
	}

	//コンストラクタ
	public LoginBean() {
		TorihikisakiBean tb = new TorihikisakiBean();
		list = tb.getTenpoList();
	}

	//checkメソッド
	public boolean check() {
		//存在チェック

		StringBuilder sql = new StringBuilder();
		sql.append("select ");
		sql.append("ms.shain_name,");
		sql.append("ms.kengen_code, ");
		sql.append("mk.kengen_name ");
		sql.append("from ");
		sql.append("mst_shain as ms join mst_kengen as mk ");
		sql.append("on ms.kengen_code = mk.kengen_code ");
		sql.append("where ");
		sql.append("ms.shain_code = ? and ms.password = ? and ms.delete_flg = '0'");

		open();
		try {
			ps = con.prepareStatement(sql.toString());
			ps.setString(1, shain_code);
			ps.setString(2, password);

			rs = ps.executeQuery();

			if(rs.next()) {

			} else {
				msg = "社員コード、パスワードは存在しません";
				close();
				return false;
			}

			if(kengen_code.equals("002")&&tenpo_code.equals("")) {
				msg = "店舗権限者は店舗選択しろ";
				close();
				return false;
			}

			if(kengen_code.equals("001")) {
				tenpo_code = "";
				tenpo_name = "";
			} else {

				//店舗名を取得
				sql = new StringBuilder();
				sql.append("select torihikisaki_name from mst_torihikisaki where torihikisaki_code = ?");

				ps = con.prepareStatement(sql.toString());
				ps.setString(1, tenpo_code);
				rs = ps.executeQuery();
				rs.next();
				tenpo_name = rs.getString("tenpo_code");
			}

		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			System.out.println("おいいいい");
		}


		close();
		return true;

	}
}
