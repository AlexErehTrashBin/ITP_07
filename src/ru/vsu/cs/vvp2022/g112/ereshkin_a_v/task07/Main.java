package ru.vsu.cs.vvp2022.g112.ereshkin_a_v.task07;

import static ru.vsu.cs.vvp2022.g112.ereshkin_a_v.task07.Tests.tests;
import static ru.vsu.cs.vvp2022.g112.ereshkin_a_v.task07.Utils.*;

public class Main {

    // Метод для получения наибольшей "ямы"
    public static int[] solution(int[] array) {
        //System.out.printf("Входной массив: %s. %n", Arrays.toString(array));
        if (array.length <= 2) {
            return array;
        }
        int resultSubsequenceStartIndex = 0;
        int resultSubsequenceEndIndex = 0;

        int currentStartIndex = 0;
        int currentIndex = 1;


        // Пробегает от начала до первого элемента массива который имеет значение не повторяющееся ранее
        for (int i = 1; i < array.length && array[i] == array[i - 1]; ++i) {
            currentIndex++;
        }
        if (currentIndex == array.length) {
            return array;
        }
        boolean isRising = array[currentIndex] > array[currentIndex - 1];
        int localSwaps = isRising ? 1 : 0;
        int localRepeats = 1;
        for (; currentIndex < array.length; currentIndex++) {
            boolean equalsPrevious = array[currentIndex] == array[currentIndex - 1];
            boolean isLocallyRising = array[currentIndex] > array[currentIndex - 1];
            if (equalsPrevious){
                if (localSwaps == 1) localRepeats++;
            } else {
                //if (localSwaps == 1) localRepeats = 1;
                if (isRising != isLocallyRising){
                    isRising = !isRising;
                    localSwaps++;
                }
                if (localSwaps == 2){
                    int resultLength = resultSubsequenceEndIndex - resultSubsequenceStartIndex + 1;
                    int currentLength = currentIndex - currentStartIndex;
                    if (resultLength < currentLength){
                        resultSubsequenceEndIndex = currentIndex - 1;
                        resultSubsequenceStartIndex = currentStartIndex;
                    }
                    currentStartIndex = currentIndex - localRepeats;
                    localRepeats = 1;
                    //currentIndex -= localRepeats;
                    localSwaps = 0;
                }
            }
        }
        currentIndex--;
        int resultLength = resultSubsequenceEndIndex - resultSubsequenceStartIndex + 1;
        int currentLength = currentIndex - currentStartIndex + localRepeats;
        if (resultLength <= currentLength){
            resultSubsequenceEndIndex = currentIndex;
            resultSubsequenceStartIndex = currentStartIndex - localRepeats + 1;
        }
        return extractArrayFromArray(array, resultSubsequenceStartIndex, resultSubsequenceEndIndex);
    }



    public static void main(String[] args) {
        tests();
        int[] input = readIntArrayFromConsole();
        printInputAndResult(input);
    }
}