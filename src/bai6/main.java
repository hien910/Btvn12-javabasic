package bai6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("nhập xâu: ");
        String a = new Scanner(System.in).nextLine();
        sapXep(a);
    }

    private static void sapXep(String str) {
        String[] s;
        s = str.split(" ");
        for (int i = 0; i < s.length - 1; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i].compareToIgnoreCase(s[j]) > 0) {
                    String s2 = s[i];
                    s[i] = s[j];
                    s[j] = s2;
                }
            }
        }
        for (String s1 : s
        ) {
            System.out.print(s1 +" ");
        }

    }
}
