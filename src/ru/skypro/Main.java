package ru.skypro;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(5, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        numsOdd(nums);
        numsEvenUnique(nums);
        List<String> str = new ArrayList<>(List.of("один", "два", "три", "один", "два", "один", "пять", "четыре"));
        strUnique(str);
        strNotUnique(str);
    }


    public static void numsOdd(List<Integer> nums) {
        List<Integer> numsOdd = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 != 0) {
                numsOdd.add(num);
            }
        }
        System.out.println(numsOdd);
    }

    public static void numsEvenUnique(List<Integer> nums) {
        Set<Integer> numsSet = new HashSet<>(nums);
        List<Integer> numsEvenUnique = new ArrayList<>();
        numsEvenUnique.addAll(numsSet);
        Collections.sort(numsEvenUnique);
        for (Integer num : nums) {
            if (num % 2 != 0) {
                numsEvenUnique.remove(num);
            }
        }
        System.out.println(numsEvenUnique.toString());
    }

    public static void strUnique(List<String> str) {
        Set<String> strSet = new HashSet<String>(str);
        System.out.println(strSet.toString());
    }

    public static void strNotUnique(List<String> str) {
        Set<String> strSet = new HashSet<String>();
        strSet.addAll(str);
        List<String> strListUnique = new ArrayList<>();
        strListUnique.addAll(strSet);
        int countDouble = 0;
        int countRepeatingElements = 0;
        for (String s : strListUnique) {
            if (Collections.frequency(str, s) > 1) {
                countRepeatingElements = countRepeatingElements + Collections.frequency(str, s);
                countDouble++;
            }
        }
        System.out.println("Количество повторяющихся элементов -- " + countRepeatingElements);
        System.out.println("Количество дублей -- " + countDouble);
    }
}
