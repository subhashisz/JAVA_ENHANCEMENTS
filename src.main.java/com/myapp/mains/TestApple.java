package com.myapp.mains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import com.myapp.beans.Apple;

public class TestApple {

	public static final String GREEN = "green";

	public static void main(String[] args) {
		List<Apple> inventory = Arrays.asList(new Apple(80, "green"), new Apple(155, "green"), new Apple(120, "red"));
		Comparator<Apple> byWeight = (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());
		List<Apple> greenApples = filterApples(inventory, (Apple a) -> GREEN.equals(a.getColor()));

	}

	public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

}
