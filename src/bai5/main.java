package bai5;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("nhập xâu(họ đệm tên): ");
        String a = new Scanner(System.in).nextLine();
        sapXep(a);

    }
    private static void sapXep(String str) {
        String[] s;
        s = str.split(" ");
        String str2 ;
        for (int i = s.length-1; i > 0 ; i--) {
            str2=s[i];
            s[i]=s[i-1];
            s[i-1]=str2;
        }
        System.out.println(Arrays.toString(s));
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            stringBuilder.append(s[i]).append(" ");
        }
        System.out.println(stringBuilder);


    }
}
