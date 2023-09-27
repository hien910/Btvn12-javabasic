package bai10;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("nhập chuỗi s2: ");
        String s2 = new Scanner(System.in).nextLine();

        System.out.println("nhập chuỗi s1: ");
        String s1 = new Scanner(System.in).nextLine();
        if (s2.contains(s1)){
            System.out.println(s2.replace(s1,""));
        } else {
            System.out.println("-1");
        }


    }
//

}
