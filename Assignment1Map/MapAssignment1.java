package collectionsBasicAssignments;

import java.util.*;

public class MapAssignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer,String> map = new HashMap<>();
		for(int i=0;i<4;i++) {
			System.out.println("----------------------------");
			int id = sc.nextInt();
			String course = sc.next();
			map.put(id, course);
		}
		System.out.println(map);
		System.out.println("----------------------------");

		System.out.println("please enter the key to get the value");
		int key = sc.nextInt();
		String value = map.get(key);
		System.out.println("value for the entered key is : " + value);


	}

}
