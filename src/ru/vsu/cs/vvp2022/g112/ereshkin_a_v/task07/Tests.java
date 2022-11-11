package ru.vsu.cs.vvp2022.g112.ereshkin_a_v.task07;

import static ru.vsu.cs.vvp2022.g112.ereshkin_a_v.task07.Utils.printInputAndResult;

public class Tests {
	public static void tests() {
		// Про определения ям для левой и правой границ (проверка на работоспособность)
		printInputAndResult(new int[]{0, 0, 1, 0});
		printInputAndResult(new int[]{0, 1, 0, 0});
		printInputAndResult(new int[]{15, 10, 5, 0});
		printInputAndResult(new int[]{0, 5, 10, 15});
		//
		printInputAndResult(new int[]{2, 1, 3, 3, 3, 3, 2, 1, 2, 3});
		//
		printInputAndResult(new int[]{2, 1, 1, 1, 1, 2, 3, 3, 3, 3, 2, 1, 2, 3});
		// Пример Соломатина
		printInputAndResult(new int[]{3, 3, 4, 8, 8, 10, 7, 4, 10, 7, 7, 4, 3, 3, 8, 9, 1});

		printInputAndResult(new int[]{6, 9, 8, 1, 13, 14, 9, 4, 7, 7, 14, 3, 0, 3});
		// Про ямы одинаковой длины
		printInputAndResult(new int[]{15, 14, 7, 11, 8, 6, 5});
		// Про ямы длиной <= 2
		printInputAndResult(new int[]{2, 3});
		printInputAndResult(new int[]{3, 2});
		printInputAndResult(new int[]{3});
		// Проверка на последовательность из нескольких элементов, каждый из которых - одно и то же число.
		printInputAndResult(new int[]{3, 3, 3, 3});
	}
}
