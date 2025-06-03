package javaproject;

import java.util. ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;

public class AllList{

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Cherry");
		
		System.out.println("ArrayList contents:");
		for (String item : arrayList) {
			System.out.println(item);
		}
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(0);
		linkedList.add(20);
		linkedList.add(30);
		
		System.out.println("LinkedList contents:");
		for (String item : arrayList) {
			System.out.println(item);
		}
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("bhagya");
		hashSet.add("bhargavi");
		hashSet.add("mahathi");
		hashSet.add("harshi");
		
		System.out.println("HashSet contents:"+hashSet);
        HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
       
        hashMap.put("bhargavi",2);
        hashMap.put("bhagie",3);
          System.out.println("HashMap contents:"+hashMap);
}
}
