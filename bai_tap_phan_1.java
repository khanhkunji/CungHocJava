package com.dqk;

import java.util.Scanner;

public class bai_tap_phan_1 {
    public static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // cau1();
        // cau2();
        // cau3();
        // cau4();
        // cau5();
        // cau6();
        // cau7();
        // cau8();
        // cau9();
        // cau10();
    }

    public static void cau1() {
        System.out.print("Nhap a = ");
        int a = s.nextInt();
        System.out.print("Nhap b = ");
        int b = s.nextInt();

        System.out.println("Tong = " + (a + b));
        System.out.println("Hieu = " + (a - b));
        System.out.println("Tich = " + (a * b));
        if (b == 0) {
            System.out.println("Error math");
        } else {
            System.out.printf("Thuong = %.1f", (double) a / (double) b);
        }
    }

    public static void cau2() {
        System.out.print("Nhap vao mot so :");
        int n = s.nextInt();
        String kq1 = n > 0 ? "duong" : "am";
        String kq2 = n % 2 == 0 ? "chan" : "le";
        System.out.println("Gia tri vua nhap la " + kq1 + " " + kq2);
    }

    public static void cau3() {
        System.out.print("Nhap a = ");
        int a = s.nextInt();
        System.out.print("Nhap b = ");
        int b = s.nextInt();
        System.out.println("Lon nhat la " + Math.max(a, b));
        System.out.println("Be nhat la " + Math.min(a, b));
    }

    public static void cau4() {
        System.out.print("Nhap a =");
        int a = s.nextInt();

        if (a < 2) {
            System.out.println("khong phai so nguyen to!!!");
        } else {
            boolean kq = false;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    kq = true;
                }
            }
            if (kq == false) {
                System.out.println("la so nguyen to!!!");
            } else {
                System.out.println("khong phai so nguyen to!!!");
            }
        }
    }

    public static void cau5() {
        System.out.print("Nhap a = ");
        int a = s.nextInt();
        int b = a;
        int kq = 0;
        while (a > 0) {
            int t = a % 10;
            kq += t;
            a /= 10;
        }
        System.out.println("Tong cac gia tri cua " + b + " la " + kq);
    }

    public static void cau6() {
        System.out.print("Nhap a = ");
        int a = s.nextInt();
        int b = a;
        int kq = 0;
        while (a > 0) {
            kq++;
            a /= 10;
        }
        System.out.println("So luong chu so cua " + b + " la " + kq);
    }

    public static void cau7() {
        System.out.print("Nhap a = ");
        int a = s.nextInt();
        long kq = 1;
        for (int i = 1; i <= a; i++) {
            kq *= i;
        }
        System.out.println("Giai thua cua " + a + " " + kq);
    }

    public static void cau8() {
        System.out.print("Nhap a = ");
        int a = s.nextInt();
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                if (i != (a / i)) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(a / i + " ");
                }
            }
        }
    }

    public static void cau9() {
        System.out.print("Nhap a = ");
        int a = s.nextInt();
        int b = a;
        int palind = 0;
        while (a != 0) {
            int t = a % 10;
            palind = palind * 10 + t;
            a /= 10;
        }
        if (b == palind)
            System.out.println("la so  palindrome");
        else
            System.out.println("khong phai so palindrome");
    }

    public static void cau10() {
        System.out.print("Nhap a = ");
        int a = s.nextInt();

        int tongChan = 0, tongLe = 0;
        int i = 1;
        while (i <= a) {
            if (i % 2 == 0) {
                tongChan += i;
            } else {
                tongLe += i;
            }
            i++;
        }
        System.out.printf("Tong chan = %s\nTong le = %s\n", tongChan, tongLe);
    }

}
