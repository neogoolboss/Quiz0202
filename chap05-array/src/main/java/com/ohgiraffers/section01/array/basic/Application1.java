package com.ohgiraffers.section01.array.basic;

public class Application1 {

    public static void main(String[] args) {

        /* 길이가 10인 정수형 배열을 선언 및 할당한 뒤
         * 각 인덱스에 차례대로 1부터 10까지 값을 넣고 출력하세요
         * */

        System.out.println("--- 1번째 방법 ---");
        int[] iarr = new int[10];
        iarr[0] = 1;
        iarr[1] = 2;
        iarr[2] = 3;
        iarr[3] = 4;
        iarr[4] = 5;
        iarr[5] = 6;
        iarr[6] = 7;
        iarr[7] = 8;
        iarr[8] = 9;
        iarr[9] = 10;


        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        System.out.println("--- 2번째 방법 ---");

        int[] iarr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr2[i] + " ");
        }

    }

}
