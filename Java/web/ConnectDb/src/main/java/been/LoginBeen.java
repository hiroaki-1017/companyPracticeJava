package been;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.mariadb.jdbc.Driver;

public class LoginBeen {

	private String id = "";
    private String pass = "";
    private String msg = "";
    private String shain_name ="";
    private String shain_code ="";


	public String getShain_code() {
		return shain_code;
	}



	public void setShain_code(String shain_code) {
		this.shain_code = shain_code;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getPass() {
		return pass;
	}



	public void setPass(String pass) {
		this.pass = pass;
	}



	public String getMsg() {
		return msg;
	}



	public void setMsg(String msg) {
		this.msg = msg;
	}



	public String getShain_name() {
		return shain_name;
	}



	public void setShain_name(String shain_name) {
		this.shain_name = shain_name;
	}



	public boolean check() {
        if(id == ""|| pass == "") {
              msg = "ID,パスワードは必須入力項目です。";
              return false;
        }

//        ドライバ
        try {
        	Driver.class.getDeclaredConstructor().newInstance();
            Connection con = DriverManager.getConnection("jdbc:mariadb://127.0.0.1/yakuzo2","root","");

            System.out.println("接続完了");

        	StringBuilder sql = new StringBuilder();
            sql.append("select shain_name, kengen_code ");
            sql.append("from mst_shain ");
            sql.append("where ");
            sql.append("shain_code= ? ");
            sql.append("and password = ? ");
            sql.append("and login_flg = '0' ");
            sql.append("and delete_flg = '0'");
        	PreparedStatement ps = con.prepareStatement(sql.toString());

        	ps.setString(1, id);
        	ps.setString(2, pass);

        	ResultSet rs = ps.executeQuery();
        	System.out.println(rs);
        	boolean ret = true;

        	System.out.println("接続完了2");

            if(rs.next()) {
                  shain_name = rs.getString("shain_name");
                  shain_code = rs.getString("kengen_code");
                  System.out.println("きてあ");
            } else {
            	System.out.println(rs.next());
                  msg = "このID,パスワードの組み合わせで有効なユーザは存在しません。";
                  ret = false;
            }

        	rs.close();
        	ps.close();
        	con.close();

        	return ret;

        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | SQLException e){
        	e.printStackTrace();
        	return false;
        }
  }


}
