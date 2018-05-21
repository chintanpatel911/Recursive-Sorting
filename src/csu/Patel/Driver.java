package csu.Patel;

import java.util.ArrayList;
import java.util.Arrays;

public class Driver {

	// Goal : implement a 'simple' recursive selection sort algorithm

	public static void main(String[] args) {

		// ArrayList<Integer> list = new ArrayList<>();
		// list.add (66);
		// list.add (33);

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(55, 66,
				44, 11, 22, 33));

		System.out.println(list);

		// int posMax = findposMax(list, 0, list.size() - 1);
		// System.out.println(posMax + "\n" + list.get(posMax));

		recursiveSelectionSort(list, 0, list.size() - 1);

		System.out.println(list);

		// [55, 66, 44, 11, 22, 33]
		// [11, 22, 33, 44, 55, 66]

	}// main

	private static <E extends Comparable<E>> void recursiveSelectionSort(
			ArrayList<E> list, int first, int last) {
		// check the first and last element to see it is sorted or not
		if (first >= last) {
			return;
		}

		int posMax = findposMax(list, first, last);
		E temp = list.get(last);
		// look class book
		list.set(last, list.get(posMax));
		list.set(posMax, temp);

		recursiveSelectionSort(list, first, last - 1);
		// [55, 66, 44, 11, 22, 33]
		// [11, 22, 33, 44, 55, 66]

	}

	// ------------------------------------------------------------------------------------------------------
	// FindPosMax Method:
	private static <E> extends Comparable<E> int findposMax(ArrayList<E> list,
			int first, int last) {
		int posMax = first;
		E maxValue = list.get(posMax);
		for (int i = first + 1; i <= last; i++) {
			// if (maxValue < list.get(i)) {
			if (maxValue.compareTo(list.get(i)) < 0) {
				posMax = i;
				maxValue = list.get(i);
				// [55, 66, 44, 11, 22, 33]
				// [11, 22, 33, 44, 55, 66]

			}
		}
		return posMax;
	}

}
