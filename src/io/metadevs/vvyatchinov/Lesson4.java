package io.metadevs.vvyatchinov;

public class Lesson4 {

    public static void main(String[] args) {
        // 1980 - 1985 - выводить, какой это год
        int year = 1980;
        for (int j = 0; j < 6; j++) {
            System.out.println("Год " + year++);
        }
        // Массивы
        int[] arrayV1 = new int[5];
        System.out.println(arrayV1[4]);
        arrayV1[3] = 67;
        for (int j = 0; j < arrayV1.length; j++) {
            System.out.println(arrayV1[j]);
        }

        arrayV1 = new int[]{1, 2, 3, 4, 5};
        arrayV1[4] = 78;
        System.out.println(arrayV1[4]);

        for (int j = 0; j < arrayV1.length; j++) {
            System.out.println(arrayV1[j]);
        }

        for (int item : arrayV1) {
            System.out.println(item);
        }

        doubleArrayPrint();
    }

    public static void doubleArrayPrint() {
        int[][] array = new int[8][8];
        array[0][0] = 5;
        array[0][1] = 55;
        System.out.println(array[0][1] + array[0][0]);
    }
}


