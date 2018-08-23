package com.class5;

abstract class SortInt {

	private int[] value; // int value = 0 초기값. int[] value 배열은 null

	protected abstract void sorting(); // 추상메소드 부모의 sorting(); 있지만 실행될께없어서
	                                   // 자식의 sorting();으로 가서 쓴다.

	public void sort(int[] value) {

		this.value = value;

		sorting();
	}

	public int length() {

		if (value == null)
			return 0;

		return value.length;
	}

	protected final int compare(int i, int j) {

		if (value[i] == value[j])
			return 0;
		else if (value[i] > value[j])
			return 1;
		else
			return -1;

	}

	// selection sort
	protected final void swap(int i, int j) {

		int temp;

		temp = value[i];

		value[i] = value[j];

		value[j] = temp;

	}

	public void print() {

		if (value == null)
			return;

		for (int n : value) {
			System.out.printf("%4d", n);
		}
		System.out.println();

	}

}

class SortTest extends SortInt {

	@Override
	protected void sorting() {

		// Selection Sort

		for (int i = 0; i < length() - 1; i++) {

			for (int j = i + 1; j < length(); j++) {

				if (compare(i, j) > 0) {

					swap(i, j);
				}
			}
		}

	}

}

public class Test8 {

	public static void main(String[] args) {

		int[] value = {56, 23, 87, 99, 12};

		SortTest ob = new SortTest();

		ob.sort(value);
		ob.print();

	}

}
