package bai7;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("nhập chuỗi s2: ");
        String s2 = new Scanner(System.in).nextLine();

        System.out.println("nhập chuỗi s1: ");
        String s1 = new Scanner(System.in).nextLine();
        String s3 = null;
        if (s1.contains(s2)) {
            s3 = s1.replace(s2, "");
        }
        System.out.println(s3);

    }
}
