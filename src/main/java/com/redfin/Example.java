package com.redfin;

import java.util.*;

public class Example {
	public static void main(String[] args) {
		System.out.println("hello");
		newArrayList(newLinkedHashSet(new ArrayList()));
	}

	public static <E> LinkedHashSet<E> newLinkedHashSet(Iterable<? extends E> elements) {
		return null;
	}

	public static <E> ArrayList<E> newArrayList(Iterable<? extends E> elements) {
		return null;
	}

	public static <E> ArrayList<E> newArrayList(Iterator<? extends E> elements) {
		return null;
	}
}