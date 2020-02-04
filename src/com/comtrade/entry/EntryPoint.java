package com.comtrade.entry;

import java.util.*;

public class EntryPoint {

	public static void main(String[] args) {

		List<Integer> firstList = new ArrayList<Integer>();
		firstList.add(1);
		firstList.add(2);
		firstList.add(3);
		firstList.add(5);
		firstList.add(6);

		List<Integer> secondList = new ArrayList<Integer>();
		secondList.add(2);
		secondList.add(3);
		secondList.add(8);

		List<Integer> thirdList = new ArrayList<Integer>();

		for (int i = 0; i < firstList.size(); i++) {
			for (int j = 0; j < secondList.size(); j++) {
				if (firstList.get(i).equals(secondList.get(j))) {
					thirdList.add(i);
					System.out.println(firstList.get(i));
				}
			}
		}
	}
}

//		for (int i : firstList) {
//			if (secondList.contains(i)) {
//				thirdList.add(i);
//			}
//		}
//		System.out.println(thirdList);
//	}
//}
