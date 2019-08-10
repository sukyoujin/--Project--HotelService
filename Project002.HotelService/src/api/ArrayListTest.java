package api;

import java.util.ArrayList;

import model.domain.Guest;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		ArrayList guest = new ArrayList();
		guest.add(new Guest("Suk", 101, 7, 2));
		guest.add(new Guest("Lee", 201, 9, 3));
		guest.add(new Guest("Woo", 301, 2, 4));
		guest.add(new Guest("Park", 401, 1, 2));
		guest.add(new Guest("Kim", 501, 3, 1));
		
		ArrayList<String> breakfast = new ArrayList<>();
		breakfast.add("fruit");
		breakfast.add("bread");
		breakfast.add("meat");
	}

}
