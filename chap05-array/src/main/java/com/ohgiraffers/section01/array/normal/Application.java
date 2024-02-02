package com.ohgiraffers.section01.array.normal;

public class Application {

    public static void main(String[] args) {

        /* 행의 길이가 3, 열의 길이가 4인 정수형 2차원 배열을 선언 및 할당하고,
         * 각 인덱스에 차례대로 1부터 12까지의 정수를 대입한 뒤
         * 그 값을 출력하는 코드를 작성하시오.
         *
         * -- 출력 예시 --
         * 1  2  3  4
         * 5  6  7  8
         * 9 10 11 12
         *
         * 단, 출력물의 줄맞춤은 신경쓰지 말고 풀어보세요
         * */

        System.out.println("--- 1번 방법 ---");
        int[][] iarr = new int[3][5];
        iarr[0][0] = 1;
        iarr[0][1] = 2;
        iarr[0][2] = 3;
        iarr[0][3] = 4;
        iarr[0][4] = 5;

        iarr[1][0] = 6;
        iarr[1][1] = 7;
        iarr[1][2] = 8;
        iarr[1][3] = 9;
        iarr[1][4] = 10;

        iarr[2][0] = 11;
        iarr[2][1] = 12;
        iarr[2][2] = 13;
        iarr[2][3] = 14;
        iarr[2][4] = 15;

        System.out.print(iarr[0][0] + " ");
        System.out.print(iarr[0][1] + " ");
        System.out.print(iarr[0][2] + " ");
        System.out.print(iarr[0][3] + " ");
        System.out.print(iarr[0][4] + " ");
        System.out.println();

        System.out.print(iarr[1][0] + " ");
        System.out.print(iarr[1][1] + " ");
        System.out.print(iarr[1][2] + " ");
        System.out.print(iarr[1][3] + " ");
        System.out.print(iarr[1][4] + " ");
        System.out.println();

        System.out.print(iarr[2][0] + " ");
        System.out.print(iarr[2][1] + " ");
        System.out.print(iarr[2][2] + " ");
        System.out.print(iarr[2][3] + " ");
        System.out.print(iarr[2][4] + " ");
        System.out.println();

        System.out.println("--- 2번 방법 ---");

        int[][] arr2 = new int[3][5];

        int plusNumber = 1;

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = plusNumber++;
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();

        }

    }
}
