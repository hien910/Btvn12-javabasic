package bai3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi bất kì");
        String input = new Scanner(System.in).nextLine().trim().replaceAll("\\s+", " ");;
        String[] str = input.split(" ");
        chuoiChuan(str);
    }

    private static void chuoiChuan(String[] str1) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j <str1[i].length() ; j++) {
                char c = str1[i].charAt(j);
                if (j==0){
                    stringBuilder.append(Character.toUpperCase(c));
                }
                if (j!=0) {
                    stringBuilder.append(Character.toLowerCase(c));
                }
            }
            stringBuilder.append(" ");

        }
        System.out.println(stringBuilder);
    }
}
