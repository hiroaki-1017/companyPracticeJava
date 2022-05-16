package com.example.yakuzo2.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.yakuzo2.data.HatchuData;

@Repository
public class YakuhinRepository {

	@Autowired
	JdbcTemplate jt;

	//薬品のデータ取ってくるところ
	public int y_sansho_getPages(HatchuData hd) {
		StringBuilder sql = new StringBuilder();
		List<Object> param = new ArrayList();

		sql.append("select count(*) as cnt ");
		sql.append("from mst_shohin ");
		// yakuhin
		if (!hd.getYakuhin().equals("")) {
			sql.append("where (");
			sql.append("jan_code = ? ");
			sql.append("or hanbai_name like ? ");
			sql.append(") ");
			param.add(hd.getYakuhin());
			param.add("%" + hd.getYakuhin() + "%");
		}
		// yakuhin_kbn
		if (!hd.getYakuhin_kbn().equals("")) {
			if (param.size() == 0) {
				sql.append("where ");
			} else {
				sql.append("and ");
			}
			sql.append("yakuhin_kbn = ?");
			param.add(hd.getYakuhin_kbn());
		}

		Map<String, Object> map = jt.queryForMap(sql.toString(), param.toArray());

		double rec = Double.parseDouble(map.get("cnt").toString());
		return (int) (Math.ceil(rec / 25));

	}

	//yakuhin表示処理repo
	public List<Map<String,Object>> getSanshoData(String yakuhin,String kbn,int page){
		StringBuilder sql = new StringBuilder();
		List<Object> param = new ArrayList();

		sql.append("select jan_code,yj_code,yakuhin_kbn,hanbai_name ");
		sql.append("from mst_shohin ");
		//yakuhin
		if(!yakuhin.equals("")) {
			sql.append("where (");
			sql.append("jan_code = ? ");
			sql.append("or hanbai_name like ? ) ");
			param.add(yakuhin);
			param.add("%" + yakuhin + "%");
		}
		//yakuhin_kbn
		if(!kbn.equals("")) {
			if(param.size() == 0) {
				sql.append("where ");
			} else {
				sql.append("or ");
			}
			sql.append("yakuhin_kbn = ? ");
			param.add(kbn);
		}
		//limit
		sql.append("limit ? , 25");
		param.add((page - 1) * 25);

		return jt.queryForList(sql.toString(),param.toArray());
	}
}
