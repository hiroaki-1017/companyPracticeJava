package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Howks implements GetInfo, Grades {
	List<Map<String,Object>>list;

	@Override
	public void makeList() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
			// TODO �����������ꂽ���\�b�h�E�X�^�u
		list = new ArrayList<Map<String,Object>>();

		Map<String,Object>map = new HashMap<String,Object>();
		map.put("name", "�O���V�A���E�K���V�A");
		map.put("homerun",9 );
		map.put("average", 0.292);
		map.put("stolenbase", 1);
		list.add(map);

		map =new HashMap<String,Object>();
		map.put("name", "���c�@��_");
		map.put("homerun",32 );
		map.put("average", 0.248);
		map.put("stolenbase", 3);
		list.add(map);

		map =new HashMap<String,Object>();
		map.put("name", "�f�X�p�C�l�E���h���Q�X");
		map.put("homerun",29 );
		map.put("average", 0.352);
		map.put("stolenbase", 0);
		list.add(map);

		map =new HashMap<String,Object>();
		map.put("name", "���c�@�I��");
		map.put("homerun",36 );
		map.put("average", 0.348);
		map.put("stolenbase", 21);
		list.add(map);

		map =new HashMap<String,Object>();
		map.put("name", "����@����");
		map.put("homerun",14 );
		map.put("average", 0.264);
		map.put("stolenbase", 23);
		list.add(map);

		showGrades();
		getBestHomerun();
		Map<String,Object>bestHomerun = getBestHomerun();
        System.out.println("�z�[����������" +bestHomerun.get("homerun") + "��" +bestHomerun.get("name") + "�ł����I");

		getBestAverage();
		Map<String,Object>bestaverage = getBestAverage();
        System.out.println("��ʑŎ҂�" +bestaverage.get("average") + "��" +bestaverage.get("name") + "�ł����I");

		getBestStolenbase();
		Map<String,Object>beststolenbase = getBestStolenbase();
        System.out.println("���ۉ���" +beststolenbase.get("stolenbase") + "��" +beststolenbase.get("name") + "�ł����I");

	}

	@Override
	public void showGrades() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		for(Map<String,Object>map : list) {
            System.out.println("���O�F"+ map.get("name"));
            System.out.println("�{�ۑ�:" +map.get("homerun"));
            System.out.println("�ŗ�:" +map.get("average"));
            System.out.println("����:" +map.get("stolenbase"));
            System.out.println("--------------------------");
		}
	}

	@Override
	public Map<String, Object> getBestHomerun() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Map<String,Object>bestHomerun = new HashMap<String,Object>();

		bestHomerun.put("name", "");
		bestHomerun.put("homerun", 0);

		for(Map<String,Object> map: list) {
			if((int)bestHomerun.get("homerun") < (int)map.get("homerun")) {
				bestHomerun.put("name", map.get("name"));
				bestHomerun.put("homerun", map.get("homerun"));

			}
		}
		return bestHomerun;
	}

	@Override
	public Map<String, Object> getBestAverage() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		Map<String,Object>bestAverag = new HashMap<String,Object>();

		bestAverag.put("name", "");
		bestAverag.put("average", 0);

		for(Map<String,Object> map: list) {
			if(Double.parseDouble(bestAverag.get("average").toString()) < Double.parseDouble(map.get("average").toString())) {
				bestAverag.put("name", map.get("name"));
				bestAverag.put("average", map.get("average"));

			}
		}
		return bestAverag;
	}

	@Override
	public Map<String, Object> getBestStolenbase() {
		Map<String,Object>bestStolenbase = new HashMap<String,Object>();

		bestStolenbase.put("name", "");
		bestStolenbase.put("stolenbase", 0);

		for(Map<String,Object> map: list) {
			if((int)bestStolenbase.get("stolenbase") < (int)map.get("homerun")) {
				bestStolenbase.put("name", map.get("name"));
				bestStolenbase.put("stolenbase", map.get("stolenbase"));

			}
		}
		return bestStolenbase;
	}

}
