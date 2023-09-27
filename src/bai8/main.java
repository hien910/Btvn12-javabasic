package bai8;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("nhập chuỗi s2: ");
        String s2 = new Scanner(System.in).nextLine();

        System.out.println("nhập chuỗi s1: ");
        String s1 = new Scanner(System.in).nextLine();
        System.out.println("chuỗi s1 xuất hiện đầu tiên trong s2 ở vị trí: "+s2.indexOf(s1));
    }
}
