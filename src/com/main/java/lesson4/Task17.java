package com.main.java.lesson4;

public class Task17 {
    public static void main(String[] args) {
        int[][] butterfly = new int[5][5];
        for (int i = 0; i < butterfly.length; i++) {
            for (int j = 0; j < butterfly[i].length; j++) {
                if ((i > j) && (i < butterfly.length / 2)) {
                    butterfly[i][j] = 0;
                } else if ((i < j) && (i > butterfly.length / 2)) {
                    butterfly[i][j] = 0;
                } else if ((i > j) && (j < (butterfly[i].length - i - 1))) {
                    butterfly[i][j] = 0;
                } else if ((i < j) && (j > butterfly[i].length - i - 1)) {
                    butterfly[i][j] = 0;
                } else{
                    butterfly[i][j] = 1;
                }
                System.out.print(butterfly[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
