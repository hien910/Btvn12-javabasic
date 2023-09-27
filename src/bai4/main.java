package bai4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi bất kì");
        String a = new Scanner(System.in).nextLine();
        String[] strings = a.split(" ");

        String str2 = strings[0];
        for (int i = 0; i < strings.length; i++) {
            if (str2.length()<strings[i].length()){
                str2=strings[i];
            }
        }
        System.out.println("Từ dài nhất trong chuỗi là :" + str2 + "\nXuất hiện ở vị trí thứ "+ a.indexOf(str2));

    }
}
