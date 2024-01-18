package javatest;

import java.util.ArrayList;
import java.util.List;

public class UserApp {

	public static void main(String[] args) {

		// User로 스테프,고객 관리
		List<User> sList = new ArrayList<User>();
		User s01 = new Staff("master", "m7788", "운영자", 3500000);
		User c01 = new Customer("jung-ws", "j1357913570", "정우성", 1000);
		User c02 = new Customer("LeeHR", "a123!!", "이효리", 2500);
		User c03 = new Customer("ms-park", "y2345", "박명수", 1200);

		sList.add(s01);
		sList.add(c01);
		sList.add(c02);
		sList.add(c03);

//		System.out.println(sList.toString());

		System.out.println("----------------------회원+운영자 전체리스트----------------------");

		for (int i = 0; i < sList.size(); i++) {
			System.out.print(i + 1 + ".");
			sList.get(i).showInfo();
//			System.out.println(i +1+ "."+ ((Staff)sList.get(i)).test()); 한번에 쓰고싶으면 return형으로 넣는수밖에 없음
		}

//		System.out.println("운영자 월급은 " + ((Staff) sList.get(0)).getSalary() * 12);이런식으로도 쓸 수 있음.
		((Staff) sList.get(0)).showSalary();
	}

}
