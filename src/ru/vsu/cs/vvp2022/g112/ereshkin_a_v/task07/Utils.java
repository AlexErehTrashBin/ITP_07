package ru.vsu.cs.vvp2022.g112.ereshkin_a_v.task07;

import java.util.*;

import static ru.vsu.cs.vvp2022.g112.ereshkin_a_v.task07.Main.solution;

public class Utils {
	// Строка -> массив целых чисел
	// ©️ Соломатин
	public static int[] toIntArray(String str) {
		Scanner scanner = new Scanner(str);
		scanner.useLocale(Locale.ROOT);
		scanner.useDelimiter("(\\s|[,;])+");
		List<Integer> list = new ArrayList<>();
		while (scanner.hasNext()) {
			list.add(scanner.nextInt());
		}

		// из List<Integer> можно получить Integer[]
		Integer[] arr = list.toArray(new Integer[0]);
		// Integer[] -> int[]
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			// автоматическая распаковка из объекта
			result[i] = arr[i];
		}
		return result;
	}

	// Чтение массива целых чисел из консоли
	// ©️ Соломатин
	public static int[] readIntArrayFromConsole() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("Введите массив: ");
				String line = scanner.nextLine();
				return toIntArray(line);
			} catch (Exception e) {
				System.out.print("Вы ошиблись, попробуйте еще раз! ");
			}
		}
	}

	/**
	 * Метод для вычленения одного массива из другого по двум индексам (начальному и конечному).
	 *
	 * @param array      исходный массив (из него будет происходить создание нового массива)
	 * @param startIndex начальный индекс (индексация начинается с 0)
	 * @param endIndex   конечный индекс
	 */
	public static int[] extractArrayFromArray(int[] array, int startIndex, int endIndex) {
		int[] resultArray = new int[endIndex - startIndex + 1];
		int fillIndex = 0;
		for (int i = startIndex; i <= endIndex; i++) {
			resultArray[fillIndex] = array[i];
			fillIndex++;
		}
		return resultArray;
	}

	/**
	 * Метод для вывода тестов в консоль. Высчитывает результат при помощи функции solution.
	 * Пример вывода: [1, 0] -> [1, 0].
	 *
	 * @param input входной массив, на базе которого потом будет высчитываться результат.
	 */
	public static void printInputAndResult(int[] input) {
		System.out.printf(
				"%s -> %s. %n",
				Arrays.toString(input),
				Arrays.toString(
						solution(input)
				));
	}
}
