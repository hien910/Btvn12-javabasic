package bai1;

public class main {
    public static void main(String[] args) {
        System.out.println("Các số thuận nghịch có 6 chữ số: ");
        for (int i = 100000; i <1000000 ; i++) {
            if (coLaThuanNghich(i)){
                System.out.println(i);
            }
        }

    }
    public static boolean coLaThuanNghich(int n){
        String a = String.valueOf(n);
        for (int i = 0; i < ((a.length())/2); i++) {
            if(a.charAt(i) != a.charAt(a.length()-i-1) ){
                return false;
            }
        }
        return true;
    }
}
