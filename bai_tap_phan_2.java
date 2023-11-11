package com.dqk;

import java.util.Scanner;

public class bai_tap_phan_2 {
    public static final Scanner sc = new Scanner(System.in);

    public static final int maxSize = 100;

    public static int[] a = new int[maxSize];

    public static int[] b = new int[maxSize];

    public static int n;
    public static int c;

    public static void main(String[] args) {
        System.out.print("Nhap so luong phan tu mang :");
        n = sc.nextInt();
        a = new int[n];

        nhapMang(a, n);

        // sinhSoNgauNhien(a, n);
        System.out.print("DANH SACH MANG LUU TRU:");
        xuatMang(a, n);

        // System.out.print("Nhap gia tri x can tim :");
        // int x = sc.nextInt();

        // int kq = timKiem(a, n, x);
        // if (kq != -1) {
        // System.out.println("Vi tri xuat hien cua " + x + " la " + kq);
        // } else {
        // System.out.println("Khong co gia tri " + x);
        // }

        // demTanSuatXuatHien(a, n);

        // boolean rs = xoaGiaTriTimDuoc(a, n, x);
        // if (rs == true) {
        // System.out.println("Xoa thanh cong!!!");
        // } else {
        // System.out.println("Xoa khong thanh cong!!!");
        // }
        // xuatMang(b, c);

        // inSoChinhPhuong_SoNguyenTo(a, n);

        System.out.print("DANH SACH SAU KHI SAP XEP:");

        sapXepViTri(a, n);

        System.out.print("DANH SACH SAU KHI DAO NGUOC:");

        daoNguocMang(a, n);

    }

    public static void nhapMang(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri a[" + i + "] :");
            a[i] = sc.nextInt();
        }
    }

    public static void xuatMang(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void sinhSoNgauNhien(int a[], int n) {
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 100 + 1);
        }
    }

    public static int timKiem(int a[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void demTanSuatXuatHien(int a[], int n) {
        // dung phuong thuc nhap mang de kiem tra
        int[] b = new int[maxSize];

        for (int i = 0; i < n; i++) {
            b[a[i]]++;
        }

        for (int i = 0; i < n; i++) {
            if (b[a[i]] > 0) {
                System.out.println(a[i] + " xuat hien " + b[a[i]] + " lan");
                b[a[i]] = 0;
            }
        }
    }

    public static boolean xoaGiaTriTimDuoc(int a[], int n, int x) {
        int kq = timKiem(a, n, x);
        b = new int[n];
        c = 0;
        if (kq != -1) {
            for (int i = 0; i < n; i++) {
                if (i != kq) {
                    b[c] = a[i];
                    c++;
                }

            }
            return true;
        }
        return false;
    }

    // phuong thuc kiem tra so nguyen to
    public static boolean soNguyenTo(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // phuong thuc kiem tra so chinh phuong
    public static boolean soChinhPhuong(int n) {
        int num = (int) Math.sqrt(n);
        return num * num == n;
    }

    public static void inSoChinhPhuong_SoNguyenTo(int a[], int n) {
        // so nguyen to ;
        boolean kt = false;

        System.out.print("CAC SO NGUYEN TO LA :");
        for (int i = 0; i < n; i++) {
            if (soNguyenTo(a[i])) {
                System.out.print(a[i] + " ");
                kt = true;
            }
        }
        System.out.println();
        if (kt == false) {
            System.out.println("NOT FOUND");
        }

        // so chinh phuong
        System.out.print("CAC SO CHINH PHUONG LA :");
        for (int i = 0; i < n; i++) {
            if (soChinhPhuong(a[i])) {
                System.out.print(a[i] + " ");
                kt = true;
            }
        }
        System.out.println();
        if (kt == false) {
            System.out.println("NOT FOUND");
        }

    }

    public static void sapXepViTri(int a[], int n) {
        for (int i = 0; i < n; i += 2) {
            for (int j = i + 2; j < n; j += 2) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = 1; i < n; i += 2) {
            for (int j = i + 2; j < n; j += 2) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        xuatMang(a, n);
    }

    public static void daoNguocMang(int a[], int n) {
        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }
        xuatMang(a, n);
    }

}
