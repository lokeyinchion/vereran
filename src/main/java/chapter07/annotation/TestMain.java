package chapter07.annotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TestMain {

	public static void main(String []args)
			throws InstantiationException, IllegalAccessException {
		@SuppressWarnings({ "unchecked", "serial" })
		List<HashMap<String , String>>list = Arrays.asList(
				new HashMap<String , String>() {
					{
						put("name" , "xieyuooo");
						put("title" , "С��");
					}
				},
				new HashMap<String , String>() {
					{
						put("name" , "ffff");
						put("title" , "����2");
					}
				}
		);
		List<UserDO>users = new ArrayList<UserDO>(list.size());
		for(HashMap<String , String> row : list) {
			users.add(ConvertionService.convertMapToBean(row, UserDO.class));
		}
		for(UserDO user : users){
//			System.out.println(user.getUserName());
//			System.out.println(user.getUserTitle());
//			System.out.println(user.getEmpId());
//			System.out.println(user.getLoginTimes());
		}
		
		//�����ҿ��Խ�users���б�������
	}
}
