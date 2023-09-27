package bai2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("nhập vào 1 chuỗi: ");
        String a = new Scanner(System.in).nextLine();
        vietHoaXenKe(a);
        System.out.println(vietHoaXenKe(a));



    }
    public static String vietHoaXenKe(String a){
        char[] b = a.toUpperCase().toCharArray();
        char[] c = a.toLowerCase().toCharArray();
        char[] d = new char[b.length];
        for (int i = 0; i < a.length(); i++) {
            if (i%2==0){
                d[i] = b[i];
            } else {
                d[i]=c[i];
            }
        }

        String e = String.valueOf(d);
        return e;
    }
}

