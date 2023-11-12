package com.dqk;

import java.util.Scanner;

public class bai_tap_phan_2_2 {
    public static final Scanner sc = new Scanner(System.in);

    public static int dong;

    public static int cot;

    public static final int MAX_DONG = 10;

    public static final int MAX_COT = 10;

    public static final int a[][] = new int[MAX_DONG][MAX_COT];

    public static final int b[] = new int[MAX_DONG * MAX_COT];

    public static void main(String[] args) {
        // kiem tra dau vao dong va cot
        do {
            System.out.print("Nhap dong = ");
            dong = sc.nextInt();
            System.out.print("Nhap cot = ");
            cot = sc.nextInt();
            if (dong < 1 || cot < 1) {
                System.out.println("Nhap sai , nhap lai!!!");
            }
        } while (dong < 1 || cot < 1);

        nhapMang(a, dong, cot);

        System.out.println("MANG HIEN TAI");
        xuatMang(a, dong, cot);

        // System.out.println("TONG GIA TRI TUNG DONG");
        // tongDong(a, dong, cot);
        // System.out.println("TICH GIA TRI TUNG COT");
        // tichCot(a, dong, cot);

        // System.out.println("CAC GIA TRI NHIEU CHU SO");
        // inGiaTriCoHaiChuSo(a, dong, cot);

        // System.out.print("Nhap x = ");
        // int x = sc.nextInt();
        // inSoChiaHetChoGiaTri(a, dong, cot, x);

        kiemTraUocSo(a, b, dong, cot);

    }

    public static void nhapMang(int a[][], int dong, int cot) {
        for (int i = 0; i < dong; i++) {
            System.out.print("Nhap " + cot + " gia tri cho dong thu " + i + " : ");
            for (int j = 0; j < cot; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    public static void xuatMang(int a[][], int dong, int cot) {
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void tongDong(int a[][], int dong, int cot) {
        for (int i = 0; i < dong; i++) {
            int sum = 0;
            for (int j = 0; j < cot; j++) {
                sum += a[i][j];
            }
            System.out.println("Tong gia tri dong " + i + " la " + sum);
        }
    }

    public static void tichCot(int a[][], int dong, int cot) {
        for (int i = 0; i < cot; i++) {
            int tich = 1;
            for (int j = 0; j < dong; j++) {
                tich *= a[j][i];
            }
            System.out.println("Tich gia tri cot " + i + " " + tich);
        }
    }

    public static boolean kiemTraChuSo(int n) {
        if (n > 9) {
            int d = 1;
            while (n > 0) {
                d++;
                n /= 10;
            }
            if (d > 1) {
                return true;
            }
        }
        return false;
    }

    public static void inGiaTriCoHaiChuSo(int a[][], int dong, int cot) {
        boolean rs = false;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (kiemTraChuSo(a[i][j])) {
                    System.out.print(a[i][j] + " ");
                    rs = true;
                }
            }
        }
        if (rs == false) {
            System.out.println("NOT FOUND!!!");
        }
    }

    public static boolean primeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void inSoChiaHetChoGiaTri(int a[][], int dong, int cot, int x) {
        boolean rs = false;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (a[i][j] % x == 0) {
                    if (primeNumber(a[i][j]) == false && primeNumber(a[i][j + 1]) == false) {
                        System.out.print(a[i][j] + " ");
                        rs = true;
                    }
                }
            }
        }
        if (rs == false) {
            System.out.println("NOT FOUND");
        }
    }

    public static void kiemTraUocSo(int a[][], int b[], int dong, int cot) {
        int idx = 0;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                b[idx++] = a[i][j];
            }
        }

        // uoc so la cac so ma duoc chia het cho mot so .Ngoai tru 1 va chinh no.
        // Vi du: 6 -> 2 3

        boolean rs = false;
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx; j++) {
                if (b[i] % b[j] == 0 && (b[j] > 1 && b[j] < b[i])) {
                    System.out.println(b[j] + " la uoc so cua " + b[i]);
                    rs = true;
                }
            }
        }
        if (rs == false) {
            System.out.println("NOT FOUND!!!");
        }

    }
}
