package api;

import java.util.ArrayList;
import java.util.HashMap;

import lombok.ToString;
import model.domain.Guest;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@ToString(includeFieldNames=false)
public class HashMapTest {
	
	public static void main(String[] args) {
		
		//���� ������ ������
		ArrayList nonIncluded = new ArrayList();
		nonIncluded.add(new Guest("Suk", 101, 7, 2));
		nonIncluded.add(new Guest("Woo", 301, 2, 4));
		
		//���� ���� ������
		ArrayList included = new ArrayList();
		included.add(new Guest("Lee", 201, 9, 3));
		included.add(new Guest("Park", 401, 1, 2));
		included.add(new Guest("Kim", 501, 3, 1));
		
		//���� ����
		HashMap<String, ArrayList> breakfast = new HashMap<>();
		breakfast.put("included", included);
		breakfast.put("nonIncluded", nonIncluded);
		
		//�����߽ļ��� �� ����
		HashMap<String, HashMap> meal = new HashMap<>();
		meal.put("breakfast", breakfast);
//		meal.put("lunch", lunch);
//		meal.put("dinner", dinner);
		
		System.out.println("1-----������ ���Ե��� ���� ������ ��� ���-----");
		JSONArray jsonArray = JSONArray.fromObject( nonIncluded );  
		System.out.println( jsonArray );
		System.out.println();		
		
		System.out.println("2-----������ ���Ե��� ���� ������ �迭�� 2��° �� ���-----");
		System.out.println(((ArrayList)meal.get("breakfast").get("nonIncluded")).get(1));
		System.out.println();
		
		System.out.println("3-----������ ���Ե� ������ ��� ���-----");
		JSONArray jsonArray2 = JSONArray.fromObject( included );  
		System.out.println( jsonArray2 );  
		System.out.println();
		
		System.out.println("4-----������ ����/������ ��� ���-----");
		JSONArray jsonArray3 = JSONArray.fromObject( breakfast );  
		System.out.println( jsonArray3 );  
		System.out.println();
		
		System.out.println("5-----�ؽ����� json Ÿ������ ��ȯ	:���� ���-----");
		JSONObject jsonObject = JSONObject.fromObject( meal );  
		System.out.println( jsonObject );  
	}
}
/*��°�
1-----������ ���Ե��� ���� ������ ��� ���-----
[{"lastname":"Suk","person":2,"room":101,"stay":7},{"lastname":"Woo","person":4,"room":301,"stay":2}]

2-----������ ���Ե��� ���� ������ �迭�� 2��° �� ���-----
Guest(lastname=Woo, room=301, stay=2, person=4)

3-----������ ���Ե� ������ ��� ���-----
[{"lastname":"Lee","person":3,"room":201,"stay":9},{"lastname":"Park","person":2,"room":401,"stay":1},{"lastname":"Kim","person":1,"room":501,"stay":3}]

4-----������ ����/������ ��� ���-----
[{"nonIncluded":[{"lastname":"Suk","person":2,"room":101,"stay":7},{"lastname":"Woo","person":4,"room":301,"stay":2}],"included":[{"lastname":"Lee","person":3,"room":201,"stay":9},{"lastname":"Park","person":2,"room":401,"stay":1},{"lastname":"Kim","person":1,"room":501,"stay":3}]}]

5-----�ؽ����� json Ÿ������ ��ȯ	:	���� ���-----
{"breakfast":{"nonIncluded":[{"lastname":"Suk","person":2,"room":101,"stay":7},{"lastname":"Woo","person":4,"room":301,"stay":2}],"included":[{"lastname":"Lee","person":3,"room":201,"stay":9},{"lastname":"Park","person":2,"room":401,"stay":1},{"lastname":"Kim","person":1,"room":501,"stay":3}]}}
 */